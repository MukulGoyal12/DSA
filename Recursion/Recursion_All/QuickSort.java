package Recursion;

public class QuickSort {

    public static void swap(int[] arr, int i, int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public  static void quickSort(int arr[], int s, int e){
        if(s>=e) return;

        int p= partition(arr, s, e);

        quickSort(arr, s, p-1);
        quickSort(arr, p+1, e);
    }

    public static int partition(int arr[], int s, int e){
        int pivot=arr[s];
        int cnt=0;

        for(int i=s+1;i<=e;i++){
             if(arr[i]<=pivot)
                 cnt++;
         }

        int pivotIndex= s+cnt;
        swap(arr, pivotIndex, s);

        int i=s, j=e;
        while(i<pivotIndex && j>pivotIndex){

            while(arr[i]<pivot){
                i++;
            }

            while(arr[j]>pivot){
                j--;
            }

            if(i<pivotIndex && j>pivotIndex){
                swap(arr,i,j);
            }
        }
        return pivotIndex;
    }

    public static void main(String s[]){
        int arr[]= {5,3,1,9,7,8};
        int n=arr.length;

        quickSort(arr,0,n-1);

        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}