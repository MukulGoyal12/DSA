package Recursion_All;

public class MergeSort {

    public static void main(String s[]){
        int arr[]={5,2,8,1,6,66,76,61,3};
        int n=arr.length;

        divide(arr,0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void krloSort(int arr[], int strt, int mid, int end){
        int merged[]= new int[end-strt+1];
        int index1=strt;
        int index2=mid+1;
        int x=0;

        while(index1<=mid && index2<=end){
            if(arr[index1] <= arr[index2]){
                merged[x]=arr[index1];
                x++;
                index1++;
            }
            else{
                merged[x]=arr[index2];
                x++;index2++;
            }
        }

        while(index1<=mid){
            merged[x]=arr[index1];
            x++;index1++;
        }

        while(index2<=end){
            merged[x]=arr[index2];
            x++;index2++;
        }

        for(int i=0, j=strt ; i<merged.length; i++, j++){
            arr[j]=merged[i];
        }

    }
    public static void divide(int arr[], int strt, int end){
        if(strt>= end) return;

        int mid=strt+(end-strt)/2;
        divide(arr, strt, mid);
        divide(arr,mid+1,end);
        krloSort(arr,strt,mid,end);
    }

}