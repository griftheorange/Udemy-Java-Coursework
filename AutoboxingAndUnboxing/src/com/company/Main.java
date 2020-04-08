package com.company;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        String[] strArr = new String[10];
        int[] intArr = new int[10];

        ArrayList<String> strArrList = new ArrayList<String>();
        strArrList.add("Griffin");

        //Messy version below
//        ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrList = new ArrayList<IntClass>();
        intClassArrList.add(new IntClass(54));

        //Autoboxing

        Integer integer = new Integer(5);
        System.out.println(integer);

        Double doubleValue = new Double(12.25);
        System.out.println(doubleValue);

        ArrayList<Integer> intArrList = new ArrayList<Integer>();
        for(int i = 0; i <= 10; i++){
            intArrList.add(i);
        }
        for(int i = 0; i < intArrList.size(); i++){
            System.out.println(intArrList.get(i));
        }
    }
}
