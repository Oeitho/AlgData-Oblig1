package tests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import code.Oblig1;

class RotationTests {

    @Test
    void emptyArrayTest() {
        int[] emptyArray = {};
        assertArrayEquals(new int[] {}, Oblig1.rotate(emptyArray));
    }
    
    @Test
    void arrayPointingToNullTest() {
        int[] arrayPointingToNull = null;
        assertThrows(NullPointerException.class, () -> Oblig1.rotate(arrayPointingToNull));
    }
    
    @Test
    void arrayWithOneOddNumberTest() {
        int[] arrayWithOneElement = {1};
        assertArrayEquals(new int[] {1}, Oblig1.rotate(arrayWithOneElement));
    }
    
    @Test
    void arrayWithOneEvenNumberTest() {
        int[] arrayWithOneElement = {2};
        assertArrayEquals(new int[] {2}, Oblig1.rotate(arrayWithOneElement));
    }
    
    @Test
    void negativeNumbersTest() {
        int[] arrayOfNegativeIntegers = {-20, -15, -31, -1, -19};
        assertArrayEquals(new int[] {-19, -20, -15, -31, -1}, Oblig1.rotate(arrayOfNegativeIntegers));
    }
    
    @Test
    void mixedNegativeAndPositiveIntegersTest() {
        int[] arrayOfIntegers = {-20, 20, 14, -1, 0, 100};
        assertArrayEquals(new int[] {100, -20, 20, 14, -1, 0}, Oblig1.rotate(arrayOfIntegers));
    }
    
    @Test
    void repeatedNubersInArrayTest() {
        int[] arrayOfIntegers = {7, 8, 7, 9, 2, 2, 0, 2, 1, 8};
        assertArrayEquals(new int[] {8, 7, 8, 7, 9, 2, 2, 0, 2, 1}, Oblig1.rotate(arrayOfIntegers));
    }
    
    @Test
    void onlyOddNumbersTest() {
        int[] arrayOfIntegers = {3, 5, 1, 19, 21, 7};
        assertArrayEquals(new int[] {7, 3, 5, 1, 19, 21}, Oblig1.rotate(arrayOfIntegers));
    }
    
    @Test
    void onlyEvenNumbersTest() {
        int[] arrayOfIntegers = {100, 34, 14, 6, 90};
        assertArrayEquals(new int[] {90, 100, 34, 14, 6}, Oblig1.rotate(arrayOfIntegers));
    }

}
