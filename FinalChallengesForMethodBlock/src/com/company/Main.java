package com.company;

public class Main {

    public static void main(String[] args) {
        //Areas
        System.out.println(AreaCalculator.area(3));
        System.out.println(AreaCalculator.area(-3));
        System.out.println(AreaCalculator.area(3, 4));
        //Minutes to days years
        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
        MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
        MinutesToYearsDaysCalculator.printYearsAndDays(561600);
        //Equal Printer
        EqualityPrinter.printEqual(1, 1, 1);
        EqualityPrinter.printEqual(1, 1, 2);
        EqualityPrinter.printEqual(-1, -1, -1);
        EqualityPrinter.printEqual(1, 2, 3);
    }
}
