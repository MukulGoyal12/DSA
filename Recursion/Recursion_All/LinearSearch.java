package Recursion;

public class LinearSearch {
    public static void main(String s[]){
        int arr[]={3,2,5,1,6,8};
        int n=arr.length;
        int key=9;
        System.out.println(find(arr,n,key));
    }

    public static boolean find(int arr[], int n, int key){
        if(n==0) return false;
        if(arr[n-1]==key) return true;

        return find(arr,n-1,key);

//        or
//        if(arr[i]==key) return true;
//        return find(arr,n-1,key,i+1);
    }
}
