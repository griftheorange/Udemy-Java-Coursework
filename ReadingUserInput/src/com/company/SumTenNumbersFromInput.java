package com.company;

import java.util.Scanner;

public class SumTenNumbersFromInput {
    public static void sumTenNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter ten numbers to sum.");
        int count = 0;
        int sum = 0;
        while(count < 10){
            System.out.println(String.format("Enter number #%s:", count+1));

            if(scanner.hasNextInt()){
                sum += scanner.nextInt();
                count++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }

        System.out.println(String.format("Your final sum = %s", sum));

        scanner.close();
    }
}
