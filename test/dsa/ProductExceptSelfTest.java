package dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductExceptSelfTest {

    @Test
    void productExceptSelfAlgorithmTest() {
        int[] array = {2, 1, 5, 6};
        int[] result = {30, 60, 12, 10};
        assertArrayEquals(result, ProductExceptSelf.productExceptSelfAlgorithm(array));
    }

    @Test
    void productExceptSelfAlgorithm_withZeroTest() {
        int[] array = {2, 0, 5, 6};
        int[] result = {0, 60, 0, 0};
        assertArrayEquals(result, ProductExceptSelf.productExceptSelfAlgorithm(array));
    }
}