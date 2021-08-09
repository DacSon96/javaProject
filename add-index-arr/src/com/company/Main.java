package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr= {10,4,6,7,8};
        System.out.println("Enter new value");
        int value = scanner.nextInt();

        System.out.println("Enter position of new value ");
        int index= scanner.nextInt();

        System.out.println("Result is: ");
        int[] newArr=addValue(value,index,arr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+"\t");
        }

    }
    public static int[] addValue(int value,int index,int[] arr) {
        int[] newArr= new int[arr.length+1];
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (i==index) {
                newArr[i]=value;
                count++;
            }
            newArr[i+count]=arr[i];
        }
        return newArr;
    }
}
