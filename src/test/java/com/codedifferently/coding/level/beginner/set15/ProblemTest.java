package com.codedifferently.coding.level.beginner.set15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void exchangeTest01() {

        // Given
        String str = "code";

        // When
        String expected = "eodc";
        String actual = Problem.exchange(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void exchangeTest02() {

        // Given
        String str = "a";

        // When
        String expected = "a";
        String actual = Problem.exchange(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void exchangeTest03() {

        // Given
        String str = "ab";

        // When
        String expected = "ba";
        String actual = Problem.exchange(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}