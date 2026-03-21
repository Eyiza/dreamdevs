package Weekend1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static Weekend1.ArrayKata.*;

public class ArrayKataTest {
    private int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    private int[] numbers2 = {20, 5, 10};

    @Test
    public void largestNumberInNumbers1Array_Is9Test() {
        assertEquals(9, maximumIn(numbers1));
    }

    @Test
    public void largestNumberInNumbers2Array_Is20Test() {
        assertEquals(20, maximumIn(numbers2));
    }

    @Test
    public void minimumInNumbers1Array_Is1Test() {
        assertEquals(1, minimumIn(numbers1));
    }

    @Test
    public void minimumInNumbers2Array_Is5Test() {
        assertEquals(5, minimumIn(numbers2));
    }

    @Test
    public void sumOfNumbers1Array_Is45Test() {
        assertEquals(45, sumOf(numbers1));
    }

    @Test
    public void sumOfNumbers2Array_Is35Test() {
        assertEquals(35, sumOf(numbers2));
    }

    @Test
    public void sumOfEvenNumbers_Array1_Is20Test() {
        assertEquals(20, sumOfEvenNumbersIn(numbers1));
    }

    @Test
    public void sumOfEvenNumbers_Array2_Is1Test() {
        assertEquals(30, sumOfEvenNumbersIn(numbers2));
    }
}
