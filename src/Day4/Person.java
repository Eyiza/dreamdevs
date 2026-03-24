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

    public ArrayList<Problem> getProblems() {
        return problems;
    }

}
