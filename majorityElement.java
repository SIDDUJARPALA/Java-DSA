 import java.util.*;
class Solution5{
    public static int majorityElement(int[]arr){
        int candidate =0;
        int n=arr.length;
        int count =1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==candidate){
                count++;
            }else{
                count--;
            }
            if(count==0){
                candidate=arr[i];
                count++;
            }
        }
        count =0;
        for(int num : arr){
            if(num==candidate){
                count++;
            }
        }
        return (count>n/2)? candidate : -1;
    }

 }
public class majorityElement {
    public static void main(String[]args){
        int[]arr = {1,2,1,4,5,2,1,3,1,1};
        System.out.println(Solution5.majorityElement(arr));
    }
}
