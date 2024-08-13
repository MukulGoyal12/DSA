package CollectionFramework;

import java.util.*;

//Set: All Unique Elements
//HashSet has only unique values store, values are unordered

public class Setinterface {

    public static void main(String[] args) {
//        HashSet<Integer> st= new HashSet<>();
//        st.add(1);
//        st.add(2);
//        st.add(3);
//        st.add(48);
//        st.add(15);
//        st.add(10);
//        System.out.println(st);  //order is random khi bhi kch bhi aa skta hai.
//        st.add(1);
//        st.add(1);
//        st.add(1);
//        System.out.println(st);
//        st.remove(2);
//        System.out.println(st.contains(2));
//        System.out.println(st.contains(3));
//        System.out.println(st);
//        System.out.println(st.size());

//        LinkedHashSet<Integer> st= new LinkedHashSet<>();    //order hoga bs
//        st.add(1);
//        st.add(2);
//        st.add(3);
//        st.add(48);
//        st.add(15);
//        st.add(10);
//        System.out.println(st);
//        st.add(1);
//        st.add(1);
//        st.add(1);
//        System.out.println(st);
//        st.remove(2);
//        System.out.println(st.contains(2));
//        System.out.println(st.contains(3));
//        System.out.println(st);
//        System.out.println(st.size());

        TreeSet<Integer> st= new TreeSet<>();   // Always preserve the sorted order.
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(48);
        st.add(15);
        st.add(10);
        System.out.println(st);
        st.add(1);
        st.add(1);
        st.add(1);
        System.out.println(st);
        st.remove(2);
        System.out.println(st.contains(2));
        System.out.println(st.contains(3));
        System.out.println(st);
        System.out.println(st.size());


    }
}
