import java.util.*;
class Solution4{
    public static int maxSubarraySum(int[] arr){
        int curr =arr[0];
        int maxi = arr[0];
        for(int i=1;i<arr.length;i++){
            curr = Math.max(arr[i], curr+arr[i]);
            maxi = Math.max(maxi ,curr);
        }
        return maxi;
    }
}
public class maxSubarraySum {
    public static void main(String[]args){
        int[]arr ={12,04,32,43,9};
        System.out.println(Solution4.maxSubarraySum(arr));
    }
}
