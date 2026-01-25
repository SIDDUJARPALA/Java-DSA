import  java.util.*;
class Solution1{
    static int MissingNum(int[]arr){
        long n = arr.length+1;
        long expertedSum = n*(n+1)/2;
        long actualSum=0;
        for(int num:arr){
            actualSum+= num;
        }
        return (int)(expertedSum-actualSum);
    }
}
public class MissingNum {
    public  static  void main(String[]args){
        int []arr = {1,2,4,5};
        System.out.println(Solution1.MissingNum(arr));

    }
}
