package com.company;

public class QuadraticEquation {
    private final double a;
    private final double b;
    private final double c;

    QuadraticEquation(double newa, double newb, double newc) {
        a=newa;
        b=newb;
        c=newc;
    }
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant() {
        return b*b-4*a*c;
    }
}
