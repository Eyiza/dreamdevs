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
    public void getProblemsTest() {
        Problem.ProblemType type = Problem.ProblemType.FINANCIAL;
        person.addProblem("My account balance is low", type);

        Problem.ProblemType type2 = Problem.ProblemType.SPIRITUAL;
        person.addProblem("My village people are after me", type2);
        ArrayList<Problem> problems = person.getProblems();

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

        person.viewUnsolvedProblems();
        person.countUnsolvedProblems();
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
        person.viewAllProblems();
    }
}
