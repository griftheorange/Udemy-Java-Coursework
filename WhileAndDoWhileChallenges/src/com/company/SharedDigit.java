package com.company;

public class SharedDigit {
    public static boolean hasSharedDigit(int x, int y){
        if((x >= 10 && x <= 99) && (y >= 10 && y <= 99)){
            String xString = Integer.toString(x);
            String yString = Integer.toString(y);
            for(int i = 0; i < xString.length(); i++){
                for(int j = 0; j < yString.length(); j++){
                    if(xString.charAt(i) == yString.charAt(j)){
                        return true;
                    }
                }
            }
            return false;
        } else {
            return false;
        }
    }
}
