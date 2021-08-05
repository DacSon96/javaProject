package com.codegym;


public class Main {
    public static void main(String[] args) {
        System.out.println("Số nguyên tố nhỏ hơn 100 cần hiển thị là: ");
        for (int N = 2; N < 100 ;N++) {
            boolean check = true;
            int j =2;
            while (j<N) {
                if (N % j == 0) {
                    check = false;
                    break;
                }
                j++;
            }
            if (check) {
                System.out.println(N);
            }
        }
    }
}
