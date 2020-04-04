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

        //Sum odd challenge
        System.out.println(SumOddRange.sumOdd(1, 100));
        System.out.println(SumOddRange.sumOdd(-1, 100));
        System.out.println(SumOddRange.sumOdd(100, 100));
        System.out.println(SumOddRange.sumOdd(13, 13));
        System.out.println(SumOddRange.sumOdd(100, -100));
        System.out.println(SumOddRange.sumOdd(100, 1000));
    }
}
