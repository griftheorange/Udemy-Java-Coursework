package com.griffin.Series;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        while(true){
            System.out.println("Enter the number of times table entries");
            if(x.hasNextInt()){
                x(x.nextInt());
                break;
            } else {
                x.nextLine();
            }
        }
    }

    //recieves max number of entries down to 1
    public static int x(int x){
        if(x >= 1){
            if(x == 1){
                while(true){
                    System.out.println("Enter the number to multiply");
                    x = new Scanner(System.in).nextInt();
                    System.out.print(x + " ");
                    return x;
                }
            } else {
                int X = x(x-1);
                System.out.print(x * X + " ");
                return X;
            }
        } else {
                return -1;
        }
    }
}
