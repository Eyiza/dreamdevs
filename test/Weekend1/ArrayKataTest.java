package Weekend1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static Weekend1.ArrayKata.*;

public class ArrayKataTest {
    int[] numbers;

    @Test
    public void largestNumberInArray_Is9Test() {
        numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(9, maximumIn(numbers));
    }

    @Test
    public void largestNumberInArray_Is20Test() {
        numbers = new int[] {20, 5, 10};
        assertEquals(20, maximumIn(numbers));
    }
}
