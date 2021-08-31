package com.company;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String strings = "apple banana apple cafe apple banana cafe cafe";
        System.out.println("Nhập ký tự cần tìm");
        String word = scanner.nextLine();
        int value = 0;

        HashMap<String, Integer> countWord = new HashMap<String, Integer>();
        countWord.put(word,value);
        for (String string : strings.split(" ")) {
            if (Objects.equals(word, string)) {
                value++;
            }
        }
        System.out.println(word+" "+value);


    }
}
