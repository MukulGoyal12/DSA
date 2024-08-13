package Stack_and_Queue.Queue.Questions;

import java.util.*;

public class ReverseKElements {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int k=3;
        ReverseK(q,k);
    }

    public static void ReverseK(Queue<Integer> q , int k){
        int n=q.size();
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<k;i++){
            st.add(q.remove());
        }
        for(int i=0;i<k;i++){
            q.add(st.pop());
        }
        for(int i=0;i<n-k;i++){
            q.add(q.remove());
        }
        System.out.println(q);
    }
}
