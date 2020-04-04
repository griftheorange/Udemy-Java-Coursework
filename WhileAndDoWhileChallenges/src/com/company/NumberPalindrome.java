package com.company;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        number = Math.abs(number);
        String numString = Integer.toString(number);
        int half = numString.length()/2;
        for(int i = 0; i < half; i++){
            if(numString.charAt(i) != numString.charAt(numString.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
