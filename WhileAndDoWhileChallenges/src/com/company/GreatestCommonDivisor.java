package com.company;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if(first >= 10 && second >= 10){
            if(first > second){
                for(int i = second; i >= 0; i--){
                    if((first%i == 0) && (second%i == 0)){
                        return i;
                    }
                }
                return 1;
            } else if(second > first){
                for(int i = first; i >= 0; i--){
                    if((first%i == 0) && (second%i == 0)){
                        return i;
                    }
                }
                return 1;
            } else {
                return first;
            }
        } else {
            return -1;
        }
    }
}
