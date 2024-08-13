package Stack_and_Queue.Queue.Questions;

import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q);
        while(q.size()>0){
            int x=q.remove();
            st.push(x);
        }
        while(st.size()>0){
            int x=st.pop();
            q.add(x);
        }
        System.out.println(q);

    }
}
