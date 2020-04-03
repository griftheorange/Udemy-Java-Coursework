package com.company;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(4);
    }

    public static void printDayOfTheWeek(int day){
        if(day >= 0 && day <= 6){
            switch(day){
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                default:
                    System.out.println("Saturday");
                    break;
            }
        } else {
            System.out.println("Invalid day");
        }
    }
}
