package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import code.Oblig1;

import org.junit.jupiter.api.Test;

class IndexSortingTests {

    @Test
    void arrayPointingToNull() {
        int[] arrayPointingToNull = null;
        assertThrows(NullPointerException.class, () -> { Oblig1.indexSort(arrayPointingToNull); });
    }
    
    @Test
    void emptyArrayTest() {
        int[] emptyArray = {};
        assertThrows(NoSuchElementException.class, () -> { Oblig1.indexSort(emptyArray); });
    }
    
    @Test
    void arrayWithOneElementTest() {
        int[] arrayWithOneElement = {5};
        assertArrayEquals(new int[] {0}, Oblig1.indexSort(arrayWithOneElement));
    }
    
    @Test
    void arrayWithTwoElementsTest() {
        int [] arrayWithTwoElements = {1, 5};
        assertArrayEquals(new int[] {0, 1}, Oblig1.indexSort(arrayWithTwoElements));
    }
    
    @Test
    void arrayWithMultipleElementsTest() {
        int[] arrayWithMultipleElements = {5, 1, 6, 100, 19, 9, 7, 18};
        assertArrayEquals(new int[] {1, 0, 2, 6, 5, 7, 4, 3}, Oblig1.indexSort(arrayWithMultipleElements));
    }
    
    @Test
    void arrayWithNegativeNumbersTest() {
        int[] arrayWithNegativeNumbers = { -4, -1, -10, -7, -3 };
        assertArrayEquals(new int[] {2, 3, 0, 4, 1}, Oblig1.indexSort(arrayWithNegativeNumbers));
    }
    
    @Test
    void arrayWithMixedNegativeAndPositiveNumbersTest() {
        int[] arrayWithMixedNegativeAndPositiveNumbers = {-5, 1, 0, -6, 10, 5, 8, -3, -2, -9, 9, -10};
        assertArrayEquals(new int[] {11, 9, 3, 0, 7, 8, 2, 1, 5, 6, 10, 4}, Oblig1.indexSort(arrayWithMixedNegativeAndPositiveNumbers));
    }
    
    @Test
    void arrayWithRepeatedNumbersTest() {
        int[] arrayWithRepeatedNumbers = {1, 10, 5, 1, 5, 0, 3, 0, 10, 5};
        assertArrayEquals(new int[] {5, 7, 0, 3, 6, 2, 4, 9, 1, 8}, Oblig1.indexSort(arrayWithRepeatedNumbers));
    }

}
