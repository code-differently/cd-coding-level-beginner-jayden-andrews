package com.codedifferently.coding.level.beginner.set24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void beginWithNotTest01() {

        // Given
        String str = "candy";

        // When
        String expected = "not candy";
        String actual = Problem.beginWithNot(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void beginWithNotTest02() {

        // Given
        String str = "x";

        // When
        String expected = "not x";
        String actual = Problem.beginWithNot(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void beginWithNotTest03() {

        // Given
        String str = "not bad";

        // When
        String expected = "not bad";
        String actual = Problem.beginWithNot(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}