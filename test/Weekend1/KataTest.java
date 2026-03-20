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
        assertEquals(0, Kata.positiveDifference(4,4));
    }

    @Test
    public void absoluteDifference_Between3And7Test() {
        assertEquals(4, Kata.positiveDifference(3,7));
    }

    @Test
    public void absoluteDifference_Between9And2Test() {
        assertEquals(7, Kata.positiveDifference(9,2));
    }

    @Test
    public void quotient_Between96And2Test() {
        assertEquals(48, Kata.divide(96,2));
    }

    @Test
    public void quotient_DivideByZeroTest() {
        assertEquals(0, Kata.divide(96,0));
    }

}
