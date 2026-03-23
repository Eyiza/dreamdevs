package Day4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReceiptTest {
    @Test
    public void getOneInWords_Test() {
        assertEquals("One", Receipt.getMoneyInWords(1));
    }

    @Test
    public void getTenMillion_InvalidTest(){
        assertEquals("Invalid Amount", Receipt.getMoneyInWords(10000000));
    }

    @Test
    public void get10InWords_Test(){
        assertEquals("Ten", Receipt.getMoneyInWords(10));
    }

    @Test
    public void get1000000InWords_Test(){
        assertEquals("One Million", Receipt.getMoneyInWords(1000000));
    }

    @Test
    public void get100InWords_Test(){
        assertEquals("One Hundred", Receipt.getMoneyInWords(100));
    }
}
