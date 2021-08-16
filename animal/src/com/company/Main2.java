package com.company;

import com.company.fruit.Apple;
import com.company.fruit.Fruit;
import com.company.fruit.Orange;

public class Main2 {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }

}
