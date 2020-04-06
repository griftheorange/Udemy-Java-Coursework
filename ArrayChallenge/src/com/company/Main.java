package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {10, 4024, -15652, 2, 6532, 12, -56521};
        QuickSort.printArray(arr);
        System.out.println();
        QuickSort.quickSortArray(arr, 0, arr.length-1);
        System.out.println();
        QuickSort.printArray(arr);
    }
}
