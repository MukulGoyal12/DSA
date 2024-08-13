package Recursion;

public class HeadTail {
    public static void main(String s[]){
        int n=5;
        print(n,"");
    }

    private static void print(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }


        print(n-1, ans+"H");
        print(n-1, ans+"T");
    }
}
