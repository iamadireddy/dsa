package com.adi.dsa.practice;

public class FascinatingNumber {

    public static void main(String[] args) {

        int number = 274;
        if(String.valueOf(number).length() >= 3) {
            boolean flag = isFascinatingNumber(number);
            if(flag)
                System.out.println("Fascinating number");
            else
                System.out.println("Not a Fascinating number");
        }
        else
            System.out.println("Not a valid number");
    }

    private static boolean isFascinatingNumber(int number) {

        boolean flag = true;
        String newNumber = ""+number+(number*2)+(number*3);
        //String newNumber = "174548822";
        System.out.println(newNumber);
        if(newNumber.length() > 9)
            flag = false;
        else {
            for (int i = 1; i <= 9; i++) {
                int index = newNumber.indexOf(i + "");
                System.out.println("Index of number " + i + " is " + index);
                if (index < 0) {
                    flag = false;
                    System.out.println(i + " is missing...");
                    break;
                } else {
                    //Checking duplicate digit
                    String substring = newNumber.substring(index+1);
                    System.out.println("Substring " + substring);
                    int duplicateDigitIndex = newNumber.substring(index+1).indexOf(i + "");
                    System.out.println("Index of number " + i + " is " + duplicateDigitIndex);
                    if (duplicateDigitIndex >= 0) {
                        flag = false;
                        System.out.println(i + " is duplicate number...");
                        break;
                    }
                }
            }
        }
        return flag;
    }
}