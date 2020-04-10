package com.company;

import java.util.ArrayList;
import java.util.List;

public class Team<T> implements Comparable<Team <T>>{
    private String name;
    private List<T> players = new ArrayList<T>();
    private int wins = 0;
    private int losses = 0;
    private int ties = 0;
    private int playedGames = 0;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(T player){
        if(player != null){
            players.add(player);
        }
    }

    public void playAgainst(Team<T> opponent, int ourScore, int theirScore){
        String message;
        if(ourScore > theirScore){
            wins++;
            message = " have triumphed over ";
        } else if(theirScore > ourScore){
            losses++;
            message = " have succumbed to ";
        } else {
            ties++;
            message = " matched squarely against ";
        }
        playedGames++;
        if(opponent != null){
            System.out.println(name + message + opponent.getName());
            opponent.playAgainst(null, theirScore, ourScore);
        }
    }

    public int rank(){
        return (wins * 2) + ties;
    }

    @Override
    public int compareTo(Team<T> team) {
        return this.rank() - team.rank();
    }
}
