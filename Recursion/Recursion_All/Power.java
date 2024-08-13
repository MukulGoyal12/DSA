package Recursion;

public class Power {
    public static void main(String s[]){
        int a=2,b=10;
        System.out.print(pov(a,b));
    }

    public static int pov(int x,int y){
        if(y==0) return 1;
        if(y==1) return x;

        int ans= pov(x,y/2);

        if(y%2==0) return ans*ans;
        else return x*ans*ans;
    }
}
