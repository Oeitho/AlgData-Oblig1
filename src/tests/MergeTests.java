package tests;

import static org.junit.jupiter.api.Assertions.*;
import code.Oblig1;

import org.junit.jupiter.api.Test;

class MergeTests {

    @Test
    void firstStringPointingToNullTest() {
        String firstString = null;
        String secondString = "An example string";
        assertThrows(NullPointerException.class, () -> { Oblig1.flett(firstString, secondString); });
    }
    
    @Test
    void secondStringPointingToNullTest() {
        String firstString = "Example string";
        String secondString = null;
        assertThrows(NullPointerException.class, () -> { Oblig1.flett(firstString, secondString); });
    }
    
    @Test
    void bothStringsPointingToNullTest() {
        String firstString = null;
        String secondString = null;
        assertThrows(NullPointerException.class, () -> { Oblig1.flett(firstString, secondString); });
    }
    
    @Test
    void firstStringEmptyTest() {
        String firstString = "";
        String secondString = "Example string";
        assertEquals("Example string", Oblig1.flett(firstString, secondString));
    }
    
    @Test
    void secondStringEmptyTest() {
        String firstString = "Example string";
        String secondString = "";
        assertEquals("Example string", Oblig1.flett(firstString, secondString));
    }
    
    @Test
    void bothStringsEmptyTest() {
        String firstString = "";
        String secondString = "";
        assertEquals("", Oblig1.flett(firstString, secondString));
    }
    
    @Test
    void firstStringLongerThanSecondStringTest() {
        String firstString = "ABCDEFGHIJKL";
        String secondString = "OPQR";
        assertEquals("AOBPCQDREFGHIJKL", Oblig1.flett(firstString, secondString));
    }
    
    @Test
    void secondStringLongerThanFirstStringTest() {
        String firstString = "ABC";
        String secondString = "OPQRSTUVWXYZ";
        assertEquals("AOBPCQRSTUVWXYZ", Oblig1.flett(firstString, secondString));
    }
    
    @Test
    void firstAndSecondStringEquallyLongTest() {
        String firstString = "ABCD";
        String secondString = "OPQR";
        assertEquals("AOBPCQDR", Oblig1.flett(firstString, secondString));
    }
    
    @Test
    void firstStringIncludesUnicodeTest() {
        String firstString = "ÆØÅ";
        String secondString = "ABC";
        assertEquals("ÆAØBÅC", Oblig1.flett(firstString, secondString));
    }
    
    @Test
    void secondStringIncludesUnicodeTest() {
        String firstString = "ABC";
        String secondString = "ÆØÅ";
        assertEquals("AÆBØCÅ", Oblig1.flett(firstString, secondString));
    }
    
    @Test
    void bothStringIncludeUnicodeTest() {
        String firstString = "ABÆCØ";
        String secondString = "OÅPQÆ";
        assertEquals("AOBÅÆPCQØÆ", Oblig1.flett(firstString, secondString));
    }

}
