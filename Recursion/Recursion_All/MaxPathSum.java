package Recursion;

public class MaxPathSum {

    public static void main(String[] args){
        int[][] arr= {{3,4,9},{2,1,6},{3,7,3}};
        System.out.println(sum(arr,0,3,3));
    }

    public static int sum(int[][] arr, int sum, int m, int n){
        if(m-1==0 && n-1==0){
            return sum;
        }

        if(m<1 || n<1) return 0;

        return sum(arr, sum+arr[m-1][n-1], m-1, n) + sum(arr, sum+arr[m-1][n-1], m-1, n);
    }
}
