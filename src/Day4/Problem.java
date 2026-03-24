package Day4;

import java.util.Scanner;

public class Problem {
    private String name;
    private ProblemType type;
    private boolean isSolved;

    public enum ProblemType {
        FINANCIAL, SPIRITUAL, EDUCATION, BUSINESS, TECHNICAL;
    }

    public Problem(String name, ProblemType type) {
        this.name = name;
        this.type = type;
        this.isSolved = false;
    }

    public String getName() {
        return name;
    }

    public ProblemType getType() {
        return type;
    }

    public boolean isSolved() {
        return isSolved;
    }

    public void solveProblem() {
        this.isSolved = true;
    }
}
