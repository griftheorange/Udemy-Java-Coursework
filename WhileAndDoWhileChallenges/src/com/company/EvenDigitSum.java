package com.company;

public class EvenDigitSum {
    public static int getEvenDigitSum(int num){
        if(num >= 0){
            int sum = 0;
            while(num > 0){
                int digit = num % 10;
                num /= 10;
                if(digit % 2 == 0){
                    sum += digit;
                }
            }
            return sum;
        } else {
            return -1;
        }
    }
}
