package com.company;

class Car{
    int cylinders;
    String name;
    int wheels;
    boolean engine;
    int speed;

    public Car(String name) {
        this.cylinders = 6;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
        this.speed = 0;
    }

    public void startEngine(){
        System.out.println("Haha engine go vroom vroom");
    }

    public void accelerate(){
        this.speed = (this.speed >= 50) ? 50 : this.speed + 1;
    }

    public void brake(){
        this.speed = (this.speed - 1) <= 0 ? 0 : this.speed - 1;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getSpeed() {
        return speed;
    }
}

class Honda extends Car{
    public Honda(){
        super("Honda");
    }

    @Override
    public void brake(){
        this.speed = (this.speed - 2) <= 0 ? 0 : this.speed - 2;
    }
}


class Ferrari extends Car{
    public Ferrari(){
        super("Ferrari");
    }

    @Override
    public void brake(){
        this.speed = (this.speed - 2) <= 0 ? 0 : this.speed - 2;
    }

    @Override
    public void accelerate(){
        this.speed = (this.speed >= 80) ? 80 : this.speed + 2;
    }
}

class Truck extends Car{
    public Truck(){
        super("Truck");
    }

    @Override
    public void startEngine(){
        System.out.println("Haha Engine goes HSVKGJKSKSVJGSDVSDVKLM");
    }
}

public class Main {

    public static void main(String[] args) {
        for(int i = 1; i < 11; i++){
            Car car = getRandomCar();
            System.out.println("Car #: " + i);
            System.out.println("Model: " + car.getName());
            car.startEngine();
            System.out.println(car.getSpeed());
            car.accelerate();
            System.out.println(car.getSpeed());
            car.accelerate();
            System.out.println(car.getSpeed());
            car.brake();
            System.out.println(car.getSpeed());
        }
    }

    public static Car getRandomCar(){
        int rand = ((int)(Math.random()*3))+1;
        switch(rand){
            case 1:
                return new Honda();
            case 2:
                return new Ferrari();
            default:
                return new Truck();
        }
    }
}
