package Recursion;

public class permutation {
    public static void main(String s[]){
        String str="abc";
//        print(str,"");
        permute("",str);
    }

    private static void print(String s,String ans){
        if(ans.length()==3){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<s.length();i++){
            boolean flag=false;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j))
                    flag=true;
            }

            if(flag==false)
                print(s.substring(0,1)+s.substring(i+1), ans+s.charAt(i));
        }
    }

    private static void permute(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        for (int i = 0; i < up.length(); i++) {
            char ch=up.charAt(i);
            permute(p+ch,up.substring(0,i)+up.substring(i+1));
        }
    }
}
