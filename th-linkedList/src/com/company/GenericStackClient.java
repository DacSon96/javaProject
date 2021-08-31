package com.company;

public class GenericStackClient {
    public static void main(String[] args) {
        // write your code here
        System.out.println("1. Stack of integers");
        stackOfStrings();
        System.out.println("\n2. Stack of Strings");
        stackOfIntergers();
    }
    private static void stackOfStrings() {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: "+ stack.size());
        System.out.println("1.2 Pop element from stack :");
        while (!stack.isEmpty()) {
            System.out.printf(" %s",stack.pop());
        }
        System.out.println("\n1.3> Size of the stack after pop operations : "+ stack.size());
    }
    private static void stackOfIntergers() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("1.1 Size of stack after push operations: "+ stack.size());
        System.out.println("1.2 Pop element from stack :");
        while (!stack.isEmpty()) {
            System.out.printf(" %d",stack.pop());
        }
        System.out.println("\n1.3> Size of the stack after pop operations : "+ stack.size());
    }
}
