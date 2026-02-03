package com.codedifferently.coding.level.beginner.set23;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void lookOut10Test01() {

        // Given
        int a = 9;
        int b = 10;

        // When
        Boolean expected = true;
        Boolean actual = Problem.lookOut10(a,b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lookOut10Test02() {

        // Given
        int a = 9;
        int b = 9;

        // When
        Boolean expected = false;
        Boolean actual = Problem.lookOut10(a,b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lookOut10Test03() {

        // Given
        int a = 1;
        int b = 9;

        // When
        Boolean expected = true;
        Boolean actual = Problem.lookOut10(a,b);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}