package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if(gameOver){
            System.out.println("Your final score was " + calculateScore(score, levelCompleted, bonus));
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver){
            System.out.println("Your final score was " + calculateScore(score, levelCompleted, bonus));
        }
    }

    public static int calculateScore(int score, int levelCompleted, int bonus) {
        return (score + (levelCompleted * bonus));
    }
}
