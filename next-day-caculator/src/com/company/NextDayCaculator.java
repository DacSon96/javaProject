package com.company;

import java.time.LocalDate;

public class NextDayCaculator {
    //    LocalDate dayNeedToCaculate = LocalDate.of(2018,1,1);
    public static LocalDate dayCaculated(LocalDate dayNeedToCaculate) {
        return dayNeedToCaculate.plusDays(1);
    }
}
