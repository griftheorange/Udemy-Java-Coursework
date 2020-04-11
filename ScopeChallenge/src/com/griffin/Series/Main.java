package com.griffin.Series;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter a number for its times table value");
        X x = new X(x());
        x.x();
    }

    public static int x(){
        Scanner x = new Scanner(System.in);
        while(true){
            if(x.hasNextInt()){
                return x.nextInt();
            } else {
                System.out.println("Please enter a number");
                x.nextLine();
            }
        }
    }
}
