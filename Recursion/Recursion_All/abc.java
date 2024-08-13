package Recursion;

public class abc {
    public static void main(String s[]){
        String str= "abc";
        int n= str.length();
        permutation(n,str,"");
    }

    public static void permutation(int n, String ans, String str){
        if(n==0){
            System.out.println(str);
            return;
        }

        for(int i=0;i<ans.length();i++){
            permutation(n-1,ans.substring(0,i)+ans.substring(i+1),str+ans.charAt(i));
        }
    }
}