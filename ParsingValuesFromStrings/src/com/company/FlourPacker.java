package com.company;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount >= 0 && smallCount >= 0 && goal >= 0){
            int sum = bigCount*5 + smallCount;
            if(sum >= goal){
                while(goal > 0){
                    if(bigCount > 0 && goal >= 5){
                        goal -= 5;
                        bigCount -= 1;
                    } else if(smallCount > 0 && goal >= 1){
                        goal -= 1;
                        smallCount -= 1;
                    } else {
                        return false;
                    }
                }
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
