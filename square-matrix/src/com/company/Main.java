package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter square matrix size: ");
        int size = scanner.nextInt();
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j]= (int) (Math.random()*100);
            }
        }
        System.out.println("Your square matrix is: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i==j) {
                    sum+= arr[i][j];
                }
            }
        }
        System.out.println("Sum of this square matrix main diagonal is: "+sum);
    }
}
