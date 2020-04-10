package com.company;

public class Item extends ListItem {
    public Item(Object itemName) {
        super(itemName);
    }

    @Override
    ListItem getRight() {
        return this.right;
    }

    @Override
    void setRight(ListItem item) {
        this.right = item;
    }

    @Override
    ListItem getLeft() {
        return this.left;
    }

    @Override
    void setLeft(ListItem item) {
        this.left = item;
    }

    @Override
    int compareTo(ListItem item) {
        if(item != null){
            return ((String) super.getItemName()).compareTo((String) item.getItemName());
        } else {
            return -1;
        }
    }
}
