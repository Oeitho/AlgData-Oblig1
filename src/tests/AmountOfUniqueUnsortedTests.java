package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import code.Oblig1;

class AmountOfUniqueUnSortedTests {

    @Test
    void emptyArrayTest() {
        int[] emptyArray = {};
        assertEquals(0, Oblig1.antallUlikeUsortert(emptyArray));
    }
    
    @Test
    void arrayPointingToNullTest() {
        int[] arrayPointingToNull = null;
        assertThrows(NullPointerException.class, () -> Oblig1.antallUlikeUsortert(arrayPointingToNull));
    }
    
    @Test
    void arrayWithOneElementTest() {
        int[] arrayWithOneElement = {4};
        assertEquals(1, Oblig1.antallUlikeUsortert(arrayWithOneElement));
    }
    
    @Test
    void negativeNumbersTest() {
        int[] arrayOfNegativeIntegers = {-20, -20, -14, -13, -13, -13, -3};
        assertEquals(4, Oblig1.antallUlikeUsortert(arrayOfNegativeIntegers));
    }
    
    @Test
    void mixedNegativeAndPositiveIntegersTest() {
        int[] arrayOfIntegers = {-20, -14, -10, 0, 19, 20};
        assertEquals(6, Oblig1.antallUlikeUsortert(arrayOfIntegers));
    }
    
    @Test
    void nonSortedArrayTest() {
        int[] arrayOfNotSortedIntegers = {1, 5, 8, 7, 30};
        assertEquals(5, Oblig1.antallUlikeUsortert(arrayOfNotSortedIntegers));
    }

}
