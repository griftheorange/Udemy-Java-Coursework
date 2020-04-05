package com.company;

public class Main {

    public static void main(String[] args) {
//	    BankAccount acct = new BankAccount("12345", 0.00, "Griffin Poole", "gmail.email@gmail.mail", "999-888-7687");
//	    acct.setBalance(10000.14);
//        System.out.println(acct.getBalance());
//        acct.withdraw(4879.2);
//        System.out.println(acct.getBalance());
//        acct.withdraw(6000);
//        System.out.println(acct.getBalance());
//        acct.deposit(242.25);
//        System.out.println(acct.getBalance());
//
//        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", "12345");
//        System.out.println(timsAccount.getAcctNumber() + " name " + timsAccount.getCustomerName());

        VipCustomer tim = new VipCustomer();
        VipCustomer jack = new VipCustomer("Jack", "jack_attack@dnd.com");
        VipCustomer randy = new VipCustomer("Randy", 10000, "randy@email.com");

        System.out.println(tim.getName());
        System.out.println(tim.getCreditLimit());
        System.out.println(tim.getEmailAddress());
        System.out.println(jack.getName());
        System.out.println(jack.getCreditLimit());
        System.out.println(jack.getEmailAddress());
        System.out.println(randy.getName());
        System.out.println(randy.getCreditLimit());
        System.out.println(randy.getEmailAddress());

    }
}
