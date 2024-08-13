package CollectionFramework;
import java.util.*;

//Key -> Value pairs
//keys are always unique

public class MapInterface {
    public static void main(String[] args) {
        HashMap<Integer,String> mp= new HashMap<>();  //Unordered
        mp.put(3,"Aman");
        mp.put(1,"Rohan");
        mp.put(2,"Riya");
        mp.put(1,"Prasad");  //Rohan se hatkr Prasad aa gya(override)
        mp.putIfAbsent(1,"rahul");
        System.out.println(mp);
        System.out.println(mp.get(2));
        System.out.println(mp.containsKey(4));
        System.out.println(mp.containsValue("Riya"));
        System.out.println(mp.entrySet());
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        //Iterating over keys
        for(Integer i: mp.keySet()){
            System.out.println(i);
        }
        //Iterating over values
        for(String i: mp.values()){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Iterating over Key Value Mapping");
        for(var e: mp.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
            System.out.println(e.getClass());
            System.out.println();
        }

        LinkedHashMap<Integer,String> lmp= new LinkedHashMap<>();  //Ordered
        TreeMap<Integer,String> tmp= new TreeMap<>();  //Sorted

    }
}
