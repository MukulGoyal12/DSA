package Recursion;

public class Matrix2D {
    public static void main(String args[]){
        int m=3,n=3;
        String s="";
        System.out.println(maze(m,n,s));
    }

    public static int maze(int m, int n, String s){
        if(m-1==0 && n-1==0){
            System.out.println(s);
            return 1;
        }

        if(m<1 || n<1){
            return 0;
        }

         return maze(m-1,n,s+"v") + maze(m,n-1,s+"h");
    }
}
