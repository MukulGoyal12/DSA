package BackTracking;
import java.util.*;
public class Combination_LeetCoe {
    public static void combinationSum(int[] arr, int target,ArrayList<Integer> list,ArrayList<List<Integer>> li) {
        if(target==0) {
            System.out.println(li);
            li.add(new ArrayList<>(list));
            return;
        }
        if(target<0) {
            return ;
        }
        for(int i=0;i<arr.length;i++) {
            list.add(arr[i]);
            combinationSum(arr,target-arr[i],list,li);
            list.remove(list.size()-1);
        }
    }
    public static void main(String args[]) {
        int arr[]= {2,3,6,7};
        int target=7;
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<List<Integer>> li=new ArrayList<List<Integer>>();
        combinationSum(arr,target,list,li);
    }

}