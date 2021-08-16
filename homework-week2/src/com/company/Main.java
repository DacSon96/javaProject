package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        CrispyFlour flour1 = new CrispyFlour(LocalDate.of(2020, 10, 10), 30, 25);
        System.out.println(flour1);
        double amount1 = flour1.getAmount();
        System.out.println("Giá chua chiếu khấu là: "+amount1);
        double realMoney1 = flour1.getRealMoney();
        System.out.println("Giá sau chiết khấu là: "+realMoney1);
        System.out.println("Chênh lệch chiếu khấu và không chiết khấu là: "+(amount1-realMoney1));


    }
}
