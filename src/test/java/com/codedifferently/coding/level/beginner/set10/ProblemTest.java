package com.codedifferently.coding.level.beginner.set10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void containETest01() {

        // Given
        String str = "Hello";

        // When
        Boolean expected = true;
        Boolean actual = Problem.containE(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void containETest02() {

        // Given
        String str = "Heelle";

        // When
        Boolean expected = true;
        Boolean actual = Problem.containE(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void containETest03() {

        // Given
        String str = "Heelele";

        // When
        Boolean expected = false;
        Boolean actual = Problem.containE(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

}