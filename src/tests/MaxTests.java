package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

import code.Oblig1;

class maxTest {

    @Test
    void emptyArrayTest() {
        int[] emptyArray = {};
        assertThrows(NoSuchElementException.class, () -> Oblig1.maks(emptyArray));
    }
    
    @Test
    void arrayPointingToNullTest() {
        int[] arrayPointingToNull = null;
        assertThrows(NullPointerException.class, () -> Oblig1.maks(arrayPointingToNull));
    }
    
    @Test
    void arrayWithOneElementTest() {
        int[] arrayWithOneElement = {1};
        assertEquals(1, Oblig1.maks(arrayWithOneElement));
    }
    
    @Test
    void negativeNumbersTest() {
        int[] arrayOfNegativeIntegers = {-20, -15, -31, -1, -19};
        assertEquals(-1, Oblig1.maks(arrayOfNegativeIntegers));
    }
    
    @Test
    void mixedNegativeAndPositiveIntegersTest() {
        int[] arrayOfIntegers = {-20, 20, 14, -1, 0, 100};
        assertEquals(100, Oblig1.maks(arrayOfIntegers));
    }

}
