package com.codedifferently.coding.level.beginner.set09;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void near10Test01() {

        // Given
        int a = 8;
        int b = 13;
        // When
        Integer expected = 8;
        Integer actual = Problem.near10(a,b);
        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void near10Test02() {

        // Given
        int a = 13;
        int b = 8;
        // When
        Integer expected = 8;
        Integer actual = Problem.near10(a,b);
        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void near10Test03() {

        // Given
        int a = 13;
        int b = 7;
        // When
        Integer expected = 0;
        Integer actual = Problem.near10(a,b);
        // Then
        Assertions.assertEquals(expected, actual);
    }
}