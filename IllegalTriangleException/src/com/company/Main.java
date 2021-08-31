package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập canh a tam giác");
            double a = scanner.nextDouble();
            System.out.println("Nhập canh b tam giác");
            double b = scanner.nextDouble();
            System.out.println("Nhập canh c tam giác");
            double c = scanner.nextDouble();
            if (a+b<c||a+c<b||b+c<a||a<0||b<0||c<0) {
                IllegalTriangleException();
            }
        } catch (Exception e) {
            System.out.println("Nhập sai giá trị");;
        }

    }
    public static void IllegalTriangleException() {
        throw new Error();
    }

}
