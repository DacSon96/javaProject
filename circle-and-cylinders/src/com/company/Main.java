package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1.toString());
        Cylinder cylender2 = new Cylinder(3,2,"red");
        cylender2.setColor("Blue");
        System.out.println("Cylender 2 color is: "+cylender2.getColor());
    }
}
