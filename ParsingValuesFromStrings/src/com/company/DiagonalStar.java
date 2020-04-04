package com.company;

public class DiagonalStar {
    public static void printSquareStar(int num){
        if(num >= 5){
            String stars = "";
            for(int i = 0; i < num; i++){stars += "*";}
            System.out.println(stars);

            int midway = num/2;
            int sideSpaces = 0;
            for(int i = 1; i < midway; i++){
                System.out.print("*");
                for(int j = 0; j < sideSpaces; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int j = 0; j < num-4-(sideSpaces*2); j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int j = 0; j < sideSpaces; j++){
                    System.out.print(" ");
                }
                System.out.println("*");
                sideSpaces++;
            }
            if(num%2 != 0){
                int middler = (num-3)/2;
                System.out.print("*");
                for(int j = 0; j < middler; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int j = 0; j < middler; j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            sideSpaces--;
            for(int i = 1; i < midway; i++){
                System.out.print("*");
                for(int j = 0; j < sideSpaces; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int j = 0; j < num-4-(sideSpaces*2); j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int j = 0; j < sideSpaces; j++){
                    System.out.print(" ");
                }
                System.out.println("*");
                sideSpaces--;
            }

            stars = "";
            for(int i = 0; i < num; i++){stars += "*";}
            System.out.println(stars);
        } else {
            System.out.println("Invalid Value");
        }
    }
}
