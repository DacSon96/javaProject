package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        PhoneNumberRegex phoneNumberRegex = new PhoneNumberRegex();
        System.out.println("Enter phone number");
        String number = scanner.nextLine();
        boolean check = phoneNumberRegex.validate(number);
        if (check) {
            System.out.println("Phone number is correct");
        } else {
            System.out.println("Phone number is incorrect");
        }
    }
}
