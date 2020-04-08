package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();

        System.out.println("Welcome to contact list.");
        System.out.println("Please select an option:");
        while(true){
            int selected = 0;
            int total = phone.printOptions();
            while(true){
                while((!scanner.hasNextInt())){
                    System.out.println("Please input an integer.");
                    scanner.nextLine();
                }
                selected = scanner.nextInt();
                scanner.nextLine();
                if((selected > total) || selected < 1){
                    System.out.println("Must enter a value within range.");
                } else {
                    break;
                }
            }

            switch(selected){
                case 1:
                    return;
            }


        }
    }
}
