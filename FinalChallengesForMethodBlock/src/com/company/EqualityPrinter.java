package com.company;

public class EqualityPrinter {
    public static void printEqual(int f, int s, int t){
        if(f >= 0 && s >= 0 && t >= 0){
            if(f == s && s == t){
                System.out.println("All numbers are equal");
            }
            else if (f == s || f == t || s == t){
                System.out.println("Neither all are equal or different");
            } else {
                System.out.println("All numbers are different");
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
}
