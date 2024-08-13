package Stack_and_Queue.Stack;

import java.util.*;

public class StackMain {

    public static void main(String[] args) throws Exception {

        CustomStack stack = new CustomStack(5);

        stack.push(34);
        stack.push(35);
        stack.push(2);
        stack.push(9);
        stack.push(18);
        stack.push(20); //Do not add 20 because size is fix and give us stack si full
                            //but in case dynamic stack it make arrya of double size and add

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());



//        DynamicStack stack = new DynamicStack(5);
//
//        stack.push(34);
//        stack.push(35);
//        stack.push(2);
//        stack.push(9);
//        stack.push(18);
//        stack.push(20);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

    }
}
