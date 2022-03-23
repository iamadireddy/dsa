package com.adi.dsa.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LessOrGreaterThanGivenInteger {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the array size...");
        int size = Integer.valueOf(reader.readLine());
        System.out.println("Please enter the value...");
        int val = Integer.valueOf(reader.readLine());
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            System.out.println("Please enter the array values for index " + i);
            arr[i] = Integer.valueOf(reader.readLine());;
        }
        int count = getLessOrGreaterThanGivenInteger(arr, val);
        System.out.println("Less than or equal values count for given value is " + count);
    }

    private static int getLessOrGreaterThanGivenInteger(int[] arr, int val) {
        int count = 0;
        for(int i : arr){
            if(i <= val)
                count++;
        }
        return count;
    }
}