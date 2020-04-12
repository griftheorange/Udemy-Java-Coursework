package com.griffin;

public class SomeClass {
    public final int INSTANCE_NUMBER;
    private static int number = 0;
    private final String name;

    public SomeClass(String name) {
        this.name = name;
        number++;
        INSTANCE_NUMBER = number;
        System.out.println(name + " created, instance is " + INSTANCE_NUMBER);
    }

    public static int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
