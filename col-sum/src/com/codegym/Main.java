package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row: ");
        int row = scanner.nextInt();
        System.out.println("Enter column: ");
        int col = scanner.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Array is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Enter a column you want to calculate");
        int colNum = scanner.nextInt();
        int sumCol=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j==colNum-1) {
                    sumCol+=arr[i][j];
                }
            }
        }
        System.out.println("Sum of column "+colNum+" is: "+sumCol);
    }
}
