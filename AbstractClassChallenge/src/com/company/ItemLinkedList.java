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

    public void remove(ListItem item){
        if(head != null){
            ListItem current = head;
            while(current != null){
                if(current.compareTo(item) == 0){
                    System.out.println("Found match");
                    if((current.getLeft() != null) && (current.getRight() != null)){
                        ListItem left = current.getLeft();
                        ListItem right = current.getRight();
                        current.getLeft().setRight(right);
                        current.getRight().setLeft(left);
                        break;
                    } else if(current.getLeft() != null){
                        current.getLeft().setRight(null);
                        break;
                    } else {
                        head = head.getRight();
                        break;
                    }
                }
                current = current.getRight();
            }
        }
    }
}
