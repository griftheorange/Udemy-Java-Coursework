package com.company;

import org.w3c.dom.Node;

public class Main {

    public static void main(String[] args) {
//        testLinkedList();
        testSearchTree();
    }

    private static void testSearchTree(){
        BinarySearch tree = new BinarySearch(null);
        tree.traverse(tree.getRoot());
        String stringData = "5 7 8 9 0 3 9 3 6 2 7 9";

        String[] data = stringData.split(" ");
        for(String s : data){
            tree.addItem(new Item(s));
        }

        System.out.println(stringData);
        System.out.println();
        tree.traverse(tree.getRoot());
        System.out.println();
        ListItem item = new Item("4");
        ListItem item2 = new Item("5");
        tree.addItem(item);
        tree.traverse(tree.getRoot());
        System.out.println();
        tree.removeItem(item);
        tree.traverse(tree.getRoot());
        System.out.println();
        tree.removeItem(item2);
        tree.traverse(tree.getRoot());
        System.out.println();
    }

    private static void testLinkedList(){
        ItemLinkedList linkList = new ItemLinkedList();

        linkList.addItem(new Item("Bread"));
        System.out.println();
        linkList.addItem(new Item("Apple"));
        System.out.println();
        linkList.addItem(new Item("Cheese"));
        System.out.println();
        linkList.addItem(new Item("Milk"));
        System.out.println();
        linkList.addItem(new Item("Wine"));
        System.out.println();

        linkList.printList();
        System.out.println();

        linkList.addItem(new Item("Grapes"));
        System.out.println();
        linkList.addItem(new Item("Celery"));
        System.out.println();
        linkList.addItem(new Item("Crackers"));
        System.out.println();

        linkList.printList();
        System.out.println();

        linkList.removeItem(new Item("Apple"));
        linkList.printList();
        System.out.println();

        linkList.removeItem(new Item("Wine"));
        linkList.printList();
        System.out.println();

        linkList.removeItem(new Item("Cheese"));
        linkList.printList();
        System.out.println();

        linkList.removeItem(new Item("Cheese"));
        linkList.printList();
        System.out.println();
    }
}
