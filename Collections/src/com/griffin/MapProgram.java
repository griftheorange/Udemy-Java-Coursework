package com.griffin;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if(languages.containsKey("Java")){
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "A compiled high level, object-oriented, platform independant language");
            System.out.println("Java added successfully");
        }
        languages.put("Python", "An interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "An algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purpose Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Herein lies madness"));

        System.out.println(languages.get("Ruby"));
        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else {
            System.out.println(languages.put("Java", "this course is about Java"));

        }
        System.out.println(languages.get("Java"));

        System.out.println("==================================================");

//        languages.remove("Lisp");
        if(languages.remove("Algol", "A family of algorithmic languages")){
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }
        if(languages.replace("Lisp", "Herein lies madness", "a functional programming language with imperative features")){
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }
        System.out.println(languages.replace("Scala", "This will not be added"));
        for(String key : languages.keySet()){
            System.out.println(String.format("%1$s: %2$s", key, languages.get(key)));
        }
    }
}
