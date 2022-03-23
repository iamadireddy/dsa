package com.adi.dsa.arrays;

public class ExceptTwoGreatestElements {

    public static void main(String[] args) {

        int[] arr = {7, -2, 3, 4, 9, -1};
        if(arr.length > 2)
            printExceptTwoGreatestElements(arr);
        else
            System.out.println("Invalid array length");
    }

    private static void printExceptTwoGreatestElements(int[] arr) {
        int[] newArr = new int[arr.length-2];
        int index = 0;
        int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > firstMax) {
                int temp = firstMax;
                firstMax = arr[i];
                secondMax = temp;
            }
            else
                newArr[index++] = arr[i];
        }
        System.out.println(firstMax + " " + secondMax);
        arrSort(newArr);
        for (int i : newArr)
            System.out.print(i + " ");
    }

    private static void arrSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;

                i = 0;
            }
        }
    }
}