package collections.ex;

import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();               //----- (1)
        h.add(10);
        h.add(20);
        h.add(30);
        h.add(10);          // Duplicate values are not allowed
        h.add(0);
        h.add(null);
        h.add(null);
        System.out.println(h);

        HashSet<Integer> h1 = new HashSet<>(26);         // ----(2)
        HashSet<Integer> h3 = new HashSet<>(20,.50f);            //---(3)
        HashSet<Integer> h4 = new HashSet<>(h);             //-----(4)

        System.out.println(h.contains(20));
        h.remove(null);
        System.out.println(h.isEmpty());
        System.out.println("Size :"+h.size());
        System.out.println(h);

        h.clear();
        System.out.println(h);
    }
}
