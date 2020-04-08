package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts;

    public MobilePhone() {
        this.contacts = new ArrayList<Contact>();
    }

    public void printContacts(){
        System.out.println();
        System.out.println("Contacts:");
        for(int i = 0; i < this.contacts.size(); i++){
            System.out.println(String.format("%1$s. %2$s", i+1, this.contacts.get(i).contactToString()));;
        }
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }
}
