package Day4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KataTest {
    @Test
    public void addTwoNumbersReturnCorrectResult_Test() {
        assertEquals(4, Kata.add(1, 3));
    }

    @Test
    public void addThreeNumbersReturnCorrectResult_Test() {
        assertEquals(8, Kata.add(1, 3, 4));
    }

    @Test
    public void addNumbersReturnCorrectResult_Test() {
        assertEquals(30, Kata.add(1, 3, 4, 2, 5, 4, 7, 3, 1));
    }

    @Test
    public void addNumbersInListReturnCorrectResult_Test() {
        int[] numbersList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(55, Kata.add(numbersList));
    }

    @Test
    public void FoodScheduleConstructor_Test() {
        Kata.FoodSchedule day = Kata.FoodSchedule.MONDAY;
    }

    @Test
    public void addTwoNumbersInListReturnCorrectResult_Test() {
        for (var days : Kata.FoodSchedule.values()) {
            System.out.println(days.name() + " " + days);
        }
    }
}
