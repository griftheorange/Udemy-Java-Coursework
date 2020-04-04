package com.company;

public class FactorPrinter {
    public static void printFactors(int num){
        if(num >= 1){
            for(int i = 1; i <= num; i++){
                if(num%i == 0){
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
}
