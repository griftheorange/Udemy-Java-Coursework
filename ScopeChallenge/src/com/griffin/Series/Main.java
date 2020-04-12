package com.griffin.Series;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter a number for its times table value");
        //Calls the "getInput" below and initializes an instance of class X x with the return
        X x = new X(x());
        //Call the instance method x() from x
        x.x();
    }

    //This method could be referred to as "getInput". Prompts user repeatedly until an acceptable int comes, returns the int
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
