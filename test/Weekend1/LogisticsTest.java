package Weekend1;
import org.junit.jupiter.api.Test;

import static Weekend1.Logistics.calculateDailyWage;
import static org.junit.jupiter.api.Assertions.*;

public class LogisticsTest {
    @Test
    public void invalidSuccessDelivery_isZeroTest(){
        assertEquals(0, calculateDailyWage(-1));
    }

    @Test
    public void SuccessDeliveryLessThan50_isValidAllowanceTest(){
        assertEquals(9000, calculateDailyWage(25));
    }

    @Test
    public void SuccessDeliveryLessThan59_isValidAllowanceTest(){
        assertEquals(16000, calculateDailyWage(55));
    }

    @Test
    public void SuccessDeliveryLessThan69_isValidAllowanceTest(){
        assertEquals(21250, calculateDailyWage(65));
    }

    @Test
    public void SuccessDeliveryGreaterThan70_isValidAllowanceTest(){
        assertEquals(45000, calculateDailyWage(80));
    }

    @Test
    public void SuccessDeliveryGreaterThan100_isInvalidTest(){
        assertEquals(0, calculateDailyWage(104));
    }
}
