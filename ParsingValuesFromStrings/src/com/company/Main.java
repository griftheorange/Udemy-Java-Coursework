package com.company;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println(String.format("numberAsString = %s", numberAsString));

        int number = Integer.parseInt(numberAsString);
        System.out.println(String.format("number = %s", number));

        numberAsString += 1;
        number += 1;

        System.out.println(String.format("numberAsString = %s", numberAsString));
        System.out.println(String.format("number = %s", number));

        System.out.println();

        //Flour Packer
        System.out.println(FlourPacker.canPack(1, 0, 4));
        System.out.println(FlourPacker.canPack(1, 0, 5));
        System.out.println(FlourPacker.canPack(0, 5, 4));
        System.out.println(FlourPacker.canPack(2, 2, 11));
        System.out.println(FlourPacker.canPack(-3, 2, 12));

        System.out.println();

        //Largest Prime
        System.out.println(LargestPrime.getLargestPrime(21));
        System.out.println(LargestPrime.getLargestPrime(217));
        System.out.println(LargestPrime.getLargestPrime(0));
        System.out.println(LargestPrime.getLargestPrime(45));
        System.out.println(LargestPrime.getLargestPrime(-1));

        System.out.println();

        //Diagonal Star
        DiagonalStar.printSquareStar(8);
        DiagonalStar.printSquareStar(5);
        DiagonalStar.printSquareStar(20);
        DiagonalStar.printSquareStar(13);
    }
}
