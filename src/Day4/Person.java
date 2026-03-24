package Day4;
import java.util.ArrayList;

public class Person {
    private String         name;
    private ArrayList<Problem>  problems;

    public Person(String name) {
        this.name = name;
        this.problems = new ArrayList<>();
    }

    public void addProblem(String name, Problem.ProblemType type) {
        Problem problem = new Problem(name, type);
        problems.add(problem);
    }

    public ArrayList<Problem> getProblems() {
        return problems;
    }

    public void solveProblem(String name) {
        for (Problem problem : problems) {
            if (problem.getName().equalsIgnoreCase(name)) {
                problem.solveProblem();
            }
        }
    }

    public int countUnsolvedProblems(){
        return problems.size();
    }

    public void viewUnsolvedProblems(){
        System.out.println("Unsolved Problems:");
        for (Problem problem : problems) {
            if (!problem.isSolved()) System.out.printf("%s (%s) %n", problem.getName(), problem.getType());
        }
    }

    public void viewAllProblems(){
        System.out.println("All problems:");
        for (Problem problem : problems) {
            System.out.printf("%s (%s) - %s %n", problem.getName(), problem.getType(), (problem.isSolved() ? "Solved" : "Unsolved"));
        }
    }
}
