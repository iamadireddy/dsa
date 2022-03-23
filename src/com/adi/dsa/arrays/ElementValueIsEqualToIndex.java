package com.adi.dsa.arrays;

public class ElementValueIsEqualToIndex {

    public static void main(String[] args) {

        int[] arr = {15, 2, 45, 12, 7};
        getElementValueIsEqualToIndex(arr);
    }

    private static void getElementValueIsEqualToIndex(int[] arr) {

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == i+1)
                System.out.print(arr[i] + " ");
        }
    }
}