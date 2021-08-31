package com.queue;


public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Depueued item is: "+queue.dequeue().key);
        System.out.println("Depueued item is: "+queue.dequeue().key);
        System.out.println("Depueued item is: "+queue.dequeue().key);
        System.out.println("Depueued item is: "+queue.dequeue().key);
        System.out.println("Depueued item is: "+queue.dequeue().key);
        System.out.println("Depueued item is: "+queue.dequeue().key);

    }
}
