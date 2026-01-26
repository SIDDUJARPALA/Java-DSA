import java.awt.*;
import  java.util.*;
class Solution2{
    public static int SecondLargest(int[]arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int num :arr)
        {
            if(num>largest){
                secondLargest =largest;
                largest = num;
            }else if(num>secondLargest && num!=largest){
                secondLargest = num;
            }
        }
        if(secondLargest == Integer.MIN_VALUE){
            return -1;
        }else{
            return secondLargest;
        }

    }
}
public class SecondLargest {
    public static void main(String[]args){
        int[]arr = {12,33,54,65};
        System.out.println(Solution2.SecondLargest(arr));
    }
}
