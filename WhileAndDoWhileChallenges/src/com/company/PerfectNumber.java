package com.company;

public class PerfectNumber {
    public static boolean isPerfectNumber(int num){
        if(num >= 1){
            int sum = 0;
            for(int i = 1; i < num; i++ ){
                if(num%i == 0){
                    sum += i;
                }
            }
            if(sum == num){return true;}
            return false;
        } else {
            return false;
        }
    }
}
