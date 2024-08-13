package BackTracking;

public class chessBoard {

    public static void main(String[] args) {
        int[][] board= new int[3][3];
        int count[]= new int[1];
        chess(board,0,0,count,"");
        System.out.println("\n"+count[0]);
    }

    private static void chess(int[][] board, int row, int col, int[]count, String path){

        path = path+ "{" + row + "-" + col + "}";

        if(row>= board.length || col>=board[0].length){
            return;
        }

        if(row== board.length-1 && col==board[0].length-1){
            System.out.print(path + " ");
            count[0]++;
            return;
        }

        //knight : Ghoda

        int[] r={2,1};
        int[] c={1,2};

        for(int i=0;i<c.length;i++){
            chess(board,row+r[i],col+c[i],count, path+"K");
        }

        //Rook : Hathi

        if(row==0 || row==board.length-1 || col==0 || col==board[0].length-1){
            for(int i=1;i<=board.length-1;i++)
                chess(board,row+i,col,count, path+"R");
            for(int i=1;i<=board[0].length-1;i++)
                chess(board,row,col+i,count, path+"R");
        }

        //Bishop : oonth

        if(row==col || (row+col)== board.length-1){
            for(int i=1;i<board.length;i++)
                chess(board,row+i,col+i,count, path+"B");
        }

    }
}
