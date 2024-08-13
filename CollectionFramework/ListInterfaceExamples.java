package CollectionFramework;
import com.sun.jdi.connect.spi.TransportService;

import java.util.*;

public class ListInterfaceExamples {

    static void ArrayListExamples(){
        ArrayList<Integer> l= new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);  // 1 2 3
        System.out.println(l.get(1));   // 1-based indexing => 2
        l.set(1,6);
        System.out.println(l);
        System.out.println(l.contains(10));
    }

    static void LinkedListExamples(){
        LinkedList<Integer> l= new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);  // 1 2 3
        System.out.println(l.get(1));   // 1-based indexing => 2
        l.set(1,6);
        System.out.println(l);
        System.out.println(l.contains(10));
    }

    static void StackExamples(){
        Stack<String> st=  new Stack<>();
        st.push("pw");
        st.push("Skills");
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
        System.out.println(st.size());
    }

    public static void main(String[] args) {
        ListInterfaceExamples lf= new ListInterfaceExamples();
        lf.ArrayListExamples();
        System.out.println();
        lf.LinkedListExamples();
        System.out.println();
        lf.StackExamples();
        System.out.println();
    }
}
