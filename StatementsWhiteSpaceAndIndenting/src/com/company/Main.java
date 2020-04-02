package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
        int myVar = 50;
        myVar++;
        myVar--;
        System.out.println("This is a test");

        //Whitespace Review
        System.out.println("This is" +
                " another" +
                " still more.");

        int anotherVar = 50; anotherVar--; System.out.println("This is another one");
    }
}
