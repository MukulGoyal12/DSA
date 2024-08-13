package Recursion;

public class jump {
    public static void main(String s[]){
        int n=4;
        stairJump(n,"");
    }

    public static void stairJump(int n, String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        if(n<0) return;

        stairJump(n-3, ans+"3");
        stairJump(n-2, ans+"2");
        stairJump(n-1, ans+"1");
    }
}
