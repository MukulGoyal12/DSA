package Recursion;

public class RatInMaze {
    public static void main(String s[]){
        int arr[][]= new int[3][3];
        int p= print(arr,0,0,"");
        System.out.print(p);
    }

    public static int print(int[][] arr, int row, int col,String ans){
        if(row==arr.length-1 && col==arr[0].length-1){
            System.out.println(ans);
            return 1;
        }

        if(row<0 || col<0 || row==arr.length || col==arr[0].length){
            return 0;
        }

        if(arr[row][col]==0){
            arr[row][col]=1;
            int a=print(arr,row+1, col,ans+"v");
            int b=print(arr,row, col+1,ans+"h");
            int c=print(arr,row-1, col,ans+"v");
            int d=print(arr,row, col-1,ans+"h");

            arr[row][col]=0;
            return a+b+c+d;
        }
        else return 0;
    }
}