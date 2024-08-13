package Recursion;

public class coinFlip {

    public static void main(String s[]){
        int n=3;
        flip(n,"");
    }

    public static void flip(int n, String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }

        flip(n-1,ans+"H");
        flip(n-1,ans+"T");
    }
}