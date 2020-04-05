package com.company;

public class Main {

    public static void main(String[] args) {
	    //Wall Area
        Wall wall = new Wall(2, 5.3);
        System.out.println(wall.getArea());

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0) = " + first.distance());
        System.out.println("distance(second) = " + first.distance(second));
        System.out.println("distance(2,2) = " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance() = " + point.distance());
    }
}
