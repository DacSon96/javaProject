package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập kích cỡ mảng: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Kích cỡ phải nhỏ hơn 20");
        } while (size > 20);
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mảng vừa nhập là");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\n");
        int max = arr[0];
        int index=0;
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i + 1;
            }
        }
        System.out.println("Số lớn nhất là: " + max + ", nằm ở vị trí: " + index);
    }
}
