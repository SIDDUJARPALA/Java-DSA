package com.Arrays.MajorityOcc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static List<Integer>Majority(int[]arr){
        int n=arr.length;
        List<Integer>li= new ArrayList<>();
        HashMap<Integer,Integer>map =new HashMap<>();
        int mini =(int)(n/3)+1;
        for(int i=0;i<n;i++){
            int value = map.getOrDefault(arr[i],0);
            map.put(arr[i],value+1);
            if(map.get(arr[i])==mini){
                li.add(arr[i]);
            }
            if(li.size()==2)break;;
        }
        return li;




    }
    public static void main(String[]args){
        int []arr = {11,33,33,11,33,11};
        List<Integer>ans =Majority(arr);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
        System.out.println();
    }
}
