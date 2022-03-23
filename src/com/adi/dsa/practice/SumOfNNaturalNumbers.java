package com.adi.dsa.practice;

public class SumOfNNaturalNumbers {

    public static void main(String[] args) {

        int number = 1;
        int sum = getSumOfNNaturalNumbers(number);
        System.out.println("Sum " + sum);
    }

    private static int getSumOfNNaturalNumbers(int number) {

        int sum = 0;
        sum = (number*(number+1))/2;

        return sum;
    }
}