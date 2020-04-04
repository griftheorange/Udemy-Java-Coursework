package com.company;

public class LargestPrime {
    public static int getLargestPrime(int num){
        if(num > 1){
            for(int factor = num; factor > 1; factor--){
                if(num % factor == 0){
                    int sqrt = (int)Math.sqrt(factor);
                    boolean isPrime = true;
                    for(int j = sqrt; j > 1; j--){
                        if(factor % j == 0){
                            isPrime = false;
                        }
                    }
                    if(isPrime){return factor;}
                }
            }
            return -1;
        } else {
            return -1;
        }
    }

}
