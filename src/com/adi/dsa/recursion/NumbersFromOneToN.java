package com.adi.dsa.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersFromOneToN {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the range...");
        int range = Integer.valueOf(reader.readLine());
        numbersFromOneToN(range);
    }

    private static void numbersFromOneToN(int range) {

        if(range <= 0)
            return;

        numbersFromOneToN(range - 1);
        System.out.print(range + " ");
    }
}