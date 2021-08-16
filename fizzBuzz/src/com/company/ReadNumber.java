package com.company;

public class ReadNumber {
    public static String readNumber(int number) {
        int tens = number / 10;
        int ones = number % 10;
        String tensString = "";
        String oneString = "";
        if ((number>=100)||(number<0)){
            return "lỗi";
        }
        switch (tens) {
            case 1:
                tensString = "mười ";
                break;
            case 2:
                tensString = "hai mươi ";
                break;
            case 3:
                tensString = "ba mươi ";
                break;
            case 4:
                tensString = "bốn mươi ";
                break;
            case 5:
                tensString = "năm mươi ";
                break;
            case 6:
                tensString = "sáu mươi ";
                break;
            case 7:
                tensString = "bảy mươi ";
                break;
            case 8:
                tensString = "tám mươi ";
                break;
            case 9:
                tensString = "chín mươi ";
                break;
        }
        switch (ones) {
            case 0:
                if (tens >= 2) {
                oneString = "mươi";
                } else
                    oneString = "Không";
                break;
            case 1:
                oneString = "một";
                break;
            case 2:
                oneString = "hai";
                break;
            case 3:
                oneString = "ba";
                break;
            case 4:
                oneString = "bốn";
                break;
            case 5:
                oneString = "năm";
                break;
            case 6:
                oneString = "sáu";
                break;
            case 7:
                oneString = "bảy";
                break;
            case 8:
                oneString = "tám";
                break;
            case 9:
                oneString = "chín";
                break;

        }
        String result = tensString+oneString;
        return result;
    }
}
