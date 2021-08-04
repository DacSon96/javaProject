package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int number = scanner.nextInt();
        String hundredsString = "";
        String tensString = "";
        String onesString = "";
        int hundreds = number / 100;
        int hundredsSurplus = number % 100;
        int tens = hundredsSurplus / 10;
        int ones = hundredsSurplus % 10;
        switch (hundreds) {
            case 1:
                hundredsString = "One hundred ";
                break;
            case 2:
                hundredsString = "Two hundred ";
                break;
            case 3:
                hundredsString = "Three hundred ";
                break;
            case 4:
                hundredsString = "Four hundred ";
                break;
            case 5:
                hundredsString = "Five hundred ";
                break;
            case 6:
                hundredsString = "Six hundred ";
                break;
            case 7:
                hundredsString = "Seven hundred ";
                break;
            case 8:
                hundredsString = "Eight hundred ";
                break;
            case 9:
                hundredsString = "Nine hundred ";
                break;
        }
        if (((tens != 0) || (ones != 0)) && (hundreds != 0)) {
            hundredsString += "and ";
        }
        switch (ones) {
            case 1:
                onesString = "one";
                break;
            case 2:
                onesString = "two";
                break;
            case 3:
                onesString = "three";
                break;
            case 4:
                onesString = "four";
                break;
            case 5:
                onesString = "five";
                break;
            case 6:
                onesString = "six";
                break;
            case 7:
                onesString = "seven";
                break;
            case 8:
                onesString = "eight";
                break;
            case 9:
                onesString = "nine";
                break;
        }
        switch (tens) {
            case 1:
                switch (ones) {
                    case 0:
                        onesString = "ten";
                        break;
                    case 1:
                        onesString = "eleven";
                        break;
                    case 2:
                        onesString = "twelve";
                        break;
                    case 3:
                        onesString = "thirteen";
                        break;
                    case 4:
                        onesString = "fourteen";
                        break;
                    case 5:
                        onesString = "fifteen";
                        break;
                    case 6:
                        onesString = "sixteen";
                        break;
                    case 7:
                        onesString = "seventeen";
                        break;
                    case 8:
                        onesString = "eighteen";
                        break;
                    case 9:
                        onesString = "nineteen";
                        break;
                }
                break;
            case 2:
                tensString = "twenty ";
                break;
            case 3:
                tensString = "thirty ";
                break;
            case 4:
                tensString = "fourty ";
                break;
            case 5:
                tensString = "fifty ";
                break;
            case 6:
                tensString = "sixty ";
                break;
            case 7:
                tensString = "seventy ";
                break;
            case 8:
                tensString = "eighty ";
                break;
            case 9:
                tensString = "ninety ";
                break;
        }
        String result = hundredsString + tensString + onesString;
        if (number == 0)
            result = "zero";
        System.out.print(result);
    }
}
