package com.company;

public class Main {

    public static void main(String[] args) {
        LeagueTable<Team<FootballPlayer>> footballLeague = new LeagueTable<>();
        Team<FootballPlayer> FBTeam1 = new Team<>("Steelers");
        Team<FootballPlayer> FBTeam2 = new Team<>("Eagles");
        Team<FootballPlayer> FBTeam3 = new Team<>("Patriots");
        Team<BaseballPlayer> BBTeam1 = new Team<>("Yankees");

        footballLeague.addTeam(FBTeam1);
        footballLeague.addTeam(FBTeam2);
        footballLeague.addTeam(FBTeam3);
//        footballLeague.addTeam(BBTeam1);

        FBTeam1.playAgainst(FBTeam2, 2, 0);
        FBTeam1.playAgainst(FBTeam3, 2, 0);
        FBTeam2.playAgainst(FBTeam3, 6, 0);

        FBTeam1.playAgainst(FBTeam2, 2, 2);
        FBTeam1.playAgainst(FBTeam3, 2, 7);
        FBTeam2.playAgainst(FBTeam3, 6, 6);

        System.out.println(FBTeam1.rank());
        System.out.println(FBTeam2.rank());
        System.out.println(FBTeam3.rank());
        System.out.println();

        footballLeague.showLeagueTable();
        System.out.println();
        FBTeam3.playAgainst(FBTeam1, 2, 0);
        FBTeam3.playAgainst(FBTeam2, 2, 0);
        FBTeam3.playAgainst(FBTeam1, 2, 0);
        System.out.println();
        footballLeague.showLeagueTable();
    }
}
