package com.griffinpoole;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();
        for(int i = 1; i <= 100; i++){
            squares.add(i * i);
            cubes.add(i * i * i);
        }
        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes.");

        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);

        System.out.println("Union contains " + union.size() + " elements.");
        System.out.println("The intersection of squares and cubes bases 1<->100 is:");
        for(Integer value : intersection){
            System.out.println("\t" + value + " = " + (int)Math.sqrt(value) + "^2 = " + (int)Math.cbrt(value) + "^3");
        }

        Set<String> words = new HashSet<>();
        String sentence= "one day in the year of the fox";
        String[] arrayWords= sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for(String s : words){
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "is", "divine"};
        nature.addAll(Arrays.asList(natureWords));
        divine.addAll(Arrays.asList(divineWords));

        
    }
}
