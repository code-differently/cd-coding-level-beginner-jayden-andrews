package com.codedifferently.coding.level.beginner.set05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void wordOfDayTest01() {

        // Given
        String str = "cat";
        // When
        String expected = "tcatt";
        String actual = Problem.wordOfDay("cat");
        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void wordOfDayTest02() {

        // Given
        String str = "Hello";
        // When
        String expected = "oHelloo";
        String actual = Problem.wordOfDay("Hello");
        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void wordOfDayTest03() {

        // Given
        String str = "a";
        // When
        String expected = "aaa";
        String actual = Problem.wordOfDay("a");
        // Then
        Assertions.assertEquals(expected, actual);
    }
}