package com.company;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes >= 0){
            long days = 0;
            long years = 0;
            if(minutes >= 60){
                days = (minutes/60)/24;
            }
            if(days >= 365){
                years = days/365;
                days %= 365;
            }
            System.out.println(String.format("%1$s min = %2$s y and %3$s d", minutes, years, days));
        } else {
            System.out.println("Invalid Value");
        }
    }
}
