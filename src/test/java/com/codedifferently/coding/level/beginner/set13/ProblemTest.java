package com.codedifferently.coding.level.beginner.set13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void puppyCryTest01() {

        // Given
        Boolean cry = true;
        int time = 6;

        // When
        Boolean expected = true;
        Boolean actual = Problem.puppyCry(cry, time);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void puppyCryTest02() {

        // Given
        Boolean cry = true;
        int time = 7;

        // When
        Boolean expected = false;
        Boolean actual = Problem.puppyCry(cry, time);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void puppyCryTest03() {

        // Given
        Boolean cry = false;
        int time = 6;

        // When
        Boolean expected = false;
        Boolean actual = Problem.puppyCry(cry, time);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}