package com.codedifferently.coding.level.beginner.set14;

import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void checkPosOrNegTest01(){

        // Given
        int a = 1;
        int b = -1;
        Boolean neg = false;

        // When
        Boolean expected = true;
        Boolean actual = Problem.checkPosOrNeg(a, b, neg);
    }

    @Test
    public void checkPosOrNegTest02(){

        // Given
        int a = -1;
        int b = 1;
        Boolean neg = false;

        // When
        Boolean expected = true;
        Boolean actual = Problem.checkPosOrNeg(a, b, neg);
    }

    @Test
    public void checkPosOrNegTest03(){

        // Given
        int a = -4;
        int b = -5;
        Boolean neg = true;

        // When
        Boolean expected = true;
        Boolean actual = Problem.checkPosOrNeg(a, b, neg);
    }
}