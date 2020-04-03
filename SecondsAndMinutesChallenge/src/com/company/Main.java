package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(85, 90));
        System.out.println(getDurationString(90 + 85*60));
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes >= 0 && seconds >= 0){
            int hours = 0;
            if(seconds > 60){
                minutes += seconds / 60;
                seconds %= 60;
            }
            if(minutes > 60){
                hours += minutes / 60;
                minutes %= 60;
            }
            return String.format("%1$sh %2$sm %3$ss", hours, minutes, seconds);
        } else {
            return "Invalid Value";
        }
    }

    public static String getDurationString(int seconds){
        if(seconds >= 0){
            int hours = 0;
            int minutes = 0;
            if(seconds > 60){
                minutes += seconds / 60;
                seconds %= 60;
            }
            return getDurationString(minutes, seconds);
        } else {
            return "Invalid Value";
        }
    }
}
