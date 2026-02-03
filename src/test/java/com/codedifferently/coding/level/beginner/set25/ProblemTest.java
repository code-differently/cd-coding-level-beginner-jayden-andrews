package com.codedifferently.coding.level.beginner.set25;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void popular3Test01() {

        // Given
        String str = "Java";

        // When
        String expected = "JavJavJav";
        String actual = Problem.popular3(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void popular3Test02() {

        // Given
        String str = "Chocolate";

        // When
        String expected = "ChoChoCho";
        String actual = Problem.popular3(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void popular3Test03() {

        // Given
        String str = "abc";

        // When
        String expected = "abcabcabc";
        String actual = Problem.popular3(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}