package com.company;

public class Carpet {
    private double cost;

    public Carpet(double cost){
        boolean isNeg = cost < 0;
        this.cost = isNeg ? 0 : cost;
    }

    public double getCost(){
        return cost;
    }
}
