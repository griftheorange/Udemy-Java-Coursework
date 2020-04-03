package com.company;

public class Main {

    public static void main(String[] args) {
//        int value = 3;
//        if(value == 1){
//            System.out.println("Values was 1");
//        } else if(value == 2){
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 4;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println(String.format("Actually it was a %s", switchValue));
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }

        char switchChar = 'B';

        switch(switchChar){
            case 'A':
                System.out.println("Was A");
                break;
            case 'B':
                System.out.println("Was B");
                break;
            case 'C':
                System.out.println("Was C");
                break;
            case 'D':
                System.out.println("Was D");
                break;
            case 'E':
                System.out.println("Was E");
                break;
            default:
                System.out.println("Was neither A, B, C, D, nor E");
        }

        String month = "jAnuary";

        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "july":
                System.out.println("Jul");
                break;
            default:
                System.out.println("Not Jan nor Jul");
        }

    }
}
