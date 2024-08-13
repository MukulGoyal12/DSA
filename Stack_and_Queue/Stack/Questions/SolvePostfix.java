package Stack_and_Queue.Stack.Questions;

import java.util.Stack;

public class SolvePostfix {
    public static void main(String[] args) {
        String s= "953+4*6/-";
        int n=s.length();
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<n;i++){
            char ch= s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<= 57)
                st.push(ascii-48);
            else{
                int val2=st.pop();
                int val1=st.pop();
                if(ch=='+') st.push(val1+val2);
                if(ch=='-') st.push(val1-val2);
                if(ch=='*') st.push(val1*val2);
                if(ch=='/') st.push(val1/val2);

            }
        }
        System.out.println(st.peek());
    }
}
