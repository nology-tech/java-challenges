package com.nology.unittesting_06;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class SolutionTest {

    private Challenge challenge;

    @Before
    public void setUp() throws Exception {
        this.challenge = new Challenge();
    }

    @After
    public void tearDown() throws Exception {
    }

    // -------------- Foundation  --------------

    @Test
    public void getWordCount_ValidSentence_ReturnsCorrectCount() {
        int result = this.challenge.getWordCount("Hello world from nology");
        assertEquals(4, result);
        result = this.challenge.getWordCount("Welcome");
        assertEquals(1, result);
    }

    @Test
    public void isPalindrome_ValidPalindrome_ReturnsTrue() {
        boolean result = this.challenge.isPalindrome("Anna");
        assertTrue(result);
        result = this.challenge.isPalindrome("amber");
        assertFalse(result);
    }

    // -------------- Intermediate  --------------

    @Test
    public void getFullName_ValidName_ReturnsCorrectFullName() {
        String result = this.challenge.getFullName("John", "Doe");
        assertEquals("John Doe", result);
    }

    @Test
    public void getFullName_NullLastName_ReturnsCorrectFullName() {
        String result = this.challenge.getFullName("John", null);
        // Note: You'll have to fix the code to make this work
        assertEquals("John", result);
    }

    @Test
    public void setScore_ValidUser_UpdatesUserScore() {
        User updatedUser = new User("johndoe");
        updatedUser.setScore(10);
        assertEquals(10, updatedUser.getScore());
    }

    @Test
    public void setScore_BadScore_ThrowsIllegalArgumentException() {
        UserRepository repo = new UserRepository();
        User updatedUser = new User("johndoe");
        updatedUser.setScore(-1);
        assertThrows(IllegalArgumentException.class, () -> repo.updateScore(updatedUser));
    }

    }