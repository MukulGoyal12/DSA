package Stack_and_Queue.Stack.Questions;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }

    public static void reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }

        int k=st.pop();
        reverse(st);
        pushBottom(k,st);
    }

    public static void pushBottom(int k, Stack<Integer> st){
        if(st.isEmpty()){
            st.push(k);
            return;
        }

        int data=st.pop();
        pushBottom(k,st);
        st.push(data);
    }
}
