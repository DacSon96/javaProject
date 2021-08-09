package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 4, 6, 7, 8, 6};
        System.out.println("Nhập số cần xóa: ");
        int element = scanner.nextInt();
        int[] newArr = delElement(element, arr);
        System.out.println("Mảng sau khi xóa là: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + "\t");
        }
    }

    public static int[] delElement(int element, int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                count++;
            }
        }
        int[] newArr = new int[arr.length - count];
        int count1 = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == element) {
                count1++;
                continue;
            }
            newArr[j - count1] = arr[j];
        }
        return newArr;
    }
}
