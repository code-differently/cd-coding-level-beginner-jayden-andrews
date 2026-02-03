package com.codedifferently.coding.level.beginner.set29;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void maxNumberTest01() {

        // Given
        int a = 1;
        int b = 2;
        int c = 3;

        // When
        Integer expected = 3;
        Integer actual = Problem.maxNumber(a, b, c);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxNumberTest02() {

        // Given
        int a = 1;
        int b = 3;
        int c = 2;

        // When
        Integer expected = 3;
        Integer actual = Problem.maxNumber(a, b, c);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxNumberTest03() {

        // Given
        int a = 3;
        int b = 2;
        int c = 1;

        // When
        Integer expected = 3;
        Integer actual = Problem.maxNumber(a, b, c);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}