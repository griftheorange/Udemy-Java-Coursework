package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while(count != 6){
            System.out.println(String.format("Count value is %s", count));
            count++;
        }

        System.out.println();

        count = 1;
        while(true){
            if(count == 6){break;}
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println();

        count = 6;
        do {
            System.out.println("Count value was " + count);
            count++;

            if(count > 100){
                break;
            }
        } while(count != 6);

        System.out.println();

        int number = 4;
        int finishNumber = 21;
        int totalNum = 0;
        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){continue;}
            System.out.println(String.format("Even number %s", number));
            totalNum++;
            if(totalNum >= 5){break;}
        }

        System.out.println(String.format("Total number of evens = %s", totalNum));
    }

    public static boolean isEvenNumber(int num){
        if(num % 2 == 0){return true;}
        return false;
    }
}
