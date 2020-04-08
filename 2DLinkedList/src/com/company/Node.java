package com.company;

public class Node {
    private int value;
    private Node right;
    private Node down;

    public Node(int value){
        this.value = value;
    }

    public Node(int value, Node right, Node left) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getDown() {
        return down;
    }

    public void setDown(Node down) {
        this.down = down;
    }
}
