package com.adi.dsa.arrays;

public class BalanceSum {

    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 2};
        int balance = 0;
        if(arr.length > 0)
            balance = getBalanceSum(arr);
        else
            System.out.println("Invalid array length");

        System.out.println("To make the array balanced we can add " + balance);
    }

    private static int getBalanceSum(int[] arr) {

        int mid = (arr.length+1)/2;
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < arr.length; i++){
            if(i <= mid-1)
                leftSum = leftSum+arr[i];
            else
                rightSum = rightSum+arr[i];
        }
        System.out.println("leftSum " + leftSum + " and rightSum " + rightSum);
        int balance = leftSum-rightSum;
        if(balance < 0)
            balance = balance*-1;

        return balance;
    }
}