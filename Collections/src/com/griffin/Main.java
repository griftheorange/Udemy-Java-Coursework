package com.griffin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theater sydney = new Theater("Sydney Opera House", 8, 12);
        List<Theater.Seat> seatCopy = new ArrayList<>(sydney.seats);
        printList(seatCopy);
        seatCopy.get(1).reserve();
        if(sydney.reserveSeat("A02")){
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }
        Collections.reverse(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("Printing original");
        printList(sydney.seats);
        Collections.shuffle(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("Printing original");
        printList(sydney.seats);

        System.out.println();
        Theater.Seat minSeat = Collections.min(seatCopy);
        Theater.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min seat number is " + minSeat.getSeatNumber());
        System.out.println("Max seat number is " + maxSeat.getSeatNumber());

        sortList(seatCopy);
        System.out.println("Printing sorted seatCopy");
        printList(seatCopy);

//        List<Theater.Seat> newList = new ArrayList<>(sydney.seats.size());
//        Collections.copy(newList, sydney.seats);


//        sydney.getSeats();
//        if(sydney.reserveSeat("H11")){
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry this seat is taken");
//        }
//        if(sydney.reserveSeat("H11")){
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry this seat is taken");
//        }
    }

    public static void sortList(List<? extends Theater.Seat> list){
        for(int i = 0; i < list.size(); i++){
            for(int j=i+1; j < list.size(); j++){
                if(list.get(i).compareTo(list.get(j)) > 0){
                    Collections.swap(list, i, j);
                }
            }
        }
    }

    public static void printList(List<Theater.Seat> list){
        for(Theater.Seat seat : list){
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("==========================================================================================================================================");
    }
}
