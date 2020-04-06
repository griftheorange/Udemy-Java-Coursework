package com.company;

public class QuickSort {
    public static void quickSortArray(int[] arr, int start, int end){
        if(start < end){
            printArray(slice(arr, start, end));
            int pi = partition(arr, start, end);
            printArray(slice(arr, start, end));
            quickSortArray(arr, start, pi - 1);
            quickSortArray(arr, pi + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start -1;

        for(int j = start; j < end; j++){
            if(arr[j] < pivot){
                i += 1;
                int holder = arr[j];
                arr[j] = arr[i];
                arr[i] = holder;
            }
        }

        arr[end] = arr[i+1];
        arr[i+1] = pivot;

        return i+1;
    }

    public static int[] slice(int[] arr, int start, int end){
        int[] newArr = new int[end-start];
        int count = 0;
        for(int i = start; i < end; i++){
            newArr[count] = arr[i];
            count++;
        }
        return newArr;
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for(int i = 0; i < arr.length-1; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length-1]);
        System.out.print("]");
        System.out.println();
    }
}
