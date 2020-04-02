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

        String name = "Griffin";

        score = 1500;
        displayHighScorePosition(name, calculateHighScorePosition(score));

        score = 900;
        displayHighScorePosition(name, calculateHighScorePosition(score));

        score = 400;
        displayHighScorePosition(name, calculateHighScorePosition(score));

        score = 50;
        displayHighScorePosition(name, calculateHighScorePosition(score));

        score = 1000;
        displayHighScorePosition(name, calculateHighScorePosition(score));
    }

    public static int calculateScore(int score, int levelCompleted, int bonus) {
        return (score + (levelCompleted * bonus));
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(String.format("%1$s managed to get into position %2$s on the high score table.", name, position));
    }

    public static int calculateHighScorePosition(int score){
        int position = 4;
        if(score >= 1000){
            position = 1;
        } else if(score >= 500){
            position =  2;
        } else if(score >= 100){
            position = 3;
        }
        return position;
    }
}
