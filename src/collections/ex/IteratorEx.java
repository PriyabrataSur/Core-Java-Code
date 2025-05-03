package collections.ex;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        System.out.println(al);

        Iterator<Integer> num = al.iterator();
        while (num.hasNext()){
            Integer data = num.next();
            if (data == 30) num.remove();
        }
        System.out.println(al);
    }
}
