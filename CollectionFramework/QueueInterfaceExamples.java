package CollectionFramework;

import java.util.*;

public class QueueInterfaceExamples {

    static void QueueExamples(){
        LinkedList<Integer> q=  new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        System.out.println(q);
    }

    static void PriorityQueueExamples(){
        PriorityQueue<Integer> pq= new PriorityQueue<>();  //min PQ
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq);  //Sbse chota sbse phle add hoga(only in first case)
        System.out.println(pq.poll());
        System.out.println(pq);  // chota 7 hai to vo phle ho jeaga ab
        System.out.println();
        PriorityQueue<Integer> pq2= new PriorityQueue<>(Comparator.reverseOrder());  //max PQ
        pq2.add(5);
        pq2.add(7);
        pq2.add(10);
        System.out.println(pq2);  //Sbse bada sbse phle add hoga(only in first case)
        System.out.println(pq2.poll());
        System.out.println(pq2);  // bada 7 hai to vo phle ho jeaga ab
    }

    static void DequeExamples(){
        Deque<Integer> dq= new ArrayDeque<>();
        //addFirst, addLast , remove/poll , peek/element
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.addFirst(5);
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
    }

    public static void main(String[] args) {
        QueueInterfaceExamples lf= new QueueInterfaceExamples();
        lf.QueueExamples();
        System.out.println();
        lf.PriorityQueueExamples();
        System.out.println();
        lf.DequeExamples();
    }
}
