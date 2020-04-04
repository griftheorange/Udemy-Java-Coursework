package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(DigitSum.sumDigits(125));

        System.out.println();

        System.out.println(NumberPalindrome.isPalindrome(-1221));
        System.out.println(NumberPalindrome.isPalindrome(707));
        System.out.println(NumberPalindrome.isPalindrome(11212));

        System.out.println();

        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(252));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(257));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(0));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(5));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(-10));

        System.out.println();

        System.out.println(EvenDigitSum.getEvenDigitSum(123456789));
        System.out.println(EvenDigitSum.getEvenDigitSum(252));
        System.out.println(EvenDigitSum.getEvenDigitSum(-22));

        System.out.println();

        //hasSameLastDigit
        System.out.println(LastDigitChecker.hasSameLastDigit(41, 22, 71));
        System.out.println(LastDigitChecker.hasSameLastDigit(23, 32, 42));
        System.out.println(LastDigitChecker.hasSameLastDigit(9, 99, 999));

        System.out.println();

        //greatestCommonDivisor
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(25, 15));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(12, 30));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(9, 18));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(81, 153));

        System.out.println();

        //All Factors
        FactorPrinter.printFactors(6);
        FactorPrinter.printFactors(32);
        FactorPrinter.printFactors(10);
        FactorPrinter.printFactors(-1);
    }
}
