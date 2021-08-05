package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số số nguyên tố cần hiển thị: ");
        int number = scanner.nextInt();
        int N = 2;
        for (int count = 0; count < number ;) {
            boolean check = true;
            int i =2;
            while (i<N) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
}
