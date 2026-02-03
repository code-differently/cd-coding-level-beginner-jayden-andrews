package com.codedifferently.coding.level.beginner.set07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void containTeenTest01(){

        // Given
        int a = 13;
        int b = 20;
        int c = 10;

        // When
        Boolean expected = true;
        Boolean actual = Problem.containTeen(a,b,c);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void containTeenTest02(){

        // Given
        int a = 20;
        int b = 19;
        int c = 10;

        // When
        Boolean expected = true;
        Boolean actual = Problem.containTeen(a,b,c);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void containTeenTest03(){

        // Given
        int a = 20;
        int b = 10;
        int c = 13;

        // When
        Boolean expected = true;
        Boolean actual = Problem.containTeen(a,b,c);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}