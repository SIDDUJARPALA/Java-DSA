package com.Arrays.kanadeAlgorithm;

//kanadeAlgorithm->adane’s Algorithm is a dynamic programming
// algorithm used to find the maximum sum subarray (continuous sequence)
// in a one-dimensional array of numbers.
//Problem Statement: Given an integer array arr, find the contiguous subarray (containing at least one number) which
//has the largest sum and returns its sum and prints the subarray.

public class MaximumSubArray {
    public static int MaxsubArray(int[]arr,int n){
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                maxi=Math.max(maxi,sum);
            }
        }
        return maxi;

    }
    public static  void main(String[]args){
        int[]num={2,3,5,-2,7,-4};
        int n=num.length;
        int ans=MaxsubArray(num,n);
        System.out.println(ans);




    }
}
