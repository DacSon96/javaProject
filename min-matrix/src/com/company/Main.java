package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng");
        int arrRow = scanner.nextInt();
        System.out.println("Nhập số cột");
        int arrColumn = scanner.nextInt();
        int[][] arr = new int[arrRow][arrColumn];
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = (int) (Math.random() * 100-Math.random()*100);
            }
        }
        System.out.println("Mảng đang có là: {");
        for (int row = 0; row < arr.length; row++) {
            System.out.print("{");
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column]);
                if (column == arr[row].length - 1) {
                    continue;
                }
                System.out.print(",");
            }
            System.out.println("}");
        }
        int min = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] < min) {
                    min = arr[row][column];
                }
            }
        }
        System.out.println("Số nhỏ nhất của mảng là: "+min);
    }
}
