package Recursion;

import java.util.*;

public class SayDigit {
    public static void main(String s[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
        digit(n,arr);
    }

    public static void digit(int n, String[] str){
        if(n==0) return;

        int ans=n%10;
        digit(n/10,str);
        System.out.print(str[ans] + " ");
    }
}
