package collections.ex;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<Integer> vc = new Vector<>();                        //----  (1)
        Vector<Integer> vc1 = new Vector<>();                        // ---  (2)
        Vector<Integer> vc2  = new Vector<>(20);         //-- (3)
        vc.add(10);
        vc.add(20);
        vc.add(30);
        System.out.println(vc);
    }
}
