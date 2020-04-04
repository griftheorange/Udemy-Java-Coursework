package com.company;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int x, int y, int z){
        if(isValid(x) && isValid(y) && isValid(z)){
            if(x%10 == y%10 || x%10==z%10 || y%10 == z%10){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean isValid(int num){
        if(num >= 10 && num <= 1000){return true;}
        return false;
    }
}
