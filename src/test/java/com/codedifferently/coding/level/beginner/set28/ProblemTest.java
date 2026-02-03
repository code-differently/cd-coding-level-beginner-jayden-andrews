package com.codedifferently.coding.level.beginner.set28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void deleteDelTest01() {

        // Given
        String str = "adelbc";

        // When
        String expected = "abc";
        String actual = Problem.deleteDel(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void deleteDelTest02() {

        // Given
        String str = "adelHello";

        // When
        String expected = "aHello";
        String actual = Problem.deleteDel(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void deleteDelTest03() {

        // Given
        String str = "adedbc";

        // When
        String expected = "adedbc";
        String actual = Problem.deleteDel(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}