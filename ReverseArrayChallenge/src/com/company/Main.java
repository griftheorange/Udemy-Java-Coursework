package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {1,2,3,4,5,6,7,1000,9};
        System.out.println(Arrays.toString(arr));
        System.out.println();
	    reverseArray(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void reverseArray(int[] arr){
        int halfway = arr.length/2;
        for(int i = 0; i < halfway; i++){
            int holder = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = holder;
        }
    }
}
