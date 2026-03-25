package Day6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static Weekend1.ArrayKata.squareNumbersIn;
import static org.junit.jupiter.api.Assertions.*;

class FactorsTest {
    @Test
    void getFactorsOf6_Test(){
        int[] factors = {2, 3, 6};
        boolean isEqual = Arrays.equals(factors, Factors.calculateFactors(6));
        assertTrue(isEqual);
    }

    @Test
    void getFactorsOf20_Test(){
        int[] factors = {2, 4, 5, 10, 20};
        boolean isEqual = Arrays.equals(factors, Factors.calculateFactors(20));

        assertTrue(isEqual);
    }

    @Test
    void getDivisorsOf20_Test(){
        ArrayList<Integer> factors = new ArrayList<>(Arrays.asList(2, 2, 5));
        assertEquals(factors, Factors.calculateDivisors(20));
    }

}