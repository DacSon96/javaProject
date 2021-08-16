package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a:");
        double a = scanner.nextDouble();
        System.out.println("Nhập b:");
        double b = scanner.nextDouble();
        System.out.println("Nhập c:");
        double c = scanner.nextDouble();
        double delta = new QuadraticEquation(a, b, c).getDiscriminant();
        if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép là: " + x);
        } else if (delta>0) {
            double x1 = (-b+Math.sqrt(delta))/(2*a);
            double x2 = (-b-Math.sqrt(delta))/(2*a);
            System.out.println("Phương trình có 2 nghiệm là x1= "+x1+" và x2= "+x2);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
