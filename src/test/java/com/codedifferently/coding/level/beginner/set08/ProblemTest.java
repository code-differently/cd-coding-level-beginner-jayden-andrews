package com.codedifferently.coding.level.beginner.set08;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void startWithIxTest01(){

        // Given
        String str = "mix snacks";

        // When
        Boolean expected = true;
        Boolean actual = Problem.startWithIx(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void startWithIxTest02(){

        // Given
        String str = "pix snacks";

        // When
        Boolean expected = true;
        Boolean actual = Problem.startWithIx(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void startWithIxTest03(){

        // Given
        String str = "piz snacks";

        // When
        Boolean expected = false;
        Boolean actual = Problem.startWithIx(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void startWithIxTest04(){

        // Given
        String str = "9ix snacks";

        // When
        Boolean expected = true;
        Boolean actual = Problem.startWithIx(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}