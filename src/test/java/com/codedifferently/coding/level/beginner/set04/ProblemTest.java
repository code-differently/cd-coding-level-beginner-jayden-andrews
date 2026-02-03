package com.codedifferently.coding.level.beginner.set04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void missingLetterTest01(){
        // Given
        String word = "kitten";
        int number = 1;

        // When
        String expected = "ktten";
        String actual = Problem.missingLetter(word, number);
        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void missingLetterTest02(){
        // Given
        String word = "kitten";
        int number = 0;

        // When
        String expected = "itten";
        String actual = Problem.missingLetter(word, number);
        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void missingLetterTest03(){
        // Given
        String word = "kitten";
        int number = 4;

        // When
        String expected = "kittn";
        String actual = Problem.missingLetter(word, number);
        // Then
        Assertions.assertEquals(expected, actual);
    }
}