package com.nology.unittesting_06;

import java.util.*;
// written with junit 4 syntax
public class Challenge {

    // -------------- Foundation  --------------

    /**
     * Inside ChallengeTest.java, write "positive" tests for the following function
     *
     * @param sentence - Sentence we are counting words in
     * @return The amount of words in a sentence
     */
    public int getWordCount(String sentence) {
        return sentence.split(" ").length;
    }

    /**
     * Inside ChallengeTest.java, write "positive" tests for the following function
     *
     * @param word
     * @return
     */
    public boolean isPalindrome(String word) {
        StringBuilder sb = new StringBuilder(word);
        return word.toLowerCase().equals(sb.reverse().toString().toLowerCase());

    }

    // -------------- Intermediate  --------------

    /**
     * Inside ChallengeTest.java, write "positive" & "negative" tests for the following function
     *
     * @param firstName - Person's First Name
     * @param lastName - Person's Last Name
     * @return The full name of the person
     */
    public String getFullName(String firstName, String lastName) {
        // ... This needs changing to work with null values
        return firstName + " " + lastName;
    }

    /**
     * Final Challenge is writing a test for the User.java setScore function.. Checkout ChallengeTest.java
     * and User.java to understand more :)
     * */

    /**
     * Extra Challenges for early finishers.. Write negative tests for the first two methods :)
     * Think what code might need to be altered
     * */

}