package com.company;

public class Solution {
    static void enQueue(Queue q, int value) {
        Node temp = new Node();
        temp.data = value;
        if (q.front == null) {
            q.front = temp;
        } else {
            q.rear.link = temp;
        }
        q.rear = temp;
        q.rear.link = q.front;
    }

    static int deQueue(Queue q) {
        if (q.front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value;
        if (q.front == q.rear) {
            value = q.front.data;
            q.front = null;
            q.rear = null;
        } else {
            Node temp = q.front;
            value = temp.data;
            q.front = q.front.link;
            q.rear.link = q.front;
        }
        return value;
    }

    static void displayQueue(Queue q) {
        Node temp = q.front;
        System.out.println("Elements in Circular Queue are: ");
        while (temp.link != q.front) {
            System.out.printf("%d", temp.data);
            System.out.print("<--");
            temp = temp.link;
        }
        System.out.printf("%d", temp.data);
    }
}
