package com.company;

public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;
//    private int temp = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }
    public boolean isQueueFull() {
            return capacity == currentSize;
    }
    public boolean isQueueEmpty() {
        return currentSize==0;
    }
    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow ! Unable to add element");
        } else {
            tail=queueArr[0];
            queueArr[0]=item;
            for (int i = 0; i < currentSize; i++) {
                int temp=queueArr[i];
                queueArr[i]=
            }
            currentSize++;
            System.out.println("Element "+item+" is pushed to Queue");
        }
    }
    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Pop operation done ! remove: "+queueArr[head-1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! remove: "+queueArr[head-1]);
            }
            currentSize--;
        }
    }
    public void showQueue() {
        for (int i = 0; i < currentSize; i++) {
            System.out.println(queueArr[i]);
        }
    }
}
