package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double money;
        int month;
        double interestRate;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = input.nextDouble();
        System.out.println("Enter number of months: ");
        month = input.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = input.nextDouble()/100;
        double totalInterest = money;
        double monthInterestRate = interestRate/12;
        for(int i = 0; i < month; i++){
            money += money * monthInterestRate;
        }
        System.out.println("Total of interest: " + (money-totalInterest));
    }
}
