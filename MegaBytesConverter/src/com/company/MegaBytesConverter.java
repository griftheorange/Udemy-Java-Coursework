package com.company;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes >= 0){
            int megaBytes = kiloBytes/1024;
            int remainder = kiloBytes%1024;
            System.out.println(String.format("%1$s KB = %2$s MB and %3$s KB", kiloBytes, megaBytes, remainder));
        } else {
            System.out.println("Invalid Value");
        }
    }
}
