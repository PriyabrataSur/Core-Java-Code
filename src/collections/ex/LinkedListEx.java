package collections.ex;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();  //........  1
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);
        Integer getE = list.get(2);         //System.out.println(list.get(2));
        System.out.println(getE);
            System.out.println(list.getFirst());
            System.out.println(list.getLast());
        list.addLast(100);
        System.out.println(list);
        list.addFirst(26);
        System.out.println(list);
                    list.removeFirst();
                    list.removeLast();
        System.out.println(list);
        list.remove();
        System.out.println(list);

        LinkedList<Integer> l1 = new LinkedList<>(list);        //......    2
        System.out.println(l1);
    }


}
