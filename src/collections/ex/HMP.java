package collections.ex;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class HMP {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(1,11);
        hm.put(2,111);
        hm.put(3,1111);
        System.out.println(hm);

        System.out.println(hm.size());
        System.out.println(hm.get(2));
        hm.remove(2);
        System.out.println(hm);

        System.out.println("-----------------------------------------------------");

        LinkedHashMap<Integer , Integer> lhm = new LinkedHashMap<>();
        lhm.put(1,10);
        lhm.put(2,20);
        lhm.put(3,30);
        lhm.put(4,40);
        System.out.println(lhm);

        System.out.println(lhm.get(3));
        lhm.remove(2,35);
        System.out.println(lhm);
        lhm.remove(3);
        System.out.println(lhm);

        System.out.println("-----------------------------------------------------");

        SortedMap<Integer,Integer> s = new TreeMap<>();
        s.put(1,1);
        s.put(2,2);
        s.put(3,3);
        s.put(4,4);
        s.put(5,5);
        System.out.println(s);

        System.out.println(s.firstKey());
        System.out.println(s.lastKey());
        System.out.println(s.get(3));
        System.out.println(s.headMap(4));
        System.out.println(s.tailMap(2));
        System.out.println(s.comparator());

        System.out.println("-----------------------------------------------------");

        TreeMap<Integer,Integer> tm = new TreeMap<>();
        tm.put(1,50);
        tm.put(2,40);
        tm.put(3,30);
        tm.put(4,20);
        tm.put(5,10);
        System.out.println(tm);

        System.out.println(tm.firstKey());
        System.out.println(tm.lastKey());
        System.out.println(tm.get(5));
        System.out.println(tm.headMap(4));
        System.out.println(tm.tailMap(2));
        System.out.println(tm.comparator());
    }
}
