package Recursion;

public class HeadTail2 {
    public static void co(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        if(ans.length()>0){
            if(ans.charAt(ans.length()-1)!='H'){
                co(n-1,ans+'H');

            }
            else {
                co(n-1,ans+'T');

            }

        }
        else{
            co(n-1,ans+'H');
            co(n-1,ans+'T');
        }


    }
    public static void main(String [] args) {
        int n = 3;
        String ans = "";
        co(3, ans);
    }


}
