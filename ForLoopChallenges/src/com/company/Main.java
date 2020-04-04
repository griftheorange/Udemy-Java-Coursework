package com.company;

public class Main {

    public static void main(String[] args) {

        //Sum 3 and 5 challenge
        int runningSum = 0;
        int count = 0;
        for(int i = 1; i <= 1000; i++){
            if(i % 3 == 0 && i % 5 == 0){
                runningSum += i;
                count++;
                System.out.println("Found num = " + i);
            }
            if(count >= 5){break;}
        }
        System.out.println(runningSum);
    }
}
