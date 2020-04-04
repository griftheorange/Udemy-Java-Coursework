package com.company;

public class DigitSum {
    public static int sumDigits(int num){
        if(num >= 10){
            int sum = 0;
            String numString = Integer.toString(num);
            for(int i = 0; i < numString.length(); i++){
                sum += Integer.parseInt(String.valueOf(numString.charAt(i)));
            }
            return sum;
        } else {
            return -1;
        }
    }
}
