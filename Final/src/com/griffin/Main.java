package com.griffin;

public class Main {

    public static void main(String[] args) {
//        SomeClass classOne = new SomeClass("One");
//        SomeClass classTwo = new SomeClass("Two");
//        SomeClass classThree = new SomeClass("Three");
//        SomeClass classFour = new SomeClass("Four");
//        SomeClass classFive = new SomeClass("Five");
//
//        System.out.println(classOne.INSTANCE_NUMBER);
//        System.out.println(classTwo.INSTANCE_NUMBER);
//        System.out.println(SomeClass.getNumber());
//
//        System.out.println();
//        System.out.println(Math.PI);
//
//        Password pass = new ExtendedPassword(6543);
//        pass.storePassword();
//        pass.letMeIn(7624);
//        pass.letMeIn(6543);

        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        SIBTest test2 = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);
    }
}
