package collections.ex;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationEx {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        System.out.println(v);

        Enumeration<Integer> e = v.elements();
        while (e.hasMoreElements()){
            Integer data = e.nextElement();
            System.out.println(data);
        }
    }
}
