package tests;

import static org.junit.jupiter.api.Assertions.*;

import code.Oblig1;

import org.junit.jupiter.api.Test;

class IndexSortingTests {

    @Test
    void arrayPointingToNull() {
        int[] arrayPointingToNull = null;
        assertThrows(NullPointerException.class, () -> { Oblig1.indekssortering(arrayPointingToNull); });
    }
    
    @Test
    void emptyArrayTest() {
        int[] emptyArray = {};
        assertArrayEquals(new int[] {}, Oblig1.indekssortering(emptyArray));
    }
    
    @Test
    void arrayWithOneElementTest() {
        int[] arrayWithOneElement = {5};
        assertArrayEquals(new int[] {0}, Oblig1.indekssortering(arrayWithOneElement));
    }
    
    @Test
    void arrayWithTwoElementsTest() {
        int [] arrayWithTwoElements = {1, 5};
        assertArrayEquals(new int[] {0, 1}, Oblig1.indekssortering(arrayWithTwoElements));
    }
    
    @Test
    void arrayWithMultipleElementsTest() {
        int[] arrayWithMultipleElements = {5, 1, 6, 100, 19, 9, 7, 18};
        assertArrayEquals(new int[] {1, 0, 2, 6, 5, 7, 4, 3}, Oblig1.indekssortering(arrayWithMultipleElements));
    }
    
    @Test
    void arrayWithNegativeNumbersTest() {
        int[] arrayWithNegativeNumbers = { -4, -1, -10, -7, -3 };
        assertArrayEquals(new int[] {2, 3, 0, 4, 1}, Oblig1.indekssortering(arrayWithNegativeNumbers));
    }
    
    @Test
    void arrayWithMixedNegativeAndPositiveNumbersTest() {
        int[] arrayWithMixedNegativeAndPositiveNumbers = {-5, 1, 0, -6, 10, 5, 8, -3, -2, -9, 9, -10};
        assertArrayEquals(new int[] {11, 9, 3, 0, 7, 8, 2, 1, 5, 6, 10, 4}, Oblig1.indekssortering(arrayWithMixedNegativeAndPositiveNumbers));
    }
    
    @Test
    void arrayWithRepeatedNumbersTest() {
        int[] arrayWithRepeatedNumbers = {1, 10, 5, 1, 5, 0, 3, 0, 10, 5};
        assertArrayEquals(new int[] {5, 7, 0, 3, 6, 2, 4, 9, 1, 8}, Oblig1.indekssortering(arrayWithRepeatedNumbers));
    }

}
