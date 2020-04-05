package com.company;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.fullName = "Griff";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);

        EnhancedPlayer player = new EnhancedPlayer("Griffin", 150, "Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}
