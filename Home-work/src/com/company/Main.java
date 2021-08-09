package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] arr = newArr();
        showArr(arr);
        String[] indexArr = addProduct(arr);
        showArr(indexArr);
        String[] removeProduct = removeProduct(indexArr);
        showArr(removeProduct);
        int searchProduct = searchProduct(removeProduct);
        if (searchProduct > 0) {
            System.out.println("Sản phầm cần tìm nằm ở vị trí thứ " + (searchProduct + 1));
        } else {
            System.out.println("Không có sản phẩm cần tìm trong mảng.  ");
        }
        System.out.println("Mảng sau khi sắp xếp là: ");
        String[] sortArr = sortArr(removeProduct);
        showArr(sortArr);
        String[] updateArr = updateArr(removeProduct);
        showArr(updateArr);
    }

    public static String[] newArr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số sản phẩm của mảng");
        int n = scanner.nextInt();
        String[] arr = new String[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập sản phẩm thứ " + (i + 1) + " của mảng: ");
            arr[i] = scanner.nextLine();
        }
        return arr;
    }

    public static void showArr(String[] arr) {
        System.out.println("Mảng tên sản phẩm là: ");
        System.out.print("{");
        for (String s : arr) {
            System.out.print(s + ",");
        }
        System.out.println("}");
    }

    public static String[] addProduct(String[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vị trí muốn thêm sản phẩm: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tên sản phẩm muốn thêm: ");
        String newProduct = scanner.nextLine();
        System.out.println();
        String[] newArr = new String[arr.length + 1];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == index + 1) {
                newArr[i] = newProduct;
                count++;
            }
            newArr[i + count] = arr[i];
        }
        return newArr;
    }

    public static String[] removeProduct(String[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm muốn xóa: ");
        String removeProduct = scanner.nextLine();
        String[] newArr = new String[arr.length - 1];
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].equals(removeProduct)) {
                count++;
            }
            newArr[i] = arr[i + count];
        }
        return newArr;
    }

    public static int searchProduct(String[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập sản phẩm cần tìm: ");
        String searchProduct = scanner.nextLine();
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(searchProduct)) {
                flag = i;
            }
        }
        return flag;
    }

    public static String[] sortArr(String[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static String[] updateArr(String[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vị trí sản phẩm muốn cập nhật: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên mới sản phẩm: ");
        String updateProduct = scanner.nextLine();
        String[] newArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == index+1) {
                newArr[i] = updateProduct;
            } else {
                newArr[i] = arr[i];
            }
        }
        return newArr;
    }
}
