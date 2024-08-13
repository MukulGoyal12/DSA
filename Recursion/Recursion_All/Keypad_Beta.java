package Recursion_All;
import java .util.*;

public class Keypad_Beta {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] keypad = {" ",".+@$","abc", "def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String[] search = {"kartik","sneha","deepak","arnav","shikha","palak","utkarsh","divyam","vidhi","sparsh","akku"};
        String str= sc.nextLine();
        ArrayList<String> result = new ArrayList<>();
        keypad(str,keypad,search,result);

        for(int i=0;i< search.length;i++){
            for(String ele:result){
                if(search[i].contains(ele)) System.out.println(search[i]);
            }
        }
    }

    public static void keypad( String up, String[] key, String[] search,ArrayList<String> result){

        char ch=up.charAt(0);
        int keyIndex = Character.getNumericValue(ch);
        String keyChars = key[keyIndex];

        if (up.length() == 1) return;

        char ch2=up.charAt(1);
        int keyIndex2 = Character.getNumericValue(ch2);
        String keyChars2 = key[keyIndex2];

        for (int i = 0; i < keyChars.length(); i++) {
            for (int j = 0; j < keyChars2.length(); j++) {
                result.add("" + keyChars.charAt(i) + keyChars2.charAt(j));
            }
        }

    }

}
