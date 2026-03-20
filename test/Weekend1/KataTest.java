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

}
