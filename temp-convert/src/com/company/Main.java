package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        System.out.println("Menu.");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                celsius=fahrenheitToCelsius(fahrenheit);
                System.out.println("Celsius is: "+celsius);
                break;
            case 2:
                System.out.println("Enter celsius: ");
                celsius = scanner.nextDouble();
                fahrenheit=celsiusToFahrenheit(celsius);
                System.out.println("Fahrenheit is: "+fahrenheit);
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Wrong choise");
                break;
        }
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }
}
