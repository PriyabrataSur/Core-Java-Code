package collections.ex;

import java.util.Collections;
import java.util.LinkedList;

public class Lnkdlst4 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

//        Collections.reverse(list);
//        System.out.println(list);

        LinkedList<Integer> l = new LinkedList<>();
        int n = list.size();
        System.out.println("Size: "+n);
        for (int i = 1 ; i<=n ; i++)
        {
            l.add(list.get(n-i));
        }
        System.out.println(l);
    }
}
