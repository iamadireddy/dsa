package com.adi.dsa.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfIntegers {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the integer");
        int number = Integer.valueOf(reader.readLine());
        int sum = sumOfIntegers(number);
        System.out.println("Sum is " + sum);
    }

    private static int sumOfIntegers(int number) {

        int sum = 0, num = number;
        if(number == 0)
            return 0;

        if(number < 0)
            number = number * -1;

        sum = number%10 + sumOfIntegers(number/10);

        if(num < 0)
            return sum*-1;
        else
            return sum;

        //return number%10+sumOfIntegers(number/10);
    }
}