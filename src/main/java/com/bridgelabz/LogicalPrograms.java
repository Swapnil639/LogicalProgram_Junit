package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class LogicalPrograms {
    public static void main(String[] args) {
       LogicalPrograms obj=new LogicalPrograms();
        System.out.println(obj.isPrimeNumber(7));
        System.out.println(obj.isPerfectNumber(28));
        System.out.println(obj.monthlyPayment(50000,5,3.5));
    }

    public int dayOfWeek(int month, int day, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + 31 * m0 / 12) % 7;

        return d0;
    }

    public double temperatureConversion(double temperature, String unit) {
        if (unit.equalsIgnoreCase("C")) {
            // Celsius to Fahrenheit conversion
            return (temperature * 9 / 5) + 32;
        } else if (unit.equalsIgnoreCase("F")) {
            // Fahrenheit to Celsius conversion
            return (temperature - 32) * 5 / 9;
        } else {
            System.out.println("Invalid Input");
        }
        return 0.0;
    }

    public boolean isPrimeNumber(int num) {
        for (int i = 2; i <=num-1; i++) {
            if (num==1){
                return false;
            }
           if (num%i==0){
               return false;
           }
        }
        return true;
    }

    public boolean isPerfectNumber(int n) {
        int i = 1;
        int sum=0;
        while (i <= n / 2) {
            if (n % i == 0) {
                sum = sum + i;
                System.out.print(sum+",");
            }
            i++;
        }
        System.out.println();

        if (sum == n) {
            return true;
        }
        return false;
    }

    public int reverseNumber(int num) {
        int rem,rev=0;
        while (num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        return rev;
    }

    public boolean generateStopWatch() {
        long startTime=System.currentTimeMillis();
        for (int i = 0; i <=100; i++) {
            System.out.println(i);
        }
        long endTime=System.currentTimeMillis();
        long elapseTime=endTime-startTime;

        if (elapseTime==0){
            return false;
        }
        return true;
    }
    public int generateCoupon(int howManyCoupon) {
        int min = 100;
        int max = 999;
        int count=0;
        System.out.println("Coupon Number : ");
        for (int i = 0; i < howManyCoupon; i++) {
            int couponNumber = (int) (Math.random() * (max - min) + min);
            count++;
        }
        return count;
    }

    public List<Integer> findMinNotes(int amount, List<Integer> change) {
        int[] notes = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        if (amount == 0) {
            return change;
        }

        for (int note : notes) {
            if (amount >= note) {
                change.add(note);

                return findMinNotes(amount - note, change);
            }
        }

        return change;
    }
    public List<Integer> getChange(int amount) {
        List<Integer> change = new ArrayList<>();
        return findMinNotes(amount, change);
    }
    public double monthlyPayment(double P, int Y, double R) {
        double n = 12*Y;
        System.out.println(n);
        double r = (R/100)/12;
        System.out.println(r);
        double payment= (P*r)/1-(Math.pow(1+r,n*(-1)));
        return payment;
    }

    public double sqrt(double c) {
        if (c < 0) {
            return 0.0;
        }

        double t = c;
        double epsilon = 1e-15;

        while (Math.abs(t - c / t) > epsilon * t) {
            t = (c / t + t) / 2;
        }

        return t;
    }

    public int toBinaryString(int number) {
        String binary=Integer.toBinaryString(number);
        String swappedBinary = swapNibbles(binary);
        return Integer.parseInt(swappedBinary,2);
    }

    public String swapNibbles(String binary) {
        if (binary.length() < 8) {
            binary = "0".repeat(8 - binary.length()) + binary;
        }

        String nibble1 = binary.substring(0, 4);
        String nibble2 = binary.substring(4, 8);

        return nibble2 + nibble1;
    }
}
