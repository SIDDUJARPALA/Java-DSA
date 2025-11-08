package com.Arrays.MaximumProfit;

public class MaximumProfit {
    public static int MaximumProfit(int arr[],int n){
        int maxi =Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                if(arr[j]>arr[i]){
                    maxi=Math.max(arr[j]-arr[i],maxi);
                }

            }
        }
        return maxi;
    }
    public static void main(String[]args){
        int []arr ={7,1,5,3,6,4};
        int n=arr.length;
        int ans =MaximumProfit(arr,n);
        System.out.print(ans);

    }
}
