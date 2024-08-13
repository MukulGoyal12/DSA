package Recursion.Assignment;

import java.util.*;

public class keypad {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String keys[]={"abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
        String num=sc.next();
        int count[]=new int[1];
        nokia(keys,num,"",count);
        System.out.println("\n"+count[0]);
    }

    public static void nokia(String[] keys,String num,String p,int[]count){
        if(num.length()==0){
            System.out.print(p+" ");
            count[0]++;
            return;
        }

        char ch=num.charAt(0);
        String letter=keys[Character.getNumericValue(ch)-1];
        for(int i=0;i<letter.length();i++){
            char first=letter.charAt(i);
            nokia(keys,num.substring(1),p+first,count);
        }
    }
}
