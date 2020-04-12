package com.griffin.Series;

public class Main {

    public static void main(String[] args) {
        Account griffsAccount = new Account("Griff");
        griffsAccount.deposit(1000);
        griffsAccount.withdraw(500);
        griffsAccount.withdraw(-200);
        griffsAccount.deposit(-20);
        System.out.println();
        System.out.println(griffsAccount.getBalance());
        griffsAccount.calculateBalance();
        System.out.println(griffsAccount.getBalance());
    }
}
