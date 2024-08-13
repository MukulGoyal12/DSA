package Recursion;

public class LC17 {
    static String[] arr={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static void main(String s[]){
        String digits="23";
        dial(digits,arr,"");
    }

    public static void dial(String digits, String[] arr, String ans){
        if(digits.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=digits.charAt(0);
        String ques= arr[(ch-48)-1];

        for(int i=0;i<ques.length();i++){
            dial(digits.substring(1),arr,ans+ques.charAt(i));
        }
    }
}