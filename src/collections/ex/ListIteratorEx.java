package collections.ex;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);
        System.out.println(al);

//        ListIterator<Integer> li = al.listIterator(al.size());
//        while (li.hasPrevious()){
//            Integer i = li.previous();
//            if (i == 30) li.set(31);
//            if (i == 20) li.add(25);
//            if (i == 50) li.remove();
////            System.out.println(li.previousIndex());         //not index of data, it is previous index of data
//            System.out.println(i);
//        }
//        System.out.println(al);

        ListIterator<Integer> l = al.listIterator();
        while (l.hasNext()) {
            Integer data = l.next();
            if (data == 30) l.set(31);
            if (data == 20) l.add(25);
            if (data == 50) l.remove();
            System.out.println(l.nextIndex());
            System.out.println(data);

        }
    }
}
