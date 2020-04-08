package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;

    public Bank() {
        this.branches = new ArrayList<Branch>();
    }

    public void addBranch(String name){
        this.branches.add(new Branch(name));
    }

    public void showCustomersAtBranch(String branchName){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println(String.format("Customers at %s", branchName));
            ArrayList<Customer> customers = branch.getCustomers();
            for(int i = 0; i < customers.size(); i++){
                Customer customer = customers.get(i);
                System.out.println(String.format("%1$s. %2$s:", i+1, customer.getName()));
                ArrayList<Double> transactions = customer.getTransactions();
                for(int j = 0; j < transactions.size(); j++){
                    System.out.println(String.format("\t%s", transactions.get(j)));
                }
            }
        }
    }

    public void addTransactionToCustomerAtBranch(String branchName, String customerName, double transaction){
        Branch branch = findBranch(branchName);
        if(branch != null){
            branch.addTransactionToCustomer(customerName, transaction);
        }
    }

    public void addCustomerToBranch(Branch branch, String customerName, double initialTransaction){
        branch.newCustomer(customerName, initialTransaction);
    }

    public void addCustomerToBranch(String branchName, String customerName, double initialTransaction){
        Branch branch = findBranch(branchName);
        if(branch != null){
            addCustomerToBranch(branch, customerName, initialTransaction);
        }
    }

    public Branch findBranch(String name){
        for(int i = 0; i < branches.size(); i++){
            if(branches.get(i).getName().equals(name)){
                return branches.get(i);
            }
        }
        return null;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }
}
