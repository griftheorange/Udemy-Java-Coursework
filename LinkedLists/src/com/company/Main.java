package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Griffin", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println(String.format("Balance for customer %1$s is %2$s", customer.getName(), customer.getBalance()));
        System.out.println();
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(3);
        intList.add(4);

        for(int i = 0; i < intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }
        System.out.println();

        intList.add(1, 2);

        for(int i = 0; i < intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }
        System.out.println();
    }
}
