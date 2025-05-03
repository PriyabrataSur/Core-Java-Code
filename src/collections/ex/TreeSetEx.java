package collections.ex;

import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(5);
        t.add(4);
        System.out.println(t);

        System.out.println(t.first());
        System.out.println(t.last());
        System.out.println(t.headSet(5));
        System.out.println(t.tailSet(3));
        System.out.println(t.subSet(2, 4));
        System.out.println(t.size());
        System.out.println(t.isEmpty());
        System.out.println(t.comparator());
    }
}
