package Recursion;
import java.util.*;

public class targetSubset {
    static int count=0;

    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();

        targetsum(arr,m,0,list,0);
        System.out.print("\n"+count);
    }

    public static void targetsum(int[] arr, int target, int sum, ArrayList<Integer> list, int index) {

        if (sum == target) {
            for (int i = 0; i < list.size(); i++)
                System.out.print(list.get(i) + " ");
            System.out.print("  ");
            count++;
            return;
        }

        if (sum > target || index > arr.length - 1) return;

        list.add(arr[index]);
        targetsum(arr, target, sum + arr[index], list, index + 1);

        list.remove(list.size() - 1);
        targetsum(arr, target, sum, list, index + 1);

    }

}