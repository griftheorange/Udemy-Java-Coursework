package com.company;

public class NumberToWords {
    public static void numberToWords(int num){
        if(num >= 0){
            int numDigits = getDigitCount(num);
            int count = 0;
            num = reverse(num);
            String printed = "";
            while(num > 0){
                int dig = num % 10;
                num /= 10;
                count++;
                switch(dig){
                    case 0:
                        printed += " Zero";
                        break;
                    case 1:
                        printed += " One";
                        break;
                    case 2:
                        printed += " Two";
                        break;
                    case 3:
                        printed += " Three";
                        break;
                    case 4:
                        printed += " Four";
                        break;
                    case 5:
                        printed += " Five";
                         break;
                    case 6:
                        printed += " Six";
                        break;
                    case 7:
                        printed += " Seven";
                        break;
                    case 8:
                        printed += " Eight";
                        break;
                    default:
                        printed += " Nine";
                        break;
                }
            }
            while(count < numDigits){
                printed += " Zero";
                count ++;
            }
            System.out.println(printed.substring(1));

        } else {
            System.out.println("Invalid Value");
        }
    }

    public static int reverse(int num){
        boolean isNegative;
        if(num < 0){isNegative = true;} else {isNegative = false;}
        num = Math.abs(num);
        String s = Integer.toString(num);
        String newString = "";
        for(int i = 0; i < s.length(); i++){
            newString += s.charAt(s.length() - 1 - i);
        }
        num = Integer.parseInt(newString);
        if(isNegative){num *= -1;}
        return num;
    }

    public static int getDigitCount(int num){
        if(num >= 0){
            int count = 0;
            while(num > 0){
                num /= 10;
                count++;
            }
            if(count == 0){count = 1;}
            return count;
        } else {
            return -1;
        }
    }
}
