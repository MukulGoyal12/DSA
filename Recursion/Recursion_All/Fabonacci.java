package Recursion;

public class Fabonacci {
    public static void main(String s[]){
        System.out.println(fibonacci(5));
    }

    public static int fibonacci(int n){
        if(n==0 || n==1) return n;

        return fibonacci(n-1)+fibonacci(n-2);
    }
}