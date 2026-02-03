package com.codedifferently.coding.level.beginner.set06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void beginWithHiTest01() {

        // Given
        String phrase = "hi there";
        // When
        Boolean expected = true;
        Boolean actual = Problem.beginWithHi(phrase);
        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void beginWithHiTest02() {

        // Given
        String phrase = "hi";
        // When
        Boolean expected = true;
        Boolean actual = Problem.beginWithHi(phrase);
        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void beginWithHiTest03() {

        // Given
        String phrase = "hello hi";
        // When
        Boolean expected = false;
        Boolean actual = Problem.beginWithHi(phrase);
        // Then
        Assertions.assertEquals(expected, actual);
    }
}