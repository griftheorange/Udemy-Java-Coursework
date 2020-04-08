package com.company;

import java.util.ArrayList;
import java.util.Scanner;

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

    public void addContactPrompt(Scanner scanner){
        System.out.println("Enter the name:");
        String name = scanner.nextLine();
        System.out.println("Enter the number:");
        String number = scanner.nextLine();
        this.addContact(name, number);
        System.out.println(String.format("You have added %1$s:%2$s to your contacts.", name, number));
    }

    public void addContact(String name, String number){
        if(this.findContact(name) == null){
            Contact contact = new Contact(name, number);
            this.contacts.add(contact);
        } else {
            System.out.println("You already have a contact under that name.");
        }
    }

    public Contact findContact(String name){
        for(int i = 0; i < this.contacts.size(); i++){
            if(name.equals(this.contacts.get(i).getName())){
                return this.contacts.get(i);
            }
        }
        return null;
    }


    public ArrayList<Contact> getContacts() {
        return contacts;
    }
}
