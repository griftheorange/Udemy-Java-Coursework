package com.company;

public class BinarySearch implements NodeList {
    private ListItem root = null;

    public BinarySearch(ListItem root){
        this.root = root;
    }

    public ListItem getRoot() {
        return root;
    }

    @Override
    public void addItem(ListItem item){
        if(this.root == null){
            this.root = item;
        }
        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparisson = currentItem.compareTo(item);
            if(comparisson < 0){
                if(currentItem.getRight() != null){
                    currentItem = currentItem.getRight();
                } else {
                    currentItem.setRight(item);
                    return;
                }
            } else if(comparisson > 0){
                if(currentItem.getLeft() != null){
                    currentItem = currentItem.getLeft();
                } else {
                    currentItem.setLeft(item);
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override
    public void removeItem(ListItem item) {
        if(root != null){
            ListItem currentItem = root;
            ListItem parentItem = currentItem;

            while(currentItem != null){
                int comparisson = currentItem.compareTo(item);
                if(comparisson < 0){
                    parentItem = currentItem;
                    currentItem = currentItem.getRight();
                } else if(comparisson > 0){
                    parentItem = currentItem;
                    currentItem = currentItem.getLeft();
                } else {
                    performRemoval(currentItem, parentItem);
                    return;
                }
            }
        }
    }

    private void performRemoval(ListItem item, ListItem parent){
        if(item.getRight() == null){
            if(parent.getRight() == item){
                parent.setRight(item.getLeft());
            } else if(parent.getLeft() == item){
                parent.setLeft(item.getLeft());
            } else {
                this.root = item.getLeft();
            }
        } else if(item.getLeft() == null){
            if(parent.getRight() == item){
                parent.setRight(item.getRight());
            } else if(parent.getLeft() == item){
                parent.setLeft(item.getRight());
            } else {
                this.root = item.getRight();
            }
        } else {
            ListItem current = item.getRight();
            ListItem leftmostParent = item;
            while(current.getLeft() != null){
                leftmostParent = current;
                current = current.getLeft();
            }
            item.setItemName(current.getItemName());
            if(leftmostParent == item){
                item.setRight(current.getRight());
            } else {
                leftmostParent.setLeft(current.getRight());
            }

        }
    }

    public void traverse(ListItem root){
        //recursive method
        if(root != null){
            traverse(root.getLeft());
            System.out.println(root.getItemName());
            traverse(root.getRight());
        }
    }
}
