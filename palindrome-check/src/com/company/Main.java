package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Palindrome check");
        System.out.println("Enter string need to check: ");
        String stringNeedCheck = scanner.nextLine().toLowerCase();
        char[] stringToChar = stringNeedCheck.toCharArray();
        Stack<Character> stringStack = new Stack<>();
        for (int i = 0; i < stringToChar.length; i++) {
            stringStack.push(stringToChar[i]);
        }
        char[] reverseChar = new char[stringToChar.length];
        for (int i = 0; i < reverseChar.length; i++) {
            reverseChar[i] =stringStack.pop();
        }
        String reverseString = String.valueOf(reverseChar);
        boolean palindromeCheck = stringNeedCheck.equals(reverseString);
        if (palindromeCheck) {
            System.out.println("String is Palindrome string");
        } else
            System.out.println("String is not Palindrome String");


    }
}
