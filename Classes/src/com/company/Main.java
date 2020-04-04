package com.company;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        System.out.println(String.format("Model is %s", porsche.getModel()));
        porsche.setModel("Carrera");
        System.out.println(porsche.equals(holden));
        System.out.println(porsche.equals(porsche));
        System.out.println(String.format("Model is %s", porsche.getModel()));
    }
}
