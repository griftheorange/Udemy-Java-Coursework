package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your year of birth:");
//
//        boolean hasNextInt = scanner.hasNextInt();
//
//        if(hasNextInt){
//            int yearOfBirth = scanner.nextInt();
//            scanner.nextLine();
//
//            System.out.println("Enter your name: ");
//            String name = scanner.nextLine();
//            int age = 2020 - yearOfBirth;
//
//            if(age >= 0 && age <= 100){
//                System.out.println(String.format("Your name is %1$s, and you are %2$s years old.", name, age));
//            } else {
//                System.out.println("Invalid year of birth.");
//            }
//        } else {
//            System.out.println("Unable to parse year of birth.");
//        }
//        scanner.nextLine();
//        scanner.close();

        SumTenNumbersFromInput.sumTenNumbers();
    }
}
