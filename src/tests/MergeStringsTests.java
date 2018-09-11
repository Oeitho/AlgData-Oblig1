package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import code.Oblig1;

class MergeStringsTests {

    @Test
    void firstStringPointingToNullTest() {
        String[] strings = {null, "An example string"};
        assertThrows(NullPointerException.class, () -> { Oblig1.merge(strings); });
    }
    
    @Test
    void secondStringPointingToNullTest() {
        String[] strings = {"Example string", null, "Last string"};
        assertThrows(NullPointerException.class, () -> { Oblig1.merge(strings); });
    }
    
    @Test
    void multipleStringsPointingToNull() {
        String[] strings = {null, "Example string", null, null, "Other string", null};
        assertThrows(NullPointerException.class, () -> { Oblig1.merge(strings); });
    }
    
    @Test
    void allStringsPointingToNullTest() {
        String[] strings = {null, null, null, null};
        assertThrows(NullPointerException.class, () -> { Oblig1.merge(strings); });
    }
    
    @Test
    void firstStringEmptyTest() {
        String[] strings = {"", "Example string"};
        assertEquals("Example string", Oblig1.merge(strings));
    }
    
    @Test
    void lastStringEmptyTest() {
        String[] strings = {"Example string", "AB", ""};
        assertEquals("EAxBample string", Oblig1.merge(strings));
    }
    
    @Test
    void allStringsEmptyTest() {
        String[] strings = {"", "", ""};
        assertEquals("", Oblig1.merge(strings));
    }
    
    @Test
    void firstStringLongerTest() {
        String[] strings = {"ABCDEFGHIJKL", "OPQR"};
        assertEquals("AOBPCQDREFGHIJKL", Oblig1.merge(strings));
    }
    
    @Test
    void secondStringLongerTest() {
        String[] strings = {"ABC", "OPQRSTUVWXYZ", "DEF"};
        assertEquals("AODBPECQFRSTUVWXYZ", Oblig1.merge(strings));
    }
    
    @Test
    void lastStringLongTest() {
        String[] strings = {"ABC", "DEF", "GHI", "OPQRST"};
        assertEquals("ADGOBEHPCFIQRST", Oblig1.merge(strings));
    }
    
    @Test
    void allStringsEquallyLongTest() {
        String[] strings = {"ABCD", "DEFG", "OPQR", "STUV"};
        assertEquals("ADOSBEPTCFQUDGRV", Oblig1.merge(strings));
    }
    
    @Test
    void stringsIncludesUnicodeTest() {
        String[] strings = {"AØBCDÅ", "ÆZYØAVWÅ", "æÆøØåÅ"};
        assertEquals("AÆæØZÆBYøCØØDAåÅVÅWÅ", Oblig1.merge(strings));
    }

}
