package collections.ex;

import java.util.Collections;
import java.util.LinkedList;
public class Lnkdlst3 {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);
        list1.add(9);
        System.out.println(list1);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);
        System.out.println(list2);

        LinkedList<Integer>mrglist = new LinkedList<>(list1);
        mrglist.addAll(list2);
        System.out.println(mrglist);
        Collections.sort(mrglist);
        System.out.println(mrglist);
    }
}
