package com.company;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int num){
        if(num >= 0){
            String numString = Integer.toString(num);
            int sum = Character.getNumericValue(numString.charAt(0)) + Character.getNumericValue(numString.charAt(numString.length()-1));
            return sum;
        } else {
            return -1;
        }
    }
}
