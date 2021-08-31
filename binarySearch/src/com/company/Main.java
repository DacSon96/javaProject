package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();
        int[] list = new int[15];
        for (int i = 0; i < list.length; i++) {
            list[i] = generator.nextInt(100);
        }
        System.out.println("List before sort:");
        showList(list);
        System.out.println("List after sorted");
        int[] newList =sortList(list);
        showList(list);
        System.out.println("Enter key need to find: ");
        int key = scanner.nextInt();
        int result = binarySearch(newList,key);
        if (result !=-1){
            System.out.println("Key locaton is: "+result);
        } else System.out.println("No key in list");
    }

    public static void showList(int[] list) {
        System.out.print("{");
        for (int i = 0; i < list.length-1; i++) {
            System.out.print(list[i]+",");
        }
        System.out.print(list[list.length-1]);
        System.out.println("}");
    }

    public static int[] sortList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int min = list[i];
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (min > list[j]) {
                    min = list[j];
                    minIndex = j;
                }
            }
            if (min != list[i]) {
                int temp = list[i];
                list[i] = min;
                list[minIndex] = temp;
            }
        }
        return list;
    }
    public static int binarySearch(int[] list, int key) {
        int low =0;
        int high= list.length-1;
        while (high>=low) {
            int mid = (low+high)/2;
            if (key > list[mid]) {
                low = mid +1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                high = mid -1;
            }
        }
        return -1;
    }

}
