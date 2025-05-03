package collections.ex;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapEx {
    public static void main(String[] args) {
        SortedMap<Integer , Integer> sm = new TreeMap<>();
        sm.put(1,10);
        sm.put(2,20);
        sm.put(3,30);
        sm.put(4,40);
        sm.put(5,50);
        System.out.println(sm);

        System.out.println(sm.firstKey());
        System.out.println(sm.firstEntry());
        System.out.println(sm.lastKey());
        System.out.println(sm.lastEntry());
        System.out.println(sm.entrySet());
        System.out.println(sm.headMap(4));
        System.out.println(sm.tailMap(3));
        System.out.println(sm.subMap(1, 4));
        System.out.println(sm.size());
        System.out.println(sm.containsKey(6));
        System.out.println(sm.containsValue(50));
        System.out.println(sm.comparator());
    }
}
