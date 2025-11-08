package com.Arrays.Power;

public class power {
    public static int power(int x,int n){
        double res =Math.pow(x,n);
        return (int) res;
    }
    public static void main(String[]args){
        int x=2;
        int n=10;
        double result =power(x,n);
        System.out.println(result);
    }
}
