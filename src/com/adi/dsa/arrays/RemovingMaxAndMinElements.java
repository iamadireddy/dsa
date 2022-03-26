package com.adi.dsa.arrays;

import java.util.Arrays;

public class RemovingMaxAndMinElements {

    public static int[] removingMaxAndMinElements(int[] arr, int index){

        int[] newArr = new int[arr.length-1];

        if(arr == null || arr.length < 0 || index >= arr.length) {
            return arr;
        }
        for(int i = 0,  k = 0; i <arr.length; i++) {
            if(i == index) {
                continue;
            }
            newArr[k++] = arr[i];
        }
        arr = newArr;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {8, 1, 2, 9, 4, 3, 7, 5};
        removingMaxAndMinElements(arr, arr.length);
        boolean flag = true;
        int[] newArr;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-1; ) {
            if(flag) {
                newArr = removingMaxAndMinElements(arr, arr.length-1);
                flag = false;
            }else {
                newArr = removingMaxAndMinElements(arr,0);
                flag = true;
            }
            arr = newArr;
        }
        System.out.println("Final element " + Arrays.toString(arr));
    }
}