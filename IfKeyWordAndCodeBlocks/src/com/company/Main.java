package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score <= 5001 && score >= 1000) {
            System.out.println(String.format("Your score was %1$s, your bonus was %2$s", score, bonus));
            System.out.println("This was executed");
        } else if(score < 1000){
            System.out.println("The score was less than 1000");
        } else {
            System.out.println("Got here");
        }

        if (gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;


        if (gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
