package com.adi.dsa.arrays;

public class PerfectArray {

    public static void main(String[] args) {

        //int[] arr = {1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1};
        int[] arr = {1, 1, 1, 1, 0};
        if(arr.length > 0)
            isPerfectArray(arr);
        else
            System.out.println("Invalid array length");
    }

    private static void isPerfectArray(int[] arr) {
        int length = arr.length;;
        int count = 0;
        int mid = Math.floorDiv(length+1, 2);
        System.out.println("Mid " + mid);
        for(int i = 0; i < length; i++){
            if(arr[i] == arr[--length])
                count++;
        }
        System.out.println("Count " + count);
        if(count == mid)
            System.out.println("PERFECT");
        else
            System.out.println("NOT PERFECT");
    }
}