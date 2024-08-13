package Recursion.Assignment;
import java.util.*;

public class Recursion_Twin {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        System.out.println(twin(str,0,2,0));
    }

    public static int twin(String p,int i, int j, int count){
        if(j>=p.length()) return count;

        if(p.charAt(i)==p.charAt(j) && p.charAt((i+j)/2)!=p.charAt(i))
            count++;
        return twin(p,i+1,j+1,count);
    }
}
