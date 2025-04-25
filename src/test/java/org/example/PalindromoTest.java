package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromoTest {
    private Palindromo checker;

    @BeforeEach
    void setUp() {
        checker=new Palindromo();
    }

    @Test
    void classicSentenceWithPunctuationAndSpaces_returnTrue(){
        assertTrue(checker.isPalindromo("a man, a plan, a canal: Panama"));
    }

    @Test
     void mixedCaseAndPunctuation_returnsTrue() {
        assertTrue(checker.isPalindromo("No 'x' in Nixon"));
    }

    @Test
    void simpleWord_returnTrue(){
        assertTrue(checker.isPalindromo("racecar"));
    }

    @Test
    void numericPalindrome_returnTrue() {
        assertTrue(checker.isPalindromo("12321"));
    }

    @Test
    void nonPalindromeSentence_returnsFalse() {
        assertFalse(checker.isPalindromo("Hello, world"));
    }

    @Test
    void emptyString_returnsTrue(){
        assertTrue(checker.isPalindromo(""));
    }

    @Test
    void onlyNonAlphanumericCharacters_returnsTrue() {
        assertTrue(checker.isPalindromo("!!!...   ---"));
    }

    @Test
    void singleCharacter_returnsTrue() {
        assertTrue(checker.isPalindromo("x"));
    }

    @Test
    void nullInput_trowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> checker.isPalindromo(""));
    }
}