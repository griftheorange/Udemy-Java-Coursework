package com.company;

public class SumOddRange {
    public static boolean isOdd(int number){
        if(number > 0){
            if(number % 2 != 0){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end){
        if(end >= start && start >= 0){
            int runningSum = 0;
            for(int i = start; i <= end; i++){
                if(isOdd(i)){
                    runningSum += i;
                }
            }
            return runningSum;
        } else {
            return -1;
        }
    }
}
