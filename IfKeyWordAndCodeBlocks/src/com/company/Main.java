package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000) {
            System.out.println(String.format("Your score was %1$s, your bonus was %2$s", score, bonus));
            System.out.println("This was executed");
        }
    }
}
