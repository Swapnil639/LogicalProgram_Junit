package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class LogicalProgramsTest {
    LogicalPrograms obj = new LogicalPrograms();

    @Test
    public void checkNumberIsPrimeOrNot() {
        boolean res = obj.isPrimeNumber(11);
        Assertions.assertTrue(res);
        boolean res1 = obj.isPrimeNumber(12);
        Assertions.assertFalse(res1);

    }

    @Test
    public void CheckNumberIsPerfectNumberOrNot() {
        boolean res = obj.isPerfectNumber(28);
        Assertions.assertTrue(res);
        boolean res1 = obj.isPerfectNumber(19);
        Assertions.assertFalse(res1);
    }

    @Test
    public void checkNumberReverseOrNot() {
        int res = obj.reverseNumber(121);
        Assertions.assertEquals(121, res);
        int res1 = obj.reverseNumber(123);
        Assertions.assertEquals(321, res1);
    }

    @Test
    public void CheckWhetherCurrentTimeMoreThanZero() {
        boolean res = obj.generateStopWatch();
        Assertions.assertTrue(res);
    }

    @Test
    public void generateCouponNumber() {
        int res = obj.generateCoupon(5);
        Assertions.assertEquals(5, res);
    }

    @Test
    public void testFindMinNotes() {
        int amount1 = 1234;
        List<Integer> expectedChange1 = Arrays.asList(500, 500, 200, 20, 10, 2, 2);
        List<Integer> actualChange1 = obj.getChange(amount1);
        Assertions.assertEquals(expectedChange1, actualChange1);
    }

    @Test
    public void testDayOfWeek() {
        int month = 1;
        int day = 1;
        int year = 2023;
        int expectedDayOfWeek1 = 0;
        int actualDayOfWeek1 = obj.dayOfWeek(month, day, year);
        Assertions.assertEquals(expectedDayOfWeek1, actualDayOfWeek1);
    }

    @Test
    public void testTemperatureConversion() {
        double celsius = 25;
        double expectedFahrenheit = 77;
        double actualFahrenheit = obj.temperatureConversion(celsius, "C");
        Assertions.assertEquals(expectedFahrenheit, actualFahrenheit);
    }

    @Test
    public void testMonthlyPayment() {
        double principal = 50000;
        int years = 5;
        double interestRate = 3.5;
        double expectedMonthlyPayment = 144.99366246456486;
        double actualMonthlyPayment = obj.monthlyPayment(principal, years, interestRate);
        Assertions.assertEquals(expectedMonthlyPayment, actualMonthlyPayment);
    }

    @Test
    public void testSqrt() {
        double input1 = 25;
        double expectedSqrt = 5;
        double actualSqrt = obj.sqrt(input1);
        Assertions.assertEquals(expectedSqrt, actualSqrt);
    }

    @Test
    public void testSwapNibbles() {
        int number = 100;
        int expectedSwappedNumber1 = 70;
        int actualSwappedNumber1 = obj.toBinaryString(number);
        Assertions.assertEquals(expectedSwappedNumber1, actualSwappedNumber1);
    }
}
