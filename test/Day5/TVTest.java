package Day5;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TVTest {
    private TV tv;

    @BeforeEach
    public void setup(){
        tv = new TV();
    }

    @Test
    public void newTV_ShouldBeOff_Test() {
        assertFalse(tv.isOn());
    }
}
