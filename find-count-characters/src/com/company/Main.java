package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String arr = scanner.nextLine();
        System.out.println("Enter your character you need to count");
        char character = scanner.nextLine().charAt(0);
        int count=0;
        for (int i = 0; i < arr.length(); i++) {
            if (arr.charAt(i)==character)
                count++;
            }
        System.out.println("There is "+count+" character: "+character);
        }
    }
