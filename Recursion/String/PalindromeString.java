package Recursion.String;

public class PalindromeString {
    public static void main(String s[]){
        String str = "abbccbba";
        System.out.println(pal(str,0,str.length()-1));
    }

    public static boolean pal(String str,int i,int j){
        if(i>j) return true;

        if(str.charAt(i)==str.charAt(j)) return pal(str,i+1,j-1);
        else return false;
    }
}
