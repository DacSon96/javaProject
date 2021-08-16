package com.company;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbsoluteNumberCalculatorTest {
    @Test
    public void testFindAbsolute() {
        int number = 3;
        int expected = 3;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);

    }
    @Test
    public void testFindAbsolute1() {
        int number = 5;
        int expected = 5;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);

    }
@Test
public void testFindAbsoluteNegative1() {
        int number = -9;
        int expected = 9;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);

    }

}