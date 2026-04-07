package dsa;

import org.junit.jupiter.api.Test;

import static dsa.Sort.divide;
import static dsa.Sort.sort;
import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    @Test
    void sortTest(){
        int[] array = {1,5,6,9,3,2};
        int[] result = {1,2,3,5,6,9};
        assertArrayEquals(result, sort(array));
    }

    @Test
    void divideTest(){
        assertEquals(3, divide(6, 2));
    }

    @Test
    void divideBy5Test(){
        assertEquals(5, divide(15, 3));
    }

    @Test
    void negativeDivideTest(){
        assertEquals(-5, divide(-15, 3));
    }

    @Test
    void zeroDivideTest(){
        assertEquals(0, divide(0, 3));
    }
}