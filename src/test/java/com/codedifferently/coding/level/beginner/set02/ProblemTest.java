package com.codedifferently.coding.level.beginner.set02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    // Problem 11
    @Test
    public void everyOtherTest01(){

        // Given
        String word = "Miracle";
        int number = 2;

        // When
        String expected = "Mrce";
        String actual = Problem.everyOther(word, number);
    }

    @Test
    public void everyOtherTest02(){

        // Given
        String word = "abcdefg";
        int number = 2;

        // When
        String expected = "aceg";
        String actual = Problem.everyOther(word, number);
    }

    @Test
    public void everyOtherTest03(){

        // Given
        String word = "abcdefg";
        int number = 3;

        // When
        String expected = "adg";
        String actual = Problem.everyOther(word, number);
    }


    // Problem 12
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


    // Problem 13
    @Test
    public void puppyCryTest01() {

        // Given
        Boolean cry = true;
        int time = 6;

        // When
        Boolean expected = true;
        Boolean actual = Problem.puppyCry(cry, time);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void puppyCryTest02() {

        // Given
        Boolean cry = true;
        int time = 7;

        // When
        Boolean expected = false;
        Boolean actual = Problem.puppyCry(cry, time);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void puppyCryTest03() {

        // Given
        Boolean cry = false;
        int time = 6;

        // When
        Boolean expected = false;
        Boolean actual = Problem.puppyCry(cry, time);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    // Problem 14
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


    // Problem 15
    @Test
    public void exchangeTest01() {

        // Given
        String str = "code";

        // When
        String expected = "eodc";
        String actual = Problem.exchange(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void exchangeTest02() {

        // Given
        String str = "a";

        // When
        String expected = "a";
        String actual = Problem.exchange(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void exchangeTest03() {

        // Given
        String str = "ab";

        // When
        String expected = "ba";
        String actual = Problem.exchange(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    // Problem 16
    @Test
    public void multipleOfTest01() {

        // Given
        int n = 3;

        // When
        Boolean expected = true;
        Boolean actual = Problem.multipleOf(n);

        // Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void multipleOfTest02() {

        // Given
        int n = 10;

        // When
        Boolean expected = true;
        Boolean actual = Problem.multipleOf(n);

        // Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void multipleOfTest03() {

        // Given
        int n = 8;

        // When
        Boolean expected = false;
        Boolean actual = Problem.multipleOf(n);

        // Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void multipleOfTest04() {

        // Given
        int n = 58;

        // When
        Boolean expected = false;
        Boolean actual = Problem.multipleOf(n);

        // Then
        Assertions.assertEquals(expected,actual);
    }


    // Problem 17
    @Test
    public void checkTempTest01(){

        // Given
        int a = 120;
        int b = -1;

        // When
        Boolean expected = true;
        Boolean actual = Problem.checkTemp(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkTempTest02(){

        // Given
        int a = -1;
        int b = 120;

        // When
        Boolean expected = true;
        Boolean actual = Problem.checkTemp(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkTempTest03(){

        // Given
        int a = 2;
        int b = 120;

        // When
        Boolean expected = false;
        Boolean actual = Problem.checkTemp(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkTempTest04(){

        // Given
        int a = 0;
        int b = 115;

        // When
        Boolean expected = false;
        Boolean actual = Problem.checkTemp(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    // Problem 18
    @Test
    public void oneTeenTest01() {

        // Given
        int a = 13;
        int b = 99;

        // When
        Boolean expected = true;
        Boolean actual = Problem.oneTeen(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void oneTeenTest02() {

        // Given
        int a = 21;
        int b = 19;

        // When
        Boolean expected = true;
        Boolean actual = Problem.oneTeen(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void oneTeenTest03() {

        // Given
        int a = 13;
        int b = 13;

        // When
        Boolean expected = false;
        Boolean actual = Problem.oneTeen(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    // Problem 19
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


    // Problem 20
    @Test
    public void range3050Test01() {

        // Given
        int a = 30;
        int b = 31;

        // When
        Boolean expected = true;
        Boolean actual = Problem.range3050(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void range3050Test02() {

        // Given
        int a = 30;
        int b = 41;

        // When
        Boolean expected = false;
        Boolean actual = Problem.range3050(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void range3050Test03() {

        // Given
        int a = 40;
        int b = 50;

        // When
        Boolean expected = true;
        Boolean actual = Problem.range3050(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}