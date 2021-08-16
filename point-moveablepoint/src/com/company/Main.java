package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Point poin = new Point(3,4);
        System.out.println(poin.toString());
        MoveAblePoint movePoint = new MoveAblePoint(4,3);
        System.out.println(movePoint.toString());
        movePoint.move();
        System.out.println(movePoint.toString());


    }
}
