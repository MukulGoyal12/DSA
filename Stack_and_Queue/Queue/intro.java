//FIFO and LILO is used.

package Stack_and_Queue.Queue;

import java.util.*;

public class intro {
    public static void main(String[] args) {
        Queue<Integer> queue= new LinkedList<>();
        queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(19);
        queue.add(1);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
