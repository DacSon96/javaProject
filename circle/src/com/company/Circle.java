package com.company;

public class Circle {
    private double radius;
    private String color="red";

    Circle() {
        radius = 1.0;
    }
    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }
    public double getArea() {
        return Math.PI*radius*radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
