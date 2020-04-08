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

    public void updateContactPrompt(Scanner scanner){
        System.out.println("Enter the name of the contact you'd like to update:");
        String name = scanner.nextLine();
        Contact contact = findContact(name);
        if(contact != null){
            System.out.println("Now you will enter the new name and number.");
            while(true){
                System.out.println("Enter the new name:");
                name = scanner.nextLine();
                if(findContact(name) == null){
                    break;
                }
            }
            System.out.println("Enter the new number:");
            String num = scanner.nextLine();
            System.out.print(String.format("Contact %1$s:%2$s has been changed to: ", contact.getName(), contact.getPhoneNumber()));
            updateContact(contact,name,num);
            System.out.println(String.format("%1$s:%2$s", name, num));
        } else {
            System.out.println(String.format("There is no contact with the name %s", name));
        }
    }

    public void updateContact(Contact contact, String name, String number){
        contact.setName(name);
        contact.setPhoneNumber(number);
    }

    public void removeContactPrompt(Scanner scanner){
        System.out.println("Enter the name of the contact you want removed:");
        String name = scanner.nextLine();
        for(int i = 0; i < this.contacts.size(); i++){
            if(this.contacts.get(i).getName().equals(name)){
                System.out.println(String.format("%s has been removed from contacts", this.contacts.get(i).getName()));
                removeContact(this.contacts.get(i));
            }
        }
    }

    public void removeContact(Contact contact){
        this.contacts.remove(contact);
    }

    public void searchForContact(Scanner scanner){
        System.out.println("Enter the name to search:");
        String name = scanner.nextLine();
        Contact cont = findContact(name);
        if(cont != null){
            System.out.println(String.format("%1$s:%2$s was found", cont.getName(), cont.getPhoneNumber()));
        } else {
            System.out.println(String.format("Could not find a %s", name));
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
