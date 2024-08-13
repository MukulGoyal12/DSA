
package Recursion;
import java.util.*;

public class NQueen {
    public static void main(String[] args) {
        int n = 9;
        char board[][] = new char[n][n];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                board[i][j] = '.';
            }
        }
        helper(board, 0);
    }

    private static void helper(char[][] board, int i) {

        if(i == board.length) {
            print(board);
            System.out.println("*");
            return;
        }
        for(int j = 0; j < board.length; j++) {
            if(safe(board, i, j)) {
                board[i][j] = 'Q';
                helper(board, i + 1);
                board[i][j] = '.';
            }
        }
    }

    private static void print(char[][] board) {

        for(char i[]: board) {
            for(char j: i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static boolean safe(char[][] board, int i, int j) {

        for(int r = 0; r < i; r++) {
            if(board[r][j] == 'Q') {
                return false;
            }
        }
        for(int r = i - 1, c = j - 1; r >= 0 && c >= 0; r--, c--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        for(int r = i - 1, c = j + 1; r >= 0 && c < board.length; r--, c++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }
}