package com.company;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReadNumberTest {
    @Test
    public void readNumberTest1() {
        int number = 23;
        String expected = "hai mươi ba";

        String result = ReadNumber.readNumber(number);
        assertEquals(expected,result);
    }
@Test
    public void readNumberTest2() {
        int number = 15;
        String expected = "mười năm";

        String result = ReadNumber.readNumber(number);
        assertEquals(expected,result);
    }
@Test
    public void readNumberTest3() {
        int number = 11;
        String expected = "mười một";

        String result = ReadNumber.readNumber(number);
        assertEquals(expected,result);
    }
@Test
    public void readNumberTest4() {
        int number = 99;
        String expected = "chín mươi chín";

        String result = ReadNumber.readNumber(number);
        assertEquals(expected,result);
    }
@Test
    public void readNumberTest5() {
        int number = 8;
        String expected = "tám";

        String result = ReadNumber.readNumber(number);
        assertEquals(expected,result);
    }
@Test
    public void readNumberTest6() {
        int number = 49;
        String expected = "bốn mươi chín";

        String result = ReadNumber.readNumber(number);
        assertEquals(expected,result);
    }
@Test
    public void readNumberTest7() {
        int number = 120;
        String expected = "lỗi";

        String result = ReadNumber.readNumber(number);
        assertEquals(expected,result);
    }

}