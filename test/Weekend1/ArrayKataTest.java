package Weekend1;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
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

    @Test
    public void sumOfOddNumbers_Array1_Is25Test() {
        assertEquals(25, sumOfOddNumbersIn(numbers1));
    }

    @Test
    public void sumOfOddNumbers_Array2_Is5Test() {
        assertEquals(5, sumOfOddNumbersIn(numbers2));
    }

    @Test
    public void minAndMax_Array1_Test() {
        int[] minMax = {1, 9};
        boolean isEqual = Arrays.equals(minMax, maximumAndMinimumOf(numbers1));
        assertTrue(isEqual);
    }

    @Test
    public void minAndMax_Array1_FalseTest() {
        int[] minMax = {1, 5};
        boolean isEqual = Arrays.equals(minMax, maximumAndMinimumOf(numbers1));
        assertFalse(isEqual);
    }

    @Test
    public void minAndMax_Array2_Test() {
        int[] minMax = {5, 20};
        boolean isEqual = Arrays.equals(minMax, maximumAndMinimumOf(numbers2));
        assertTrue(isEqual);
    }

    @Test
    public void noOfOddNumbers_Array1_Is5Test() {
        assertEquals(5, noOfOddNumbersIn(numbers1));
    }

    @Test
    public void noOfOddNumbers_Array2_Is1Test() {
        assertEquals(1, noOfOddNumbersIn(numbers2));
    }

    @Test
    public void noOfEvenNumbers_Array1_Is4Test() {
        assertEquals(4, noOfEvenNumbersIn(numbers1));
    }

    @Test
    public void noOfEvenNumbers_Array2_Is2Test() {
        assertEquals(2, noOfEvenNumbersIn(numbers2));
    }

    @Test
    public void evenNumbers_InArray1Test() {
        int[] evenNumbers = {2, 4, 6, 8};
        boolean isEqual = Arrays.equals(evenNumbers, evenNumbersIn(numbers1));
        assertTrue(isEqual);
    }

    @Test
    public void evenNumbers_InArray2Test() {
        int[] evenNumbers = {20, 10};
        boolean isEqual = Arrays.equals(evenNumbers, evenNumbersIn(numbers2));
        assertTrue(isEqual);
    }

    @Test
    public void oddNumbers_InArray1Test() {
        int[] oddNumbers = {1, 3, 5, 7, 9};
        boolean isEqual = Arrays.equals(oddNumbers, oddNumbersIn(numbers1));
        assertTrue(isEqual);
    }

    @Test
    public void oddNumbers_InArray2Test() {
        int[] oddNumbers = {5};
        boolean isEqual = Arrays.equals(oddNumbers, oddNumbersIn(numbers2));
        assertTrue(isEqual);
    }

    @Test
    public void squaredNumbers_InArray1Test() {
        int[] squaredNumbers = {1, 4, 9, 16, 25, 36, 49, 64, 81};
        boolean isEqual = Arrays.equals(squaredNumbers, squareNumbersIn(numbers1));
        assertTrue(isEqual);
    }

    @Test
    public void squaredNumbers_InArray2Test() {
        int[] squaredNumbers = {400, 25, 100};
        boolean isEqual = Arrays.equals(squaredNumbers, squareNumbersIn(numbers2));
        assertTrue(isEqual);
    }
}
