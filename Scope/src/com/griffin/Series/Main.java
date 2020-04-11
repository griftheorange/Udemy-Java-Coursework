package com.griffin.Series;

public class Main {

    public static void main(String[] args) {
        String varFour = "this is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance varOnce is " + scopeInstance.getVarOne());
        System.out.println(varFour);

        scopeInstance.timesTwo();
        System.out.println("*************************");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
        System.out.println();

        scopeInstance.useInner();
        System.out.println();
        ScopeCheck.InnerClass innerClass1 = scopeInstance.new InnerClass();
        System.out.println("varThree is not accessible here");

    }
}
