package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Griffin", 500);
        System.out.println(String.format("New score is %s", newScore));

        System.out.println();

        newScore = calculateScore(75);
        System.out.println(String.format("New score is %s", newScore));

        System.out.println();

        System.out.println(String.format("New score is %s", calculateScore()));

        System.out.println();

        System.out.println(calcFeetAndInchesToCentimeters(-1, 6));

        System.out.println(calcFeetAndInchesToCentimeters(60));
    }

    public static int calculateScore(String playerName, int score){
        System.out.println(String.format("Player %1$s scored %2$s points", playerName, score));
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println(String.format("Unnamed player scored %s points", score));
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score.");
        return 0;
    }

    //Overloading challenge

    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        double converter = 2.54;
        if (feet >= 0 && inches >= 0){
            inches += feet*12;
            return inches * converter;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(int inches){
        double converter = 2.54;
        if (inches >= 0){
            int feet = inches / 12;
            inches = inches % 12;
            return calcFeetAndInchesToCentimeters(feet, inches);
        } else {
            return -1;
        }
    }
}
