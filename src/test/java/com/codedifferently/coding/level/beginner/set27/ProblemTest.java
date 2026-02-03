package com.codedifferently.coding.level.beginner.set27;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void range1020Test01() {

        // Given
        int a = 12;
        int b = 99;

        // When
        Boolean expected = true;
        Boolean actual = Problem.range1020(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void range1020Test02() {

        // Given
        int a = 21;
        int b = 12;

        // When
        Boolean expected = true;
        Boolean actual = Problem.range1020(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void range1020Test03() {

        // Given
        int a = 8;
        int b = 99;

        // When
        Boolean expected = false;
        Boolean actual = Problem.range1020(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}