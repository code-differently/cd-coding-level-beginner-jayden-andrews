package com.codedifferently.coding.level.beginner.set16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void multipleOfTest01() {

        // Given
        int n = 3;

        // When
        Boolean expected = true;
        Boolean actual = Problem.multipleOf(n);

        // Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void multipleOfTest02() {

        // Given
        int n = 10;

        // When
        Boolean expected = true;
        Boolean actual = Problem.multipleOf(n);

        // Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void multipleOfTest03() {

        // Given
        int n = 8;

        // When
        Boolean expected = false;
        Boolean actual = Problem.multipleOf(n);

        // Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void multipleOfTest04() {

        // Given
        int n = 58;

        // When
        Boolean expected = false;
        Boolean actual = Problem.multipleOf(n);

        // Then
        Assertions.assertEquals(expected,actual);
    }
}