package Stack_and_Queue.Queue;

import java.util.*;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq= new LinkedList<>();
        //addFirst, addLast , remove/poll , peek/element
//        dq.addLast(1);
//        dq.addLast(2);
//        dq.addLast(3);
//        dq.addLast(4);
//        dq.addFirst(5);
//        System.out.println(dq);
//        dq.removeFirst();
//        System.out.println(dq);
//        dq.removeLast();
//        System.out.println(dq);
//        System.out.println(dq.getFirst());
//        System.out.println(dq.getLast());

//        dq.addLast(1);
//        dq.addLast(2);
//        dq.addLast(3);
//        dq.addLast(4);
//        dq.add(5);   // add is simply addLast
//        System.out.println(dq);
//        System.out.println(dq.getClass());
//        dq.remove();    // remove first by default
//        System.out.println(dq);
//        dq.removeAll(dq);
//        System.out.println(dq);

        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);
        dq.removeFirstOccurrence(2);
        System.out.println(dq);
        dq.removeLastOccurrence(3);
        System.out.println(dq);

    }
}
