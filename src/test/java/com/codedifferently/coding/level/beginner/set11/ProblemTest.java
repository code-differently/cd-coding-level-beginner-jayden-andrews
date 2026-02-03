package com.codedifferently.coding.level.beginner.set11;

import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void everyOtherTest01(){

        // Given
        String word = "Miracle";
        int number = 2;

        // When
        String expected = "Mrce";
        String actual = Problem.everyOther(word, number);
    }

    @Test
    public void everyOtherTest02(){

        // Given
        String word = "abcdefg";
        int number = 2;

        // When
        String expected = "aceg";
        String actual = Problem.everyOther(word, number);
    }

    @Test
    public void everyOtherTest03(){

        // Given
        String word = "abcdefg";
        int number = 3;

        // When
        String expected = "adg";
        String actual = Problem.everyOther(word, number);
    }
}