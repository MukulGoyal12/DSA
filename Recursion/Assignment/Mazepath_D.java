package Recursion.Assignment;

import java.util.*;
public class Mazepath_D {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int arr[][]=new int[n1][n2];
        int c[]=new int[1];
        path(arr,0,0,c,"");
        System.out.print("\n"+c[0]);
    }

    public static void path(int[][] arr, int row, int col, int[] count, String p){
        if(row==arr.length-1 && col==arr[0].length-1){
            System.out.print(p+" ");
            count[0]++;
            return;
        }

        if(row>arr.length-1 || col>arr[0].length-1) return;

        path(arr,row+1,col,count,p+"V");
        path(arr,row,col+1,count,p+"H");
        path(arr,row+1,col+1,count,p+"D");
    }

}
