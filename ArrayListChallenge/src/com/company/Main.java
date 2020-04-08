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
            int total = printOptions();
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
                case 2:
                    phone.printContacts();
                    break;
                case 3:
                    phone.addContactPrompt(scanner);
                    break;
                case 4:
                    phone.updateContactPrompt(scanner);
                    break;
                case 5:
                    phone.removeContactPrompt(scanner);
                    break;
                case 6:
                    phone.searchForContact(scanner);
                    break;


            }


        }
    }

    public static int printOptions(){
        System.out.println();
        System.out.println("Enter Option:");
        System.out.println("1. Quit");
        System.out.println("2. Print Contacts");
        System.out.println("3. Add Contact");
        System.out.println("4. Update Contact");
        System.out.println("5. Remove Contact");
        System.out.println("6. Search for Contact");
        System.out.println();
        return 6;
    }
}
