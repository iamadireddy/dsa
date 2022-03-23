package com.adi.dsa.arrays;

public class SumOfIntegersInArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        int sum = getSum(arr);
        System.out.println("Sum " + sum);
    }

    private static int getSum(int[] arr) {

        int sum = 0;
        for(int i : arr)
            sum = sum+i;
        return sum;
    }
}