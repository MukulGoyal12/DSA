package Recursion;

public class ArraySum {
    public static void main(String s[]){
        int arr[]={3,2,5,1,6,8};
        int n=arr.length;
        System.out.println(sums(arr,n,0));
    }

    public static int sums(int[] arr, int n, int sum){
        if(n==0) return sum;

        sum+=arr[n-1];
        return sums(arr,n-1,sum);
    }
}
