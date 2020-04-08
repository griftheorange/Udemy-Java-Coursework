package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name){
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public void newCustomer(Customer customer){
        this.customers.add(customer);
    }

    public void newCustomer(String name, double initialTransaction){
        this.newCustomer(new Customer(name, initialTransaction));
    }

    public void addTransactionToCustomer(String name, double transaction){
        Customer customer = findCustomer(name);
        if(customer != null){
            customer.addTransaction(transaction);
        }
    }

    public Customer findCustomer(String name){
        for(int i = 0; i < customers.size(); i++){
            if(customers.get(i).getName().equals(name)){
                return customers.get(i);
            }
        }
        return null;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getName() {
        return name;
    }
}
