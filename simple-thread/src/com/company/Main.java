package com.company;

public class Main{

    public static void main(String[] args) {
	// write your code here
        NumberGenerator n1 = new NumberGenerator("n1");
        NumberGenerator n2 = new NumberGenerator("n2");
        n1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Độ ưu tiên của n1: "+n1.getPriority());
        n2.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Độ ưu tiên của n2: "+n2.getPriority());
        n1.start();
        n2.start();
    }
}
