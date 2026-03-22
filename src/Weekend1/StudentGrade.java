package Weekend1;
import java.util.Scanner;

public class StudentGrade {
    static int students;
    static int subjects;
    static int[][] scores;
    static int[] totalScores;
    static double[] averages;
    static int[] positions;

    public static void main(String[] args) {
        System.out.println("Welcome to Lagbaja Schools!!!!");

        Scanner inputCollector = new Scanner(System.in);

        System.out.println("How many students do you have?");
        students = inputCollector.nextInt();

        System.out.println("How many subjects do they offer?");
        subjects = inputCollector.nextInt();

        System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>");
        scores = new int[students][subjects];
        totalScores = new int[students];
        averages = new double[students];
        positions = new int[students];
        System.out.println("Saved successfully");

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Entering scores for Student " + (i + 1));
            int total = 0;
            for (int j = 0; j < scores[i].length; j++) {
                int score;
                while (true) {
                    System.out.print("Enter score for subject " + (j + 1) + ": ");
                    score = inputCollector.nextInt();

                    if (score >= 0 && score <= 100) break;
                    else System.out.println("Invalid score! Must be between 0 and 100.");

                }
                System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>");
                scores[i][j] = score;
                total += score;
                System.out.println("Saved successfully");
            }
            totalScores[i] = total;
            averages[i] = (double) total / subjects;
        }

        for (int i = 0; i < students; i++) {
            int position = 1;
            for (int score : totalScores) {
                if (score > totalScores[i]) position++;
            }
            positions[i] = position;
        }

        printSummary();
    }

    static void printSummary(){
        printStudentSummary();
        printSubjectSummary();
        printClassSummary();
    }

    static void printStudentSummary() {
        System.out.println("==========================================================");
        System.out.print("STUDENT     ");
        for (int j = 0; j < subjects; j++) {
            System.out.printf("SUB%d      ", (j + 1));
        }
        System.out.println("TOT     AVE     POS");
        System.out.println("==========================================================");

        for (int i = 0; i < students; i++) {
            System.out.printf("Student %d      ",(i + 1));
            for (int j = 0; j < subjects; j++) {
                System.out.printf("%d      ", scores[i][j]);
            }
            System.out.printf("%d      %.2f      %d\n", totalScores[i], averages[i], positions[i]);
        }
        System.out.println(""" 
                ==========================================================
                ==========================================================
                """);
    }

    static void printSubjectSummary() {
        int hardestSubject = 0;
        int maxFailures = -1;

        int easiestSubject = 0;
        int maxPasses = -1;

        int overallHighestScoringStudent = 0;
        int highestScoredSubject = 0;
        int overallHighestScore = 0;

        int overallLowestScoringStudent = 0;
        int lowestScoredSubject = 0;
        int overallLowestScore = 100;

        System.out.println(""" 
                                       SUBJECT SUMMARY
                """);

        String individualSubjectSummary = """
                Subject %d
                Highest scoring student is: Student %d scoring %d
                Lowest scoring student is: Student %d scoring %d
                Total Score is: %d
                Average Score is: %.2f
                Number of passes: %d
                Number of fails: %d
                
                """;

        for (int j = 0; j < subjects; j++) {
            int totalScore = 0;
            int fails = 0;
            int passes = 0;
            int highestScore = scores[0][j];
            int lowestScore = scores[0][j];
            int highestScoringStudent = 1;
            int lowestScoringStudent = 1;

            for (int i = 0; i < students; i++) {
                int score = scores[i][j];

                if (score > highestScore) {
                    highestScore = score;
                    highestScoringStudent = i + 1;
                }
                if (score < lowestScore) {
                    lowestScore = score;
                    lowestScoringStudent = i + 1;
                }

                totalScore += score;

                if (score >= 50) passes++;
                else fails++;
            }

            double average = (double) totalScore / students;

            System.out.printf(individualSubjectSummary, j + 1,
                    highestScoringStudent, highestScore, lowestScoringStudent, lowestScore,
                    totalScore, average, passes, fails);

            if (passes > maxPasses) {
                maxPasses = passes;
                easiestSubject = j + 1;
            }

            if (fails > maxFailures) {
                maxFailures = fails;
                hardestSubject = j + 1;
            }

            if (highestScore > overallHighestScore) {
                overallHighestScore = highestScore;
                overallHighestScoringStudent = highestScoringStudent;
                highestScoredSubject = j + 1;
            }

            if (lowestScore < overallLowestScore) {
                overallLowestScore = lowestScore;
                overallLowestScoringStudent = lowestScoringStudent;
                lowestScoredSubject = j + 1;
            }
        }

        String subjectSummary = """
                ==========================================================
                The hardest subject is Subject %d with %d failures
                The easiest subject is Subject %d with %d passes
                The overall Highest score is scored by Student %d in subject %d scoring %d
                The overall Lowest score is scored by Student %d in subject %d scoring %d
                ==========================================================
                
                """;
        System.out.printf(subjectSummary,
                hardestSubject, maxFailures, easiestSubject, maxPasses,
                overallHighestScoringStudent, highestScoredSubject, overallHighestScore,
                overallLowestScoringStudent, lowestScoredSubject, overallLowestScore);

    }

    static void printClassSummary(){
        int bestGraduatingStudent = 1;
        int bestGraduatingScore = totalScores[0];

        int worstGraduatingStudent = 1;
        int worstGraduatingScore = totalScores[0];

        int classTotal = 0;

        for (int i = 0; i < students; i++) {
            int totalScore = totalScores[i];
            if (totalScore > bestGraduatingScore) {
                bestGraduatingScore = totalScore;
                bestGraduatingStudent = i + 1;
            }
            if (totalScore < worstGraduatingScore) {
                worstGraduatingScore = totalScore;
                worstGraduatingStudent = i + 1;
            }
            classTotal += totalScore;
        }

        double classAverage = (double) classTotal / students;

        String classSummary = """
                                CLASS SUMMARY
        ==========================================================
        Best Graduating Student is: Student %d scoring %d
        ==========================================================
        
        !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        Worst Graduating Student is: Student %d scoring %d
        !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        
        ==========================================================
        Class total score is: %d
        Class Average Score is: %.2f
        ==========================================================
        """;
        System.out.printf(classSummary,
                bestGraduatingStudent, bestGraduatingScore, worstGraduatingStudent, worstGraduatingScore,
                classTotal, classAverage);
    }
}
