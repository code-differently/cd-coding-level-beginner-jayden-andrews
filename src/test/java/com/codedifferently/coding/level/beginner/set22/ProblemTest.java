package com.codedifferently.coding.level.beginner.set22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void doubleTheSumTest01() {

        // Given
        int a = 1;
        int b = 2;

        // When
        Integer expected = 3;
        Integer actual = Problem.doubleTheSum(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doubleTheSumTest02() {

        // Given
        int a = 3;
        int b = 2;

        // When
        Integer expected = 5;
        Integer actual = Problem.doubleTheSum(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doubleTheSumTest03() {

        // Given
        int a = 2;
        int b = 2;

        // When
        Integer expected = 8;
        Integer actual = Problem.doubleTheSum(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}