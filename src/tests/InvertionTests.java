package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import code.Oblig1;

import org.junit.jupiter.api.Test;

class InvertionTests {

    @Test
    void emptyArrayTest() {
        int[] emptyArray = {};
        assertThrows(NoSuchElementException.class, () -> Oblig1.ombyttinger(emptyArray));
    }
    
    @Test
    void arrayPointingToNullTest() {
        int[] arrayPointingToNull = null;
        assertThrows(NullPointerException.class, () -> Oblig1.ombyttinger(arrayPointingToNull));
    }
    
    @Test
    void arrayWithOneElementTest() {
        int[] arrayWithOneElement = {1};
        assertEquals(0, Oblig1.ombyttinger(arrayWithOneElement));
    }
    
    @Test
    void negativeNumbersTest() {
        int[] arrayOfNegativeIntegers = {-20, -15, -31, -1, -19};
        assertEquals(2, Oblig1.ombyttinger(arrayOfNegativeIntegers));
    }
    
    @Test
    void mixedNegativeAndPositiveIntegersTest() {
        int[] arrayOfIntegers = {-20, 20, 14, -1, 0, 100};
        assertEquals(3, Oblig1.ombyttinger(arrayOfIntegers));
    }


}
