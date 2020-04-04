package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        boolean first = true;

        while(true){
            System.out.println("Enter number:");
            if(scanner.hasNextInt()){
                int next = scanner.nextInt();

                if(first) {
                    min = next;
                    max = next;
                    first = false;
                } else {
                    if(next > max){max = next;}
                    if(next < min){min= next;}
                }
            } else {
                break;
            }
        }

        System.out.println(String.format("Minimum = %1$s, Maximum = %2$s", min, max));

        scanner.close();
    }
}
