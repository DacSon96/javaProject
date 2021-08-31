package com.company;

import javafx.scene.CacheHint;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String string = scanner.nextLine();

        for (int i = 0; i < string.length(); i++) {
            if (list.size()> 1 && string.charAt(i)<=list.getLast() && list.contains(string.charAt(i))) {
                list.clear();
            }
            list.add(string.charAt(i));

            if (list.size()> max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        System.out.println("Maximum sting is ");
        for (Character ch : max) {
            System.out.print(ch);
        }

    }
}
