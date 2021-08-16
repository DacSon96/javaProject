package com.company;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleClassifierTest {
    @Test
    public void triangleClassifierTest1() {
        double a = 2;
        double b = 2;
        double c = 2;
        double expected = 1;

        double result =  TriangleClassifier.triangleClassifier(a,b,c);
        assertEquals(expected,result);
    }
@Test
    public void triangleClassifierTest2() {
        double a = 2;
        double b = 2;
        double c = 3;
        double expected = 2;

        double result =  TriangleClassifier.triangleClassifier(a,b,c);
        assertEquals(expected,result);
    }
@Test
    public void triangleClassifierTest3() {
        double a = 3;
        double b = 4;
        double c = 5;
        double expected = 3;

        double result =  TriangleClassifier.triangleClassifier(a,b,c);
        assertEquals(expected,result);
    }
@Test
    public void triangleClassifierTest4() {
        double a = 8;
        double b = 2;
        double c = 3;
        double expected = 0;

        double result =  TriangleClassifier.triangleClassifier(a,b,c);
        assertEquals(expected,result);
    }
@Test
    public void triangleClassifierTest5() {
        double a = -1;
        double b = 2;
        double c = 1;
        double expected = 0;

        double result =  TriangleClassifier.triangleClassifier(a,b,c);
        assertEquals(expected,result);
    }
@Test
    public void triangleClassifierTest6() {
        double a = 0;
        double b = 1;
        double c = 1;
        double expected = 0;

        double result =  TriangleClassifier.triangleClassifier(a,b,c);
        assertEquals(expected,result);
    }

}