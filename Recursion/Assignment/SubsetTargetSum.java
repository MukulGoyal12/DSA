package Recursion.Assignment;


import java.util.*;

public class SubsetTargetSum{
    static int count=0;
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int target=sc.nextInt();
        ArrayList<Integer> list= new ArrayList<>();
        subset(arr,target,0,list,0);
        System.out.print("\n"+count);
    }

    public static void subset(int[] arr, int target, int sum, ArrayList<Integer> list,int index){
        if(sum==target){
            for(int i=0;i<list.size();i++)
                System.out.print(list.get(i)+" ");
            System.out.print("  ");
            count++;
            return;

        }

        if(sum>target || index>arr.length-1) return;

        list.add(arr[index]);
        subset(arr,target,sum+arr[index],list,index+1);

        list.remove(list.size()-1);
        subset(arr,target,sum,list,index+1);
    }
}