package com.codedifferently.coding.level.beginner.set20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void range3050Test01() {

        // Given
        int a = 30;
        int b = 31;

        // When
        Boolean expected = true;
        Boolean actual = Problem.range3050(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void range3050Test02() {

        // Given
        int a = 30;
        int b = 41;

        // When
        Boolean expected = false;
        Boolean actual = Problem.range3050(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void range3050Test03() {

        // Given
        int a = 40;
        int b = 50;

        // When
        Boolean expected = true;
        Boolean actual = Problem.range3050(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}