package Weekend1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KataTest {
    @Test
    public void sixIsEvenTest() {
        assertTrue(Kata.isEven(6));
    }

    @Test
    public void fiveIsOddTest() {
        assertFalse(Kata.isEven(5));
    }

    @Test
    public void oneIsPrimeTest() {
        assertTrue(Kata.isPrime(1));
    }

    @Test
    public void twoIsPrimeTest() {
        assertTrue(Kata.isPrime(2));
    }

    @Test
    public void sixIsNotPrimeTest() {
        assertFalse(Kata.isPrime(6));
    }

    @Test
    public void ThirtyIsNotPrimeTest() {
        assertFalse(Kata.isPrime(30));
    }

    @Test
    public void absoluteDifference_EqualNumbersTest() {
        assertEquals(0, Kata.subtract(4,4));
    }

    @Test
    public void absoluteDifference_Between3And7Test() {
        assertEquals(4, Kata.subtract(3,7));
    }

    @Test
    public void absoluteDifference_Between9And2Test() {
        assertEquals(7, Kata.subtract(9,2));
    }

    @Test
    public void quotient_Between96And2Test() {
        assertEquals(48, Kata.divide(96,2));
    }

    @Test
    public void quotient_Between96And5Test() {
        assertEquals(19.200000762939453, Kata.divide(96,5));
    }

    @Test
    public void quotient_DivideByZeroTest() {
        assertEquals(0, Kata.divide(96,0));
    }

    @Test
    public void quotient_DivideByZero_NegativeTest() {
        assertEquals(4, Kata.divide(-8,-2));
    }

    @Test
    public void numberOfFactors_1Test() {
        assertEquals(1, Kata.factorOf(1));
    }

    @Test
    public void numberOfFactors_10Test() {
        assertEquals(4, Kata.factorOf(10));
    }

    @Test
    public void numberOfFactors_30Test() {
        assertEquals(8, Kata.factorOf(30));
    }

    @Test
    public void isSquare_25Test() {
        assertTrue(Kata.isSquare(25));
    }

    @Test
    public void isSquare_4Test() {
        assertTrue(Kata.isSquare(4));
    }

    @Test
    public void isNotSquare_20Test() {
        assertFalse(Kata.isSquare(20));
    }

    @Test
    public void isPalindrome_54145Test() {
        assertTrue(Kata.isPalindrome(54145));
    }

    @Test
    public void isNotPalindrome_52145Test() {
        assertFalse(Kata.isPalindrome(52145));
    }

    @Test
    public void factorialOfFiveTest() {
        assertEquals(120, Kata.factorialOf(5));
    }

    @Test
    public void factorialOfZeroTest() {
        assertEquals(1, Kata.factorialOf(0));
    }

    @Test
    public void squareOfFiveIs25Test() {
        assertEquals(25, Kata.squareOf(5));
    }

    @Test
    public void squareOfThirtyIs900Test() {
        assertEquals(900, Kata.squareOf(30));
    }

}
