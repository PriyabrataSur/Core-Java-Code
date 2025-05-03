package collections.ex;

import java.util.LinkedHashSet;

public class LnkdHshSet2 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lh = new LinkedHashSet<>();
        lh.add(10);
        lh.add(20);
        lh.add(30);
        lh.add(40);
        System.out.println(lh);

        lh.addFirst(5);
        System.out.println(lh);
        lh.removeLast();
        System.out.println(lh);
        lh.removeFirst();
        System.out.println(lh.isEmpty());
        System.out.println(lh.contains(20));
        System.out.println(lh.size());
        lh.clear();
        System.out.println(lh);
    }
}
