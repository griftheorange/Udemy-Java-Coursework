package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts;

    public MobilePhone() {
        this.contacts = new ArrayList<Contact>();
    }

    public int printOptions(){
        System.out.println();
        System.out.println("Enter Option:");
        System.out.println("1. Quit");
        System.out.println("2. Print Contacts");
        System.out.println("3. Add Contact");
        System.out.println("4. Update Contact");
        System.out.println("5. Remove Contact");
        System.out.println("6. Search for Contact");
        System.out.println();
        return 6;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }
}
