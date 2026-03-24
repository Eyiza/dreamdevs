package Day4;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PersonProblemTest {
    private Person person;

    @BeforeEach // Creates a new stack for each test
    public void setUp() {
        person = new Person("John");
    }

    @Test
    public void addProblemTest() {
        Problem.ProblemType type = Problem.ProblemType.FINANCIAL;
        person.addProblem("My account balance is low", type);
    }

    @Test
    public void solveProblemTest() {
        Problem.ProblemType type = Problem.ProblemType.FINANCIAL;
        person.addProblem("My account balance is low", type);

        Problem.ProblemType type2 = Problem.ProblemType.SPIRITUAL;
        person.addProblem("My village people are after me", type2);
        person.solveProblem("My account balance is low");
    }

    @Test
    public void countUnsolvedProblemsTest() {
        Problem.ProblemType type = Problem.ProblemType.FINANCIAL;
        person.addProblem("My account balance is low", type);

        Problem.ProblemType type2 = Problem.ProblemType.SPIRITUAL;
        person.addProblem("My village people are after me", type2);

        assertEquals(2, person.countUnsolvedProblems());
    }

    @Test
    public void viewUnsolvedProblemsTest() {
        Problem.ProblemType type = Problem.ProblemType.FINANCIAL;
        person.addProblem("My account balance is low", type);

        Problem.ProblemType type2 = Problem.ProblemType.SPIRITUAL;
        person.addProblem("My village people are after me", type2);

        System.out.println("Unsolved Problems:");
        for (Problem problem : person.getProblems()) {
            if (!problem.isSolved()) System.out.printf("%s (%s) %n", problem.getName(), problem.getType());
        }
    }

    @Test
    public void viewAllProblemsTest() {
        Problem.ProblemType type = Problem.ProblemType.FINANCIAL;
        person.addProblem("My account balance is low", type);

        type = Problem.ProblemType.SPIRITUAL;
        person.addProblem("My village people are after me", type);

        type = Problem.ProblemType.EDUCATION;
        person.addProblem("My grades in school are not too well", type);

        person.solveProblem("My account balance is low");

        System.out.println("All problems:");

        for (Problem problem: person.getProblems()) {
            System.out.printf("%s (%s) - %s %n", problem.getName(), problem.getType(), (problem.isSolved() ? "Solved" : "Unsolved"));
        }
    }
}
