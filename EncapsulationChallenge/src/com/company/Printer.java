package com.company;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if(tonerLevel < 0){
            this.tonerLevel = 0;
        }else if(tonerLevel > 100){
            this.tonerLevel = 100;
        }else{
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public void fillToner(int amount){
        int value = this.tonerLevel + amount;
        if(value > 100){
            this.tonerLevel = 100;
        } else {
            this.tonerLevel = value;
        }
    }

    public int print(int numPages){
        if(numPages > this.tonerLevel){
            System.out.println(String.format("Not enough ink to print %s pages", numPages));
            return 0;
        } else {
            if(this.isDuplex){
                this.pagesPrinted += (numPages/2) + (numPages%2);
                return (numPages/2) + (numPages%2);
            } else {
                this.pagesPrinted += numPages;
            }
            this.tonerLevel -= numPages;
            return numPages;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
