package com.company;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    @Test
    public void fizzBuzzTest1() {
        int number = 3;
        String expected = "Fizz";

        String result = FizzBuzz.showFizzBuzz(number);
        assertEquals(expected,result);
    }
@Test
    public void fizzBuzzTest2() {
        int number = 15;
        String expected = "FizzBuzz";

        String result = FizzBuzz.showFizzBuzz(number);
        assertEquals(expected,result);
    }
@Test
    public void fizzBuzzTest3() {
        int number = 10;
        String expected = "Buzz";

        String result = FizzBuzz.showFizzBuzz(number);
        assertEquals(expected,result);
    }
@Test
    public void fizzBuzzTest4() {
        int number = 13;
        String expected = "Fizz";

        String result = FizzBuzz.showFizzBuzz(number);
        assertEquals(expected,result);
    }
@Test
    public void fizzBuzzTest5() {
        int number = 152;
        String expected = "Buzz";

        String result = FizzBuzz.showFizzBuzz(number);
        assertEquals(expected,result);
    }

}