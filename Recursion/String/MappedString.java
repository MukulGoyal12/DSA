package Recursion.String;

import java.util.*;

public class MappedString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        mapped("",str);
    }

    public static void mapped(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);
        mapped(p+(char)(ch-'1'+'a'),up.substring(1));

        if(up.length()>=2){
            int t=Integer.parseInt(up.substring(0,2));
            if(t<=26){
                char alpha = (char)(t-1+'a');
                mapped(p+alpha,up.substring(2));
            }
        }
    }

}
