package com.codedifferently.coding.level.beginner.set31;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void goingUpTest01() {

        // Given
        String str = "Hello";

        // When
        String expected = "HeLLO";
        String actual = Problem.goingUp(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void goingUpTest02() {

        // Given
        String str = "hi there";

        // When
        String expected = "hi thERE";
        String actual = Problem.goingUp(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void goingUpTest03() {

        // Given
        String str = "hi";

        // When
        String expected = "HI";
        String actual = Problem.goingUp(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}