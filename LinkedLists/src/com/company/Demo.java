package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Adelaide");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Caberra");
        placesToVisit.add("Darwin");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Perth");
        placesToVisit.add("Sydney");

        printList(placesToVisit);

        placesToVisit.add(1, "Alice Springs");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);

        addInOrder(placesToVisit, "New Hampshire");
        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println(String.format("Now visiting %s", i.next()));
        }
        System.out.println("===========================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()){
            // If 0, equal
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                // equal do not add
                System.out.println(newCity + " is already included");
                return false;
            } else if(comparison > 0){
                //new City should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0){
                //move on to next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }
}
