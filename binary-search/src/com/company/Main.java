package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int[] array = {10, 5, 6, 7, 4, 5, 2, 12, 15, 43, 12, 7};
        System.out.println("Arrary is: ");
        showArray(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Array after sorting is: ");
        showArray(array);
        System.out.println();
        System.out.println("Enter your number you need to find:");
        int key = scanner.nextInt();
        if (binarySearch(array,key)!=-1) {
            System.out.println("Number is in array");
        } else
            System.out.println("Number not in array");
    }

    private static int binarySearch(int[] array,int key) {
        int left = 0;
        int right = array.length-1;
        while (right >= left) {
            int mid = (left+right)/2;
            if (key < mid) {
                right = mid -1;
            } else if (key>mid) {
                left = mid +1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
    }

}
