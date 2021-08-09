package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter a mark for student " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        int count = 0;
        System.out.println("List of mark: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "\t");
            if ((arr[i] >= 5 && arr[i] <= 10)) {
                count++;
            }
        }
        System.out.println("\n The number of students passing the exam is: "+count);

    }

}
