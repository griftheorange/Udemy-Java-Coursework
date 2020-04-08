package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addBranch("NJ");
        bank.addBranch("PA");
        bank.addCustomerToBranch("NJ", "Griffin", 10);
        bank.addCustomerToBranch("NJ", "Julia", 20);
        bank.addCustomerToBranch("NJ", "Scott", 1000);
        bank.addCustomerToBranch("PA", "Ellie", 10.30);

        bank.addTransactionToCustomerAtBranch("NJ", "Griffin", 103.25);
        bank.showCustomersAtBranch("NJ");

        System.out.println();
        bank.showCustomersAtBranch("PA");

    }
}
