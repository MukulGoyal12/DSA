package Recursion.Recursion_All;
import java.util.*;

public class keypad_beta2 {

    public static void main(String[] args) {
        String[] keypad = {"",".+@$","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String[] search = {"kartik","sneha","deepak","arnav","shiksha","palak","utkarsh","divyam","vidhi","sparsh","akku"};
        String num = "34";
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> searched = new ArrayList<>();
        find(keypad,num,"",list);
        searching(list,searched,search);

        for(int i=0;i<searched.size();i++)
            System.out.println(searched.get(i));
    }

    public static void find(String[] keypad,String num, String ans, ArrayList<String> list) {
        if (num.length() == 0) {
            list.add(ans);
            return;
        }

        char ch=num.charAt(0);
        int val = ch-'0';
        String key = keypad[val];

        for(int i=0;i<key.length();i++)
            find(keypad,num.substring(1),ans+key.charAt(i) ,list);
    }

    public static void searching(ArrayList<String> list, ArrayList<String> searched,String[] search){
        for(String sub:list){
            for(String names : search){
                if(names.contains(sub)){
                    searched.add(names);
                }
            }
        }
    }

}
