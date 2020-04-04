package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 and 2% interest = " + calculateInterest(10000D, 2D));
        System.out.println("10,000 and 3% interest = " + calculateInterest(10000D, 3D));
        System.out.println("10,000 and 4% interest = " + calculateInterest(10000D, 4D));
        System.out.println("10,000 and 5% interest = " + calculateInterest(10000D, 5D));

        for(int i = 0; i < 5; i++){
            System.out.println("Loop " + i + " hello!");
        }

        for(int i = 2; i < 9; i++){
            System.out.println(String.format("10,000 at %1$s%% interest = %2$.2f", i, calculateInterest(10000, (double)i)));
        }

        System.out.println();

        for(int i = 8; i > 1; i--){
            System.out.println(String.format("10,000 at %1$s%% interest = %2$.2f", i, calculateInterest(10000, (double)i)));
        }

        int count = 0;
        for(int i = 10; i <= 50; i++){
            if(isPrime(i)){
                System.out.println(String.format("%s is Prime", i));
                count++;
            }
            if(count == 3){break;}
        }
    }

    public static boolean isPrime(int num){
        if(num == 1){
            return false;
        }

        long sqrt = (long)(Math.sqrt(num));
        for(int i = 2; i <= sqrt; i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;

    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
}
