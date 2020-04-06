package com.company;

import java.util.ArrayList;

public class GroceryList {
    private int[] myNumebers = new int[50];
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
        printGroceryList();
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your list");
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println(String.format("Grocery item %1$s has been set to %2$s", position, newItem));
    }

    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println(String.format("%s removed from list", theItem));
    }

    public String findItem(String searchItem){
//        boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if(position < 0){
            return groceryList.get(position);
        }

        return null;
    }
}
