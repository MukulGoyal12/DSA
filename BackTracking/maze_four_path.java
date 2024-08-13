package BackTracking;
import java.util.*;

public class maze_four_path {
    public static void main(String[] args) {
        int arr[][]= {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        int[][] path= new int[arr.length][arr[0].length];
        path("",arr,0,0, path, 1);
    }

    public static void path(String p,int[][] arr, int row, int col, int[][] path, int step){
        if(row==arr.length-1 && col==arr[0].length-1){
            path[row][col]=step;
            for(int[] ar:path){
                System.out.println(Arrays.toString(ar));
            }
            System.out.println(p+"\n");
            return;
        }

        if(arr[row][col]==0) return;

        arr[row][col]=0;
        path[row][col]=step;

        if(row<arr.length-1)
            path(p+"D",arr,row+1,col,path,step+1);
        if(col<arr[0].length-1)
            path(p+"R",arr,row,col+1,path,step+1);
        if(col>0)
            path(p+"L",arr,row,col-1,path,step+1);
        if(row>0)
            path(p+"U",arr,row-1,col,path,step+1);

        arr[row][col]=1;
        path[row][col]=0;
    }
}
