package com.company;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        double average = 0D;
        int count = 0;
        while(true){
            boolean isInt = scanner.hasNextInt();
            if(isInt){
                int next = scanner.nextInt();
                sum += next;
                average = ((double)(average*count) + next)/(double)(count + 1);
                count++;
            } else {
                break;
            }
        }

        System.out.println(String.format("SUM = %1$s AVG = %2$s", sum, Math.round(average)));

        scanner.close();
    }
}
