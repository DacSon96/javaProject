package com.company;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class NextDayCaculatorTest {
@Test
    public void testDayCaculated1() {
    LocalDate inputDay = LocalDate.of(2018,1,1);
    LocalDate expected = LocalDate.of(2018,1,2);

    boolean result = NextDayCaculator.dayCaculated(inputDay).isEqual(expected);
    assertTrue(result);

}
@Test
    public void testDayCaculated2() {
    LocalDate inputDay = LocalDate.of(2018,1,31);
    LocalDate expected = LocalDate.of(2018,2,1);

    boolean result = NextDayCaculator.dayCaculated(inputDay).isEqual(expected);
    assertTrue(result);

}
@Test
    public void testDayCaculated3() {
    LocalDate inputDay = LocalDate.of(2018,4,30);
    LocalDate expected = LocalDate.of(2018,5,1);

    boolean result = NextDayCaculator.dayCaculated(inputDay).isEqual(expected);
    assertTrue(result);

}
@Test
    public void testDayCaculated4() {
    LocalDate inputDay = LocalDate.of(2018,2,28);
    LocalDate expected = LocalDate.of(2018,3,1);

    boolean result = NextDayCaculator.dayCaculated(inputDay).isEqual(expected);
    assertTrue(result);

}
@Test
    public void testDayCaculated5() {
    LocalDate inputDay = LocalDate.of(2020,2,29);
    LocalDate expected = LocalDate.of(2020,3,1);

    boolean result = NextDayCaculator.dayCaculated(inputDay).isEqual(expected);
    assertTrue(result);

}
@Test
    public void testDayCaculated6() {
    LocalDate inputDay = LocalDate.of(2018,12,31);
    LocalDate expected = LocalDate.of(2019,1,1);

    boolean result = NextDayCaculator.dayCaculated(inputDay).isEqual(expected);
    assertTrue(result);

}

}