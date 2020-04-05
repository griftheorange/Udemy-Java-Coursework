package com.company;

public class Player {

    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player knocked out");
        } else {
            System.out.println(String.format("You have %s health left", healthRemaining()));
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
