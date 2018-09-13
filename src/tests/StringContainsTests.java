package tests;

import static org.junit.jupiter.api.Assertions.*;

import code.Oblig1;

import org.junit.jupiter.api.Test;

class StringContainsTests {

    @Test
    void firstStringPointsToNullTest() {
        String firstString = null;
        String secondString = "ABBA";
        assertThrows(NullPointerException.class, () -> Oblig1.inneholdt(firstString, secondString));
    }
    
    @Test
    void secondStringPointsToNullTest() {
        String firstString = "Abba";
        String secondString = null;
        assertThrows(NullPointerException.class, () -> Oblig1.inneholdt(firstString, secondString));
    }
    
    @Test
    void bothStringsPointsToNullTest() {
        String firstString = null;
        String secondString = null;
        assertThrows(NullPointerException.class, () -> Oblig1.inneholdt(firstString, secondString));
    }
    
    @Test
    void firstStringEmptyTest() {
        String firstString = "";
        String secondString = "ABBA";
        assertEquals(true, Oblig1.inneholdt(firstString, secondString));
    }
    
    @Test
    void secondStringEmptyTest() {
        String firstString = "ABBA";
        String secondString = "";
        assertEquals(false, Oblig1.inneholdt(firstString, secondString));
    }
    
    @Test
    void bothStringsEmptyTest() {
        String firstString = "";
        String secondString = "";
        assertEquals(true, Oblig1.inneholdt(firstString, secondString));
    }
    
    @Test
    void secondStringContainsAllCharactersInFirstStringTest() {
        String firstString = "ABBA";
        String secondString = "ALIBABA";
        assertEquals(true, Oblig1.inneholdt(firstString, secondString));
    }
    
    @Test
    void secondStringDoesntContainAllCharactersInFirstStringTest() {
        String firstString = "ABBA";
        String secondString = "ACDC";
        assertEquals(false, Oblig1.inneholdt(firstString, secondString));
    }

}
