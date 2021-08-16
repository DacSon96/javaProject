package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(4);
        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
    }
}
