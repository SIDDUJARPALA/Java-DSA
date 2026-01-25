import java.util.*;
class Solution{
    static ArrayList<Integer>SubArray(int[] arr,int target){
        ArrayList<Integer>res = new ArrayList<>();
        int start =0;
        int sum =0;
        for(int end =0;end<arr.length;end++){
            sum+= arr[end];
            end++;
            while(sum>target && start<= end){
                sum -= arr[start];
                start++;
            }
            if(sum== target){
                 res.add(start+1);
                 res.add(end+1);
                 return res;

            }
        }
        res.add(-1);
        return res;


    }

}
public class SubArray {
    public static  void main(String args[]){
        int [] arr = {1,2,3,4,5,6,7};
        int target = 12;
        System.out.println(Solution.SubArray(arr,target));


    }
}
