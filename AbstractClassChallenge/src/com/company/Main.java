package com.company;

public class Main {

    public static void main(String[] args) {
        ItemLinkedList linkList = new ItemLinkedList();

	    linkList.add(new Item("Bread"));
        System.out.println();
	    linkList.add(new Item("Apple"));
        System.out.println();
	    linkList.add(new Item("Cheese"));
        System.out.println();
	    linkList.add(new Item("Milk"));
        System.out.println();
        linkList.add(new Item("Wine"));
        System.out.println();

        linkList.printList();
        System.out.println();

        linkList.add(new Item("Grapes"));
        System.out.println();
        linkList.add(new Item("Celery"));
        System.out.println();
        linkList.add(new Item("Crackers"));
        System.out.println();

        linkList.printList();
        System.out.println();

        linkList.remove(new Item("Apple"));
        linkList.printList();
        System.out.println();

        linkList.remove(new Item("Wine"));
        linkList.printList();
        System.out.println();

        linkList.remove(new Item("Cheese"));
        linkList.printList();
        System.out.println();

        linkList.remove(new Item("Cheese"));
        linkList.printList();
        System.out.println();

    }
}
