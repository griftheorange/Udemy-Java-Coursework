package com.company;

import java.util.List;

public abstract class ListItem {
    protected ListItem left;
    protected ListItem right;
    protected Object itemName;

    public ListItem(Object itemName) {
        this.itemName = itemName;
    }

    abstract ListItem getRight();
    abstract void setRight(ListItem item);
    abstract ListItem getLeft();
    abstract void setLeft(ListItem item);


    abstract int compareTo(ListItem item);

    public Object getItemName() {
        return itemName;
    }

    public void setItemName(Object itemName) {
        this.itemName = itemName;
    }
}
