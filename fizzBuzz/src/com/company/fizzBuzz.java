package com.company;

class FizzBuzz {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public static String showFizzBuzz(int number) {
        boolean isBuzzNumber = number % 5 == 0;
        boolean isFizzNumber = number % 3 == 0;
        if (isFizzNumber && isBuzzNumber) {
            return FIZZ + BUZZ;
        } else if (isFizzNumber) {
            return FIZZ;
        } else if (isBuzzNumber) {
            return BUZZ;
        } else {
            String stringNumber = number + "";
            for (int i = 0; i < stringNumber.length(); i++) {
                char numberChar = stringNumber.charAt(i);
                int chartNumber = Integer.parseInt(String.valueOf(numberChar));
                if (chartNumber == 3) {
                    return FIZZ;
                } else if (chartNumber == 5) {
                    return BUZZ;
                }
            }
            return number + "";
        }
    }
}
