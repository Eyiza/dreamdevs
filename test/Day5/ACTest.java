package Day5;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ACTest extends Device{
    private AC airConditioner;

    @BeforeEach
    public void setup(){
        airConditioner = new AC();
    }

    @Test
    public void newAC_ShouldBeOff_Test() {
        assertFalse(airConditioner.isOn());
    }

    @Test
    public void newAC_HasDefaultTemperature_Test() {
        assertEquals(16, airConditioner.getTemperature());
    }

    @Test
    public void turnACOn_ShouldBeOn_Test() {
        airConditioner.turnOn();
        assertTrue(airConditioner.isOn());
    }

    @Test
    public void turnACOff_ShouldBeOff_Test() {
        airConditioner.turnOn();
        assertTrue(airConditioner.isOn());
        airConditioner.turnOff();
        assertFalse(airConditioner.isOn());
    }

    @Test
    public void increaseTempWhenACIsOff_DoNothing_Test() {
        airConditioner.increaseTemperature();
        assertFalse(airConditioner.isOn());
    }

    @Test
    public void increaseTemp_ShouldIncrease_Test() {
        airConditioner.turnOn();
        airConditioner.increaseTemperature(); airConditioner.increaseTemperature();
        assertEquals(18, airConditioner.getTemperature());
    }

    @Test
    public void increaseTempAboveMaxTemp_ShouldNotIncrease_Test() {
        airConditioner.turnOn();
        for (int i=1;i <= 15; i++) airConditioner.increaseTemperature();
        assertEquals(30, airConditioner.getTemperature());
    }

    @Test
    public void reduceTempWhenACIsOff_DoNothing_Test() {
        int temp = airConditioner.getTemperature();
        airConditioner.reduceTemperature();

        assertEquals(temp, airConditioner.getTemperature());
        assertFalse(airConditioner.isOn());
    }

    @Test
    public void reduceTemp_ShouldReduce_Test() {
        airConditioner.turnOn();
        airConditioner.increaseTemperature(); airConditioner.increaseTemperature();
        airConditioner.reduceTemperature();
        assertEquals(17, airConditioner.getTemperature());
    }

    @Test
    public void reduceTempBelowMinTemp_ShouldNotDecrease_Test() {
        airConditioner.turnOn();
        airConditioner.reduceTemperature();
        assertEquals(16, airConditioner.getTemperature());
    }
}
