package com.codedifferently.coding.level.beginner.set19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void beginWithOzTest01() {

        // Given
        String str = "ozymandias";

        // When
        String expected = "oz";
        String actual = Problem.beginWithOz(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void beginWithOzTest02() {

        // Given
        String str = "bzoo";

        // When
        String expected = "z";
        String actual = Problem.beginWithOz(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void beginWithOzTest03() {

        // Given
        String str = "oxx";

        // When
        String expected = "o";
        String actual = Problem.beginWithOz(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}