package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double first, double second){
        Pattern p = Pattern.compile("-?\\d+\\.?\\d{0,3}");
        Matcher f = p.matcher("" + first);
        Matcher s = p.matcher("" + second);
        if(f.find() && s.find()){
            System.out.println(f.group());
            System.out.println(s.group());
            if((f.group()).compareTo(s.group()) == 0){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
