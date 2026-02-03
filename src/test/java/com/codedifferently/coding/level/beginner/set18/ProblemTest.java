package com.codedifferently.coding.level.beginner.set18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void oneTeenTest01() {

        // Given
        int a = 13;
        int b = 99;

        // When
        Boolean expected = true;
        Boolean actual = Problem.oneTeen(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void oneTeenTest02() {

        // Given
        int a = 21;
        int b = 19;

        // When
        Boolean expected = true;
        Boolean actual = Problem.oneTeen(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void oneTeenTest03() {

        // Given
        int a = 13;
        int b = 13;

        // When
        Boolean expected = false;
        Boolean actual = Problem.oneTeen(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}