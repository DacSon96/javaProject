package com.company;

import com.company.animal.Animal;
import com.company.animal.Chicken;
import com.company.animal.Tiger;
import com.company.edible.Edible;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
    }
}
