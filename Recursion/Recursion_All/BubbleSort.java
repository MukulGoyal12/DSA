package Recursion;

public class BubbleSort {
    public static void main(String s[]){
        int arr[]={3,5,2,9,3,4};
        int n=arr.length;
        sort(arr,n);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }

    public static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void sort(int[] arr, int n){
        if(n==0 || n==1) return;

        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1])
                swap(arr, i,i+1);
        }

        sort(arr,n-1);
    }
}
