package com.codedifferently.coding.level.beginner.set26;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void double22Test01() {

        // Given
        String str = "kitten";

        // When
        String expected = "kikittenki";
        String actual = Problem.double22(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void double22Test02() {

        // Given
        String str = "Ha";

        // When
        String expected = "HaHaHa";
        String actual = Problem.double22(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void double22Test03() {

        // Given
        String str = "abc";

        // When
        String expected = "ababcab";
        String actual = Problem.double22(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}