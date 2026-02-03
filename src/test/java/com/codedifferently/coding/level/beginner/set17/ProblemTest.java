package com.codedifferently.coding.level.beginner.set17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void checkTempTest01(){

        // Given
        int a = 120;
        int b = -1;

        // When
        Boolean expected = true;
        Boolean actual = Problem.checkTemp(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkTempTest02(){

        // Given
        int a = -1;
        int b = 120;

        // When
        Boolean expected = true;
        Boolean actual = Problem.checkTemp(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkTempTest03(){

        // Given
        int a = 2;
        int b = 120;

        // When
        Boolean expected = false;
        Boolean actual = Problem.checkTemp(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkTempTest04(){

        // Given
        int a = 0;
        int b = 115;

        // When
        Boolean expected = false;
        Boolean actual = Problem.checkTemp(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}