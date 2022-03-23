package com.adi.dsa.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintTheGivenIndexValueInArray {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the array size...");
        int size = Integer.valueOf(reader.readLine());
        System.out.println("Please enter the index...");
        int index = Integer.valueOf(reader.readLine());
        int[] arr = new int[size];
        if(arr.length > index && index >= 0) {
            System.out.println("Please enter the array values...");
            for(int i = 0; i < size; i++){
                System.out.println("Please enter the array values for index " + i);
                arr[i] = Integer.valueOf(reader.readLine());;
            }
        //System.out.println("Given index value is " + arr[index]);
        int value = getTheIndexValue(arr, index);
        System.out.println("Given index value is " + value);
        }else
            System.out.println("Please enter the proper index");
    }

    private static int getTheIndexValue(int[] arr, int index) {
        return arr[index];
    }
}