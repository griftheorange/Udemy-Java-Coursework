package com.company;

public class Circle {

    private double radius;

    public Circle(double rad){
        if(rad < 0){this.radius = 0;}else{this.radius = rad;}
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getRadius() {
        return radius;
    }
}
