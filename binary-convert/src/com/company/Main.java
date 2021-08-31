package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        BinaryStack stack = new BinaryStack();
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        while (number!=0) {
            stack.push(number%2);
            number/=2;
        }
        System.out.print("Number in binary is: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

    }
}
