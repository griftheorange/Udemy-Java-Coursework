package com.company;

public class ItemLinkedList {
    private ListItem head;

    public void printList(){
        if(head != null){
            int count = 1;
            ListItem current = head;
            while(current != null){
                System.out.println(String.format("%1$s. %2$s", count, current.getItemName()));
                count++;
                current = current.getRight();
            }
        } else {
            System.out.println("List is empty");
        }
    }

    public void add(Item item){
        if(head == null){
            head = item;
        } else {
            ListItem current = head;
            while(true){
                System.out.println(current.getItemName());
                if(item.compareTo(current) <= 0){
                    item.setRight(current);
                    if(current.getLeft() != null){
                        item.setLeft(current.getLeft());
                        current.getLeft().setRight(item);
                    } else {
                        head = item;
                    }
                    current.setLeft(item);
                    break;
                } else if(current.getRight() != null){
                    current = current.getRight();
                } else {
                    item.setLeft(current);
                    current.setRight(item);
                    break;
                }
            }
        }
    }

    public void remove(String name){
        if(head != null){
            ListItem current = head;
            while(current != null){
                if(current.getItemName().compareTo(name) == 0){
                    if((current.getLeft() != null) && (current.getRight() != null)){
                        current.getLeft().setRight(current.getRight());
                        current.getRight().setLeft(current.getLeft());
                        break;
                    } else if(current.getLeft() != null){
                        current.getLeft().setRight(null);
                        break;
                    } else {
                        head = head.getRight();
                    }
                }
            }
        }
    }
}
