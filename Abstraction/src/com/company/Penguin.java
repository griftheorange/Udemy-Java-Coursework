package com.company;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " attempts to fly, but sadly is unable to. How about a swim instead?");
    }
}
