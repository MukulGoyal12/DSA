package Recursion.Assignment;

import java.util.*;
public class OddEven {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        printNum(n);
    }

    public static void printNum(int n){
        if(n==0) return;

        if(n%2!=0) System.out.println(n);
        printNum(n-1);
        if(n%2==0) System.out.println(n);
    }
}
