package tests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import code.Oblig1;

class PartialSortingTests {

    @Test
    void emptyArrayTest() {
        int[] emptyArray = {};
        assertArrayEquals(new int[] {}, Oblig1.partialSort(emptyArray));
    }
    
    @Test
    void arrayPointingToNullTest() {
        int[] arrayPointingToNull = null;
        assertThrows(NullPointerException.class, () -> Oblig1.partialSort(arrayPointingToNull));
    }
    
    @Test
    void arrayWithOneOddNumberTest() {
        int[] arrayWithOneElement = {1};
        assertArrayEquals(new int[] {1}, Oblig1.partialSort(arrayWithOneElement));
    }
    
    @Test
    void arrayWithOneEvenNumberTest() {
        int[] arrayWithOneElement = {2};
        assertArrayEquals(new int[] {2}, Oblig1.partialSort(arrayWithOneElement));
    }
    
    @Test
    void negativeNumbersTest() {
        int[] arrayOfNegativeIntegers = {-20, -15, -31, -1, -19};
        assertArrayEquals(new int[] {-31, -19, -15, -1, -20}, Oblig1.partialSort(arrayOfNegativeIntegers));
    }
    
    @Test
    void mixedNegativeAndPositiveIntegersTest() {
        int[] arrayOfIntegers = {-20, 20, 14, -1, 0, 100};
        assertArrayEquals(new int[] {-1, -20, 0, 14, 20, 100}, Oblig1.partialSort(arrayOfIntegers));
    }
    
    @Test
    void repeatedNubersInArrayTest() {
        int[] arrayOfIntegers = {7, 8, 7, 9, 2, 2, 0, 2, 1, 8};
        assertArrayEquals(new int[] {1, 7, 7, 9, 0, 2, 2, 2, 8, 8}, Oblig1.partialSort(arrayOfIntegers));
    }
    
    @Test
    void onlyOddNumbersTest() {
        int[] arrayOfIntegers = {3, 5, 1, 19, 21, 7};
        assertArrayEquals(new int[] {1, 3, 5, 7, 19, 21}, Oblig1.partialSort(arrayOfIntegers));
    }
    
    @Test
    void onlyEvenNumbersTest() {
        int[] arrayOfIntegers = {100, 34, 14, 6, 90};
        assertArrayEquals(new int[] {6, 14, 34, 90, 100}, Oblig1.partialSort(arrayOfIntegers));
    }

}
