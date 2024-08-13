//Ques: print all elements of queue using add, remove, peek, size, and extra stack

package Stack_and_Queue.Queue.Questions;
import java.util.*;

public class printAll {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        Queue<Integer> helper= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        while(q.size()>0){
            int rem=q.remove();
            System.out.println(rem);
            helper.add(rem);
        }
        while(helper.size()>0){
            q.add(helper.remove());
        }
        System.out.println(q);

    }
}
