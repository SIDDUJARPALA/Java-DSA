package com.Arrays.MajorityOccers;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int MajorityOccurs(int[] arr,int n){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            int value = map.getOrDefault(arr[i],0);
            map.put(arr[i],value+1);
        }
        for(Map.Entry<Integer,Integer>mp :map.entrySet()){
            if(mp.getValue()>n/2){
                return mp.getKey();
            }
        }
        return  -1;
    }
    public static void main(String[]args)

    {
        int []arr={2, 2, 1, 1, 1, 2, 2};
        int n=arr.length;
        int ans = MajorityOccurs(arr,n);
        System.out.println(ans);

    }
}
