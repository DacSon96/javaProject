package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        ClassnameCheck classnameCheck = new ClassnameCheck();
        System.out.println("Enter class name");
        String className = scanner.nextLine();
        if (classnameCheck.validate(className)) {
            System.out.println("Correct name");
        } else {
            System.out.println("Incorrect name");
        }
    }
}
