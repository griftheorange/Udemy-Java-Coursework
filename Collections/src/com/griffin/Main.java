package com.griffin;

public class Main {

    public static void main(String[] args) {
        Theater sydney = new Theater("Sydney Opera House", 20, 12);
//        sydney.getSeats();
        if(sydney.reserveSeat("H11")){
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry this seat is taken");
        }
        if(sydney.reserveSeat("H11")){
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry this seat is taken");
        }
    }
}
