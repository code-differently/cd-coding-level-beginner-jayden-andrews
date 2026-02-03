package com.codedifferently.coding.level.beginner.set12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void dogTroubleTest01(){

        // Given
        Boolean bulldog = true;
        Boolean lab = true;

        // When
        Boolean expected = true;
        Boolean actual = Problem.dogTrouble(bulldog, lab);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void dogTroubleTest02(){

        // Given
        Boolean bulldog = false;
        Boolean lab = false;

        // When
        Boolean expected = true;
        Boolean actual = Problem.dogTrouble(bulldog, lab);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void dogTroubleTest03(){

        // Given
        Boolean bulldog = true;
        Boolean lab = false;

        // When
        Boolean expected = false;
        Boolean actual = Problem.dogTrouble(bulldog, lab);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}