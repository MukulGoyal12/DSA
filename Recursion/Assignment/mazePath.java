package Recursion.Assignment;

import java.util.*;

public class mazePath {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int board[][]= new int[row][col];
        int count[]= new int[1];
        ArrayList<String> list= new ArrayList<>();
        path("",board,0,0,list,count);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("\n"+count[0]);
    }

    public static void path(String p,int[][] board,int row,int col,ArrayList<String> list,int[] count){
        if(row==board.length-1 && col==board[0].length-1){
            list.add(p);
            count[0]++;
            return;
        }

        if(row>board.length-1 || col>board[0].length-1 )
            return;

        path(p+"V",board,row+1,col,list,count);
        path(p+"H",board,row,col+1,list,count);
    }
}
