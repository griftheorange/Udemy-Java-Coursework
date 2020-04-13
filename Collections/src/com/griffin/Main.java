package com.griffin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theater sydney = new Theater("Sydney Opera House", 8, 12);

        if(sydney.reserveSeat("D12")){
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat already reserved");
        }
        if(sydney.reserveSeat("D12")){
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat already reserved");
        }
        if(sydney.reserveSeat("B13")){
            System.out.println("Please pay for B13");
        } else {
            System.out.println("Seat already reserved");
        }

        List<Theater.Seat> reverseSeats = new ArrayList<>(sydney.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theater.Seat> priceSeats = new ArrayList<>(sydney.getSeats());
        priceSeats.add(sydney.new Seat("B00", 13.00));
        priceSeats.add(sydney.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theater.PRICE_ORDER);
        printList(priceSeats);
    }

    public static void printList(List<Theater.Seat> list){
        for(Theater.Seat seat : list){
            System.out.print(" " + seat.getSeatNumber() + " $ " + seat.getPrice());
        }
        System.out.println();
        System.out.println("==========================================================================================================================================");
    }
}
