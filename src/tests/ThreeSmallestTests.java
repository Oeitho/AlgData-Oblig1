package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import code.Oblig1;

import org.junit.jupiter.api.Test;

class ThreeSmallestTests {

    @Test
    void arrayPointingToNullTest() {
        int[] arrayPointingToNull = null;
        assertThrows(NullPointerException.class, () -> Oblig1.tredjeMin(arrayPointingToNull));
    }
    
    @Test
    void arrayContainingOneNumberTest() {
        int[] arrayContainingOneNumber = {4};
        assertThrows(NoSuchElementException.class, () -> Oblig1.tredjeMin(arrayContainingOneNumber));
    }
    
    @Test
    void arrayContainingTwoNumbersTest() {
        int[] arrayContainingTwoNumbers = {5, 3};
        assertThrows(NoSuchElementException.class, () -> Oblig1.tredjeMin(arrayContainingTwoNumbers));
    }
    
    @Test
    void arrayContainingThreeNumbersTest() {
        int[] arrayContainingThreeNumbers = {4, 2, 0};
        assertArrayEquals(new int[] {2, 1, 0}, Oblig1.tredjeMin(arrayContainingThreeNumbers));
    }
    
    @Test
    void arrayContainingFourNumbersTest() {
        int[] arrayContainingFourNumbers = {4, 2, 0, 5};
        assertArrayEquals(new int[] {2, 1, 0}, Oblig1.tredjeMin(arrayContainingFourNumbers));
    }
    
    @Test
    void arrayContainingNegativeNumbers() {
        int[] arrayContainingNegativeNumbers = {-2, -4, -7, -1, -5};
        assertArrayEquals(new int[] {2, 4, 1}, Oblig1.tredjeMin(arrayContainingNegativeNumbers));
    }
    
    @Test
    void arrayContainingMixedNegativeAndPositiveNumbers() {
        int[] arrayContainingMixedNegativeAndPositiveNumbers = {-4 , 1, 0, 15, 3};
        assertArrayEquals(new int[] {0, 2, 1}, Oblig1.tredjeMin(arrayContainingMixedNegativeAndPositiveNumbers));
    }
    
}
