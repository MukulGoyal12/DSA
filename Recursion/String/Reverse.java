package Recursion.String;
import java.util.*;

public class Reverse {
    public static void main(String s[]){
        String str = "mukul";
        System.out.println(rev(str, 0, str.length()-1));
    }

    public static String swap(char[] chars, int x, int y){
        char temp = chars[x];
        chars[x] = chars[y];
        chars[y] = temp;
        return new String(chars);
    }

    public static String rev(String s, int i, int j){
        if(i >= j) {
            return s;
        }

        char[] chars = s.toCharArray();
        s = swap(chars, i, j);

        // Continue the reversal
        return rev(s, i + 1, j - 1);
    }
}
