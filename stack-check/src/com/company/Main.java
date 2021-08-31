package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        Stack<Character> characters = new Stack<>();
        System.out.println("Nhập biểu thức toàn học cần check");
        String strings = scanner.nextLine();
        if (charactersCheck(characters, strings)) {
            System.out.println("Well");
        } else
            System.out.println("????");
    }

    private static boolean charactersCheck(Stack<Character> characters, String strings) {
        char[] stringsToChar = strings.toCharArray();
        for (int i = 0; i < stringsToChar.length; i++) {
            if (stringsToChar[i] == '(') {
                characters.push(stringsToChar[i]);
            }
            if (stringsToChar[i] == ')') {
                if (characters.isEmpty()) {
                    return false;
                } else {
                    characters.pop();
                }
            }
        }
        if (characters.isEmpty())
        return true;
        else
            return false;
    }
}
