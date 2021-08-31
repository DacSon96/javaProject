package com.codegym;

import java.util.Scanner;

public class GenericStackClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyGenericStack<Integer> stack = new MyGenericStack();
        MyGenericStack<Integer> stack2 = new MyGenericStack();
        int temp;
        System.out.println("Nhập kích cỡ stack: ");
        int size = scanner.nextInt();
        creatStack(scanner, stack, size);

        System.out.print("Phần tử của stack vừa nhập là: ");
        while (!stack.isEmpty()) {
            temp = stack.pop();
            stack2.push(temp);
            System.out.printf(" %s", temp);
        }
        System.out.println();
        System.out.print("Phần tử sau khi đảo ngược là: ");
        while (!stack2.isEmpty()) {
            System.out.printf(" %s", stack2.pop());
        }

    }

    private static void creatStack(Scanner scanner, MyGenericStack<Integer> stack, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ "+(i+1)+" của stack");
            stack.push( scanner.nextInt());
        }
    }
}
