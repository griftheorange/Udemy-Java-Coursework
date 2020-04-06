package com.company;

import java.util.ArrayList;

public class GroceryList {
    private int[] myNumebers = new int[50];
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

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

    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >= 0){
            modifyGroceryItem(position, newItem);
        }
    }

    public void modifyGroceryItem(int position, String newItem){
        String oldItem = groceryList.get(position);
        groceryList.set(position, newItem);
        System.out.println(String.format("Grocery item %1$s has been set to %2$s", oldItem, newItem));
    }

    public void removeGroceryItem(String name){
        int position = findItem(name);
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println(String.format("%s removed from list", theItem));
    }

    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position >= 0){
            return true;
        }
        return false;
    }
}
