import java.util.*;
class Sol{
    public static ArrayList<Integer> findDuplicates(int[]arr){
        ArrayList<Integer>res = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int idx = Math.abs(arr[i])+1;
            if(arr[idx]<0)
            {
                res.add(idx);
            }else{
                arr[idx] = -arr[idx];
            }
        }
        return  res;

    }

}
public class findDuplicates {
    public static void main(String[]args){
        int[]arr = {21,4,3,5,6,8};
        System.out.println(Sol.findDuplicates(arr));
    }
}
