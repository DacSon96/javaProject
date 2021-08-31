package com.company;

import static com.company.Solution.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Queue q = new Queue();
        q.front = null;
        q.rear = null;
        enQueue(q, 14);
        enQueue(q, 16);
        enQueue(q, 18);
        displayQueue(q);
        System.out.println();

        System.out.println("Deleted value ="+deQueue(q));
        System.out.println("Deleted value ="+deQueue(q));
        displayQueue(q);
        enQueue(q,9);
        enQueue(q,20);
        displayQueue(q);

    }
}
