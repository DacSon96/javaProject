package com.company;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class BinaryStack<T> {
    private LinkedList<Integer> stack;

    public BinaryStack(){
        stack = new LinkedList<>();
    }
    public void push(int element) {
        stack.addFirst(element);
    }
    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public int size() {
        return stack.size();
    }

}
