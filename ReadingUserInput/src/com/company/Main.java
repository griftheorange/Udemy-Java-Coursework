package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        int age = 2020 - yearOfBirth;

        System.out.println(String.format("Your name is %1$s, and you are %2$s years old.", name, age));

        scanner.close();
    }
}
