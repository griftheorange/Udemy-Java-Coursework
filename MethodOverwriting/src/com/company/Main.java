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
}
