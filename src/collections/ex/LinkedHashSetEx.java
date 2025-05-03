package collections.ex;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lh = new LinkedHashSet<>();           // ----(1)
        lh.add(10);
        lh.add(20);
        lh.add(30);
        lh.add(40);
        lh.add(50);
        System.out.println(lh);

        lh.add(10);             // Duplicate value not allowed
        System.out.println(lh);

        LinkedHashSet<Integer> lh1 = new LinkedHashSet<>(30);        // ----(2)
        LinkedHashSet<Integer> lh2 = new LinkedHashSet<>(20, .6f);         // ----(3)
        LinkedHashSet<Integer> lh3 = new LinkedHashSet<>(lh);                    // ----(4)

    }
}
