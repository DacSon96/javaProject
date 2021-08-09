package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] arr= new int[3][4];
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Mảng đang có là: {");
        for (int row = 0; row < arr.length; row++) {
            System.out.print("{");
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column]);
                if (column==arr[row].length-1) {
                    continue;
                }
                System.out.print(",");
            }
            System.out.println("}");
        }
        System.out.println("}");
        int max=findMax(arr);
        System.out.println("Phần tử lớn nhất là: "+max);
    }
    public static int findMax(int[][] arr) {
        int max=arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (max<arr[row][column]) {
                    max=arr[row][column];
                }
            }
        }
        return max;
    }
}
