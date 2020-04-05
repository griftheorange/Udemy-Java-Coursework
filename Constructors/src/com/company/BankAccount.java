package com.company;

public class BankAccount {
    private String acctNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("NA", 0, "NA", "NA", "NA");
    }

    public BankAccount(String number, double balance, String customerName, String email, String phoneNumber){
        this.acctNumber = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber){
        this("99999", 100.5, customerName, email, phoneNumber);
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println(String.format("Deposit of %1$s made, balance is now %2$s", amount, this.balance));
    }

    public void withdraw(double amount){
        if(amount <= balance){
            this.balance -= amount;
            System.out.println(String.format("%1$s withdrawn, %2$s remaining", amount, this.balance));
        } else {
            System.out.println(String.format("Can't withdraw %1$s, only %2$s available", amount, this.balance));
        }
    }

    public void setAcctNumber(String acctNumber) {
        this.acctNumber = acctNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAcctNumber() {
        return acctNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
