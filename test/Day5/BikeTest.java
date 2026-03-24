package Day5;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    private Bike bike;

    @BeforeEach
    public void setUp() {
        bike = new Bike();
    }

    @Test
    public void newBike_ShouldBeOff_Test() {
        assertFalse(bike.isOn());
    }

    @Test
    public void newBike_ShouldStartAtZero_Test() {
        assertFalse(bike.isOn());
        assertEquals(0, bike.getSpeed());
        assertEquals(0, bike.getGear());
    }

    @Test
    public void turnBikeOn_ShouldBeOn_Test() {
        bike.turnOn();
        assertTrue(bike.isOn());
    }

    @Test
    public void turnBikeOff_ShouldBeOff_Test() {
        bike.turnOn();
        bike.turnOff();
        assertFalse(bike.isOn());
    }

    @Test
    public void accelerateWhenBikeIsOff_DoNothing_Test() {
        bike.accelerate();
        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void accelerateWhenBikeIsOn_IncreaseSpeedAndGear_Test() {
        bike.turnOn();
        bike.accelerate();
        assertEquals(1, bike.getSpeed());
        assertEquals(1, bike.getGear());
    }

    @Test
    public void accelerateBikeToGear2_Test() {
        bike.turnOn();
        for (int i=1;i <= 21; i++) bike.accelerate();
        assertEquals(21, bike.getSpeed());
        assertEquals(2, bike.getGear());
    }

    @Test
    public void accelerateBikeToGear3_Test() {
        bike.turnOn();
        for (int i=1;i <= 27; i++) bike.accelerate();
        assertEquals(34, bike.getSpeed());
        assertEquals(3, bike.getGear());
    }

    @Test
    public void accelerateBikeToGear4_Test() {
        bike.turnOn();
        for (int i=1;i <= 30; i++) bike.accelerate();
        assertEquals(43, bike.getSpeed());
        assertEquals(4, bike.getGear());
    }

    @Test
    public void decelerateWhenBikeIsOff_DoNothing_Test() {
        bike.decelerate();
        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void decelerateWhenBikeIsOn_DecreaseSpeedAndGear_Test() {
        bike.turnOn();
        bike.accelerate(); bike.accelerate(); bike.accelerate();
        assertEquals(3, bike.getSpeed());
        assertEquals(1, bike.getGear());
        bike.decelerate();
        assertEquals(2, bike.getSpeed());
    }

    @Test
    public void decelerateBikeFromGear2_Test() {
        bike.turnOn();
        for (int i=1;i <= 21; i++) bike.accelerate();
        assertEquals(21, bike.getSpeed());
        assertEquals(2, bike.getGear());
        bike.decelerate();
        assertEquals(19, bike.getSpeed());
        assertEquals(1, bike.getGear());
    }

    @Test
    public void decelerateBikeFromGear3_Test() {
        bike.turnOn();
        for (int i=1;i <= 26; i++) bike.accelerate();
        assertEquals(31, bike.getSpeed());
        assertEquals(3, bike.getGear());
        bike.decelerate();
        assertEquals(28, bike.getSpeed());
        assertEquals(2, bike.getGear());
    }

    @Test
    public void decelerateBikeFromGear4_Test() {
        bike.turnOn();
        for (int i=1;i <= 30; i++) bike.accelerate();
        assertEquals(43, bike.getSpeed());
        assertEquals(4, bike.getGear());
        bike.decelerate();
        assertEquals(39, bike.getSpeed());
        assertEquals(3, bike.getGear());
    }

    @Test
    public void decelerateBeyondZero_ErrorTest() {
        bike.turnOn();
        bike.accelerate();
        bike.decelerate(); bike.decelerate();
        assertEquals(0, bike.getSpeed());
        assertEquals(1, bike.getGear());
    }
}
