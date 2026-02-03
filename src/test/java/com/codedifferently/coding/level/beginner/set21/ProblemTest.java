package com.codedifferently.coding.level.beginner.set21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void compareLastDigitTest01() {

        // Given
        int a = 7;
        int b = 17;

        // When
        Boolean expected = true;
        Boolean actual = Problem.compareLastDigit(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void compareLastDigitTest02() {

        // Given
        int a = 6;
        int b = 17;

        // When
        Boolean expected = false;
        Boolean actual = Problem.compareLastDigit(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void compareLastDigitTest03() {

        // Given
        int a = 3;
        int b = 113;

        // When
        Boolean expected = true;
        Boolean actual = Problem.compareLastDigit(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}