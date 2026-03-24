package Day5;
import Day4.Problem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LCMTest {
    @Test
    public void calculateLCM_2NumbersTest() {
        int lcm = LCM.calculateLCM(3, 5);
        assertEquals(15, lcm);
    }

    @Test
    public void calculateLCM_2Numbers_Is5_Test() {
        int lcm = LCM.calculateLCM(5, 5);
        assertEquals(5, lcm);
    }

    @Test
    public void calculateLCM_3NumbersTest() {
        int lcm = LCM.calculateLCM(5, 2, 3);
        assertEquals(30, lcm);
    }

    @Test
    public void calculateLCM_3Numbers_Is300_Test() {
        int lcm = LCM.calculateLCM(50, 20, 30);
        assertEquals(300, lcm);
    }

    @Test
    public void calculateLCM_3Numbers_Negative_Test() {
        int lcm = LCM.calculateLCM(50, -20, 30);
        assertEquals(300, lcm);
    }

    @Test
    public void calculateLCM_4Numbers_Test() {
        int lcm = LCM.calculateLCM(50, 20, 30, 49);
        assertEquals(14700, lcm);
    }

    @Test
    public void calculateLCM_0Test() {
        try {
            int lcm = LCM.calculateLCM(50, 0, 30, 49);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
