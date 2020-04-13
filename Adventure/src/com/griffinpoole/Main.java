package com.griffinpoole;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);

        locations.get(2).addExit("N", 5);

        locations.get(3).addExit("W", 1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W",2);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);

        int loc = 1;
        while(true){
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0){
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits are:");
            for(String exit : exits.keySet()){
                System.out.print(exit + ", ");
            }
            System.out.println();


            while(true){
                String direction = getInput();
                if(exits.containsKey(direction)){
                    loc = exits.get(direction);
                    break;
                } else {
                    System.out.println("You cannot go in that direction.");
                }
            }
        }
    }

    public static String getInput(){
        String direction;
        while(true){
            String[] words = scanner.nextLine().toUpperCase().split(" ");
            for(int i = 0; i < words.length; i++){
                switch(words[i]){
                    case "WEST": case "W":case "EAST": case "E":case "SOUTH": case "S":case "NORTH": case "N": case "Q": case "QUIT":
                        return words[i].substring(0,1);
                }
            }
            System.out.println("Please enter a valid direction");
        }
    }


}
