package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[6];
        int[] arr3 = new int[arr1.length + arr2.length];
        System.out.println("Nhập phần tử mảng 1: ");
        newArray(arr1);
        System.out.println("Mảng 1 là: ");
        showArr(arr1);
        System.out.println("Nhập phần tử mảng 2: ");
        newArray(arr2);
        System.out.println("Mảng 2 là: ");
        showArr(arr2);
        mergeArr(arr3, arr1, arr2);
        System.out.println("Mảng 3 sau khi gộp là: ");
        showArr(arr3);
    }

    public static void newArray(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng: ");
            arr[i] = scanner.nextInt();
        }
    }

    public static void showArr(int[] arr) {
        for (int j : arr) {
            System.out.print(j + "\t");
        }
        System.out.println("\n");
    }

    public static void mergeArr(int[] arr3, int[] arr1, int[] arr2) {
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
    }
}
