package dsa;

import org.junit.jupiter.api.Test;

import static dsa.MaxSubArray.maxSubArray;
import static org.junit.jupiter.api.Assertions.*;

class MaxSubArrayTest {

    @Test
    void maxSubArrayTest() {
        int[] array = {1,5,6,9,3,2};
        int[] result = {5,6,9};
        assertArrayEquals(result,maxSubArray(array,3));
    }

    @Test
    void maxSubArray_Test() {
        int[] array = {10,5,6,9,3,2};
        int[] result = {10,5,6};
        assertArrayEquals(result,maxSubArray(array,3));
    }
}