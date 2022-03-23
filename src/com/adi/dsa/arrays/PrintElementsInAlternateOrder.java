package com.adi.dsa.arrays;

public class PrintElementsInAlternateOrder {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        printElementsInAlternateOrder(arr);
    }

    private static void printElementsInAlternateOrder(int[] arr) {

        for(int i = 0; i < arr.length; i = i+2){
            System.out.print(arr[i] + " ");
        }
    }
}