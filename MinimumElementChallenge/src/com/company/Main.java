package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter array count");
        while(!scanner.hasNextInt()){
            System.out.println("Int please!");
            scanner.nextLine();
        }
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] arr = readIntegers(count);
        System.out.println(Arrays.toString(arr));
        System.out.println("Min is " + findMin(arr));
        System.out.println("Max is " + findMax(arr));
    }

    public static int findMin(int[] arr){
        int min = arr.length > 0 ? arr[0] : 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){min = arr[i];}
        }
        return min;
    }

    public static int findMax(int[] arr){
        int max = arr.length > 0 ? arr[0] : 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){max = arr[i];}
        }
        return max;
    }

    public static int[] readIntegers(int count){
        int[] arr = new int[count];
        System.out.println("Enter Integers\r");
        for(int i = 0; i < arr.length; i++){
            while(!scanner.hasNextInt()){
                System.out.println("Int please!");
                scanner.nextLine();
            }
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}
