package com.company;

import java.util.*;

public class LeagueTable<T extends Team> {
    private List<T> teams;

    public LeagueTable() {
        this.teams = new ArrayList<>();
    }

    public void addTeam(T team){
        if(team != null){
            teams.add(team);
        }
    }

    public void showLeagueTable(){
        Collections.sort(teams);
        for(T t : teams){
            System.out.println(t.getName() + ": " + t.rank());
        }
    }

}
