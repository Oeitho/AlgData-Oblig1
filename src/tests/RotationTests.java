package tests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import code.Oblig1;

class RotationTests {

    @Test
    void emptyArrayTest() {
        char[] emptyArray = {};
        assertArrayEquals(new char[] {}, Oblig1.rotasjon(emptyArray));
    }
    
    @Test
    void arrayPointingToNullTest() {
        char[] arrayPointingToNull = null;
        assertThrows(NullPointerException.class, () -> Oblig1.rotasjon(arrayPointingToNull));
    }
    
    @Test
    void arrayWithOneOddNumberTest() {
        char[] arrayWithOneElement = {'A'};
        assertArrayEquals(new char[] {'A'}, Oblig1.rotasjon(arrayWithOneElement));
    }
    
    @Test
    void arrayWithOneEvenNumberTest() {
        char[] arrayWithOneElement = {'B'};
        assertArrayEquals(new char[] {'B'}, Oblig1.rotasjon(arrayWithOneElement));
    }
    
    @Test
    void repeatedNumbersInArrayTest() {
        char[] arrayOfIntegers = {7, 8, 7, 9, 2, 2, 0, 2, 1, 8};
        assertArrayEquals(new char[] {8, 7, 8, 7, 9, 2, 2, 0, 2, 1}, Oblig1.rotasjon(arrayOfIntegers));
    }
    
    @Test
    void repeatedCharsInArrayTest() {
        char[] arrayOfIntegers = {'A', 'B', 'A', 'A', 'Z', ',', 'O', 'Z'};
        assertArrayEquals(new char[] {'Z', 'A', 'B', 'A', 'A', 'Z', ',', 'O'}, Oblig1.rotasjon(arrayOfIntegers));
    }
    

}
