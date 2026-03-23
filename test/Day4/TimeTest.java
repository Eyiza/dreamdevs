package Day4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TimeTest {
    @Test
    public void testTime() {
        try {
            Time time = new Time(112, 30, 0);
        }
        catch (IllegalArgumentException e) {
            System.out.println("I was caught");
        }
        catch (Exception e) { // For all exceptions you are not anticipating.
            System.out.println("I was caught");
        }
        finally {
            System.out.println("I am complete");
        }

    }
}
