package com.example.myPackage;

import com.example.game.Monster;
import com.example.game.Player;
import com.example.game.ISaveable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Player player = new Player("Griffin", 80, 50);
        System.out.println(player.toString());
        System.out.println();
        List<String> save = player.write();
        Player loadedPlayer = new Player();
        loadedPlayer.read(save);
        System.out.println(loadedPlayer.toString());
        System.out.println( );

        saveObject(loadedPlayer);
        System.out.println();

        loadObject(loadedPlayer);
        System.out.println();

        saveObject(loadedPlayer);
        System.out.println();

        System.out.println(loadedPlayer.toString());
        System.out.println();

        ISaveable werewolf = new Monster("Werewolf", 20, 40);
        System.out.println(werewolf);
        saveObject(werewolf);

    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");
        while(!quit){
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave){
        List save = objectToSave.write();
        for(int i = 0; i < save.size(); i++){
            System.out.println("Saving " + save.get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
