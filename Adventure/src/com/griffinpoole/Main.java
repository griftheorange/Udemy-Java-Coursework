package com.griffinpoole;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Map<String, Integer> tempExits = new HashMap<>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java", tempExits));

        tempExits = new HashMap<>();
        tempExits.put("W", 2);
        tempExits.put("E", 3);
        tempExits.put("S", 4);
        tempExits.put("N", 5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building", tempExits));

        tempExits = new HashMap<>();
        tempExits.put("N", 5);
        locations.put(2, new Location(2, "You are at the top of a hill", tempExits));

        tempExits = new HashMap<>();
        tempExits.put("W", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring", tempExits));

        tempExits = new HashMap<>();
        tempExits.put("N", 1);
        tempExits.put("W",2);
        locations.put(4, new Location(4, "You are in a valley beside a stream", tempExits));
        
        tempExits = new HashMap<>();
        tempExits.put("S", 1);
        tempExits.put("W", 2);
        tempExits.put("N", 6);
        locations.put(5, new Location(5, "You are in the forest", tempExits));


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
