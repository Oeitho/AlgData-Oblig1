package tests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import code.Oblig1;

class RotationsTests {

    @Test
    void emptyArrayTest1() {
        char[] emptyArray = {};
        assertArrayEquals(new char[] {}, Oblig1.rotasjon(emptyArray, -1));
    }
    
    @Test
    void emptyArrayTest2() {
        char[] emptyArray = {};
        assertArrayEquals(new char[] {}, Oblig1.rotasjon(emptyArray, 1));
    }
    
    @Test
    void emptyArrayTest3() {
        char[] emptyArray = {};
        assertArrayEquals(new char[] {}, Oblig1.rotasjon(emptyArray, 0));
    }
    
    @Test
    void emptyArrayTest4() {
        char[] emptyArray = {};
        assertArrayEquals(new char[] {}, Oblig1.rotasjon(emptyArray, 500));
    }
    
    @Test
    void arrayPointingToNullTest1() {
        char[] arrayPointingToNull = null;
        assertThrows(NullPointerException.class, () -> Oblig1.rotasjon(arrayPointingToNull, -1));
    }
    
    @Test
    void arrayPointingToNullTest2() {
        char[] arrayPointingToNull = null;
        assertThrows(NullPointerException.class, () -> Oblig1.rotasjon(arrayPointingToNull, 1));
    }
    
    @Test
    void arrayPointingToNullTest3() {
        char[] arrayPointingToNull = null;
        assertThrows(NullPointerException.class, () -> Oblig1.rotasjon(arrayPointingToNull, 0));
    }
    
    @Test
    void arrayPointingToNullTest4() {
        char[] arrayPointingToNull = null;
        assertThrows(NullPointerException.class, () -> Oblig1.rotasjon(arrayPointingToNull, 500));
    }
    
    @Test
    void arrayWithOneOddNumberTest1() {
        char[] arrayWithOneElement = {'A'};
        assertArrayEquals(new char[] {'A'}, Oblig1.rotasjon(arrayWithOneElement, -1));
    }
    
    @Test
    void arrayWithOneOddNumberTest2() {
        char[] arrayWithOneElement = {'A'};
        assertArrayEquals(new char[] {'A'}, Oblig1.rotasjon(arrayWithOneElement, 1));
    }
    
    @Test
    void arrayWithOneOddNumberTest3() {
        char[] arrayWithOneElement = {'A'};
        assertArrayEquals(new char[] {'A'}, Oblig1.rotasjon(arrayWithOneElement, 0));
    }
    
    @Test
    void arrayWithOneOddNumberTest() {
        char[] arrayWithOneElement = {'A'};
        assertArrayEquals(new char[] {'A'}, Oblig1.rotasjon(arrayWithOneElement, 500));
    }
    
    @Test
    void repeatedNumbersInArrayTest1() {
        char[] arrayOfIntegers = {7, 8, 7, 9, 2, 2, 0, 2, 1, 8};
        assertArrayEquals(new char[] {8, 7, 9, 2, 2, 0, 2, 1, 8, 7}, Oblig1.rotasjon(arrayOfIntegers, -1));
    }
    
    @Test
    void repeatedNumbersInArrayTest2() {
        char[] arrayOfIntegers = {7, 8, 7, 9, 2, 2, 0, 2, 1, 8};
        assertArrayEquals(new char[] {8, 7, 8, 7, 9, 2, 2, 0, 2, 1}, Oblig1.rotasjon(arrayOfIntegers, 1));
    }
    
    @Test
    void repeatedNumbersInArrayTest3() {
        char[] arrayOfIntegers = {7, 8, 7, 9, 2, 2, 0, 2, 1, 8};
        assertArrayEquals(new char[] {7, 8, 7, 9, 2, 2, 0, 2, 1, 8}, Oblig1.rotasjon(arrayOfIntegers, 0));
    }
    
    @Test
    void repeatedNumbersInArrayTest4() {
        char[] arrayOfIntegers = {7, 8, 7, 9, 2, 2, 0, 2, 1, 8};
        assertArrayEquals(new char[] {7, 8, 7, 9, 2, 2, 0, 2, 1, 8}, Oblig1.rotasjon(arrayOfIntegers, 500));
    }
    
    @Test
    void repeatedCharsInArrayTest1() {
        char[] arrayOfIntegers = {'A', 'B', 'A', 'A', 'Z', ',', 'O', 'Z'};
        assertArrayEquals(new char[] {'B', 'A', 'A', 'Z', ',', 'O', 'Z', 'A'}, Oblig1.rotasjon(arrayOfIntegers, -1));
    }
    
    @Test
    void repeatedCharsInArrayTest2() {
        char[] arrayOfIntegers = {'A', 'B', 'A', 'A', 'Z', ',', 'O', 'Z'};
        assertArrayEquals(new char[] {'Z', 'A', 'B', 'A', 'A', 'Z', ',', 'O'}, Oblig1.rotasjon(arrayOfIntegers, 1));
    }
    
    @Test
    void repeatedCharsInArrayTest3() {
        char[] arrayOfIntegers = {'A', 'B', 'A', 'A', 'Z', ',', 'O', 'Z'};
        assertArrayEquals(new char[] {'A', 'B', 'A', 'A', 'Z', ',', 'O', 'Z'}, Oblig1.rotasjon(arrayOfIntegers, 0));
    }
    
    @Test
    void repeatedCharsInArrayTest4() {
        char[] arrayOfIntegers = {'A', 'B', 'A', 'A', 'Z', ',', 'O', 'Z'};
        assertArrayEquals(new char[] {'Z', ',', 'O', 'Z', 'A', 'B', 'A', 'A'}, Oblig1.rotasjon(arrayOfIntegers, 500));
    }
    
}
