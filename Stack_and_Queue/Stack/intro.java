//LIFO and FILO is used

package Stack_and_Queue.Stack;

import java.util.*;

public class intro {

    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(34);
        stack.push(35);
        stack.push(2);
        stack.push(9);
        stack.push(18);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }


}
