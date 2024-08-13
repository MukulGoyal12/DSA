package Recursion;

public class SortedArray {
    public static void main(String s[]){
        int arr[]= {1,5,9,12,6,17};
        int n=arr.length;
        System.out.println(sort(n,arr));
    }

    public static boolean sort(int n, int[] arr){
        if(n==0 || n==1) return true;

        if(arr[n-2]>arr[n-1]) return false;
        else return sort(n-1,arr);
    }
}
