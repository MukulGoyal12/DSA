package Recursion;

public class BinarySearch {
    public static void main(String s[]){
        int arr[] ={0,1,4,5,7,8,9};
        int n=arr.length;
        int key=6;
        System.out.println(search(arr,0,n-1,key));
    }

    public static boolean search(int[] arr,int start, int end,int key){
        int mid=start + (end-start)/2;
        if(start>end) return false;
        if(arr[mid]==key) return true;

        if(arr[mid]>key) return search(arr,start,mid-1,key);
        else return search(arr,mid+1,end,key);
    }
}
