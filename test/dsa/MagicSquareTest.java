package dsa;

import org.junit.jupiter.api.Test;

import static dsa.MagicSquare.magicSquare;
import static org.junit.jupiter.api.Assertions.*;

class MagicSquareTest {

    @Test
    void magicSquare_validTest() {
        int[][] array = {{8,1,6}, {3,5,7}, {4,9,2}};
        assertTrue(magicSquare(array));
    }

    @Test
    void magicSquare_invalidTest() {
        int[][] array = {{8,2,6}, {3,5,7}, {4,9,2}};
        assertFalse(magicSquare(array));
    }
}