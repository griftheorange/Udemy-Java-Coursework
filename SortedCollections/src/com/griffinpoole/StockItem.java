package com.griffinpoole;

public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityStock;
    private int reserved;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;
        this.reserved = 0;
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
        this.reserved = 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int quantityInStock() {
        return quantityStock;
    }

    public int quantityReserved(){
        return reserved;
    }

    public void setPrice(double price) {
        if(price > 0){
            this.price = price;
        }
    }

    public void reserveStock(int quantity){
        if((this.reserved + quantity) <= this.quantityStock){
            this.reserved += quantity;
        }
    }

    public void unreserveStock(int quantity){
        if((this.reserved >= quantity) && (quantity > 0)){
            this.reserved -= quantity;
        }
    }

    public void adjustStock(int quantity) {
        int newQuant = this.quantityStock + quantity;
        if(newQuant >= 0){
            this.quantityStock = newQuant;
        }
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }

        if(obj == null || (obj.getClass() != this.getClass())){
            return false;
        }
        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int compareTo(StockItem o) {
        if(this == o){
            return 0;
        }
        if(o != null){
            return this.name.compareTo(o.getName());
        }

        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + ": price " + String.format("%.2f", this.price);
    }
}
