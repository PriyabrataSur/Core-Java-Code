package collections.ex;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        tm.put(1,11);
        tm.put(2,22);
        tm.put(3,33);
        tm.put(4,44);
        tm.put(5,55);
        System.out.println(tm);

        System.out.println(tm.get(3));
        System.out.println(tm.firstKey());
        System.out.println(tm.lastKey());
        System.out.println(tm.headMap(4));
        System.out.println(tm.tailMap(3));
        System.out.println(tm.subMap(1, 4));
        System.out.println(tm.size());
        System.out.println(tm.containsKey(6));
        System.out.println(tm.containsValue(50));
        System.out.println(tm.comparator());
    }
}
