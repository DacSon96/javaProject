package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string  = scanner.nextLine();
        System.out.println(stringArrange(string));

    }
    public static String stringArrange(String string) {
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j < string.length(); j++) {
                if (string.charAt(i)>string.charAt(j)) {

                }
            }
        }
        String arrangedString = String.valueOf(stringToChar,0,4);
        return arrangedString;
    }
}
