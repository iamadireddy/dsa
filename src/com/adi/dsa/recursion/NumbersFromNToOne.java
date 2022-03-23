package com.adi.dsa.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersFromNToOne {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter range...");
        int range = Integer.valueOf(reader.readLine());
        numbersFromNToOne(range);
    }

    private static void numbersFromNToOne(int range) {

        if(range <= 0)
            return;

        System.out.print(range + " ");
        numbersFromNToOne(range-1);
        //System.out.print(range + " ");
    }
}