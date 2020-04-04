package com.company;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println(String.format("numberAsString = %s", numberAsString));

        int number = Integer.parseInt(numberAsString);
        System.out.println(String.format("number = %s", number));

        numberAsString += 1;
        number += 1;

        System.out.println(String.format("numberAsString = %s", numberAsString));
        System.out.println(String.format("number = %s", number));
    }
}
