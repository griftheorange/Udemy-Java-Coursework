package com.company;

public class Main {

    public static void main(String[] args) {
	    BankAccount acct = new BankAccount("12345", 0.00, "Griffin Poole", "gmail.email@gmail.mail", "999-888-7687");
	    acct.setBalance(10000.14);
        System.out.println(acct.getBalance());
        acct.withdraw(4879.2);
        System.out.println(acct.getBalance());
        acct.withdraw(6000);
        System.out.println(acct.getBalance());
        acct.deposit(242.25);
        System.out.println(acct.getBalance());
    }
}
