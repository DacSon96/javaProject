package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị USD muốn chuyển đổi");
        int monneyUSD = scanner.nextInt();
        int monneyVND = monneyUSD * 23000;
        System.out.println("Giá trị sau khi chuyển đổi là: " + monneyVND + " VND");

    }
}
