package Weekend1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KataTest {
    @Test
    public void sixIsEvenTest() {
        assertTrue(Kata.isEven(6));
    }

    @Test
    public void fiveIsEvenTest() {
        assertFalse(Kata.isEven(5));
    }
}
