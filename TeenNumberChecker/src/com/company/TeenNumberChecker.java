package com.company;

public class TeenNumberChecker {
    public static boolean hasTeen(int f, int s, int t){
        if(isTeen(f) || isTeen(s) || isTeen(t)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int i){
        if(i >= 13 && i <= 19){
            return true;
        } else {
            return false;
        }
    }
}
