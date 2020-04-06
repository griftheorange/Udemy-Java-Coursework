package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);

        for(int i = 0; i < myIntegers.length; i++){
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("Average was: " + getAverage(myIntegers));
//        int[] myVariable =  new int[100];
////        int[] myVariable = {1,2,3,4,5,6,7,8,9,10};
//        for(int i = 0; i < myVariable.length; i++){
//            myVariable[i] = i*10;
//        }
//        printArray(myVariable);
//        double[] secondArr = new double[10];
//        printArray(secondArr);
//        System.out.println(myVariable.getClass().getName());
//        System.out.println(secondArr.getClass().getName());
    }

    public static int[] getIntegers(int num){
        System.out.println("Enter "+num+" integer values.\r");
        int[] values = new int[num];

        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i=0; i < array.length; i++){
            sum += array[i];
        }
        return ((double)sum)/((double)array.length)3;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void printArray(double[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
