package com.codedifferently.coding.level.beginner.set30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void larger1020Test01() {

        // Given
        int a = 11;
        int b = 19;

        // When
        Integer expected = 19;
        Integer actual = Problem.larger1020(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void larger1020Test02() {

        // Given
        int a = 19;
        int b = 11;

        // When
        Integer expected = 19;
        Integer actual = Problem.larger1020(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void larger1020Test03() {

        // Given
        int a = 11;
        int b = 9;

        // When
        Integer expected = 11;
        Integer actual = Problem.larger1020(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}