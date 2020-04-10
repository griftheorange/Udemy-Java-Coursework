package com.company;

import java.util.List;

public abstract class ListItem {
    private ListItem left;
    private ListItem right;
    private String itemName;

    public ListItem(String itemName) {
        this.itemName = itemName;
    }

    public int compareTo(ListItem item){
        return this.itemName.compareTo(item.getItemName());
    }

    public ListItem getLeft() {
        return left;
    }

    public void setLeft(ListItem left) {
        this.left = left;
    }

    public ListItem getRight() {
        return right;
    }

    public void setRight(ListItem right) {
        this.right = right;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
