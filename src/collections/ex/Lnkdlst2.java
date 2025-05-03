package collections.ex;

import java.util.LinkedList;
import java.util.ListIterator;

public class Lnkdlst2 {
    public static void main(String[] args) {
        LinkedList<String>fruit = new LinkedList<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Cherry");
        fruit.add("Date");
        System.out.println(fruit);
        fruit.add(1,"Blueberry");
        System.out.println(fruit);
        fruit.remove("Cherry");
        System.out.println(fruit);
        System.out.println("....................");
        System.out.println(fruit.getFirst());
        System.out.println(fruit.getLast());
        System.out.println("............................");

        ListIterator<String> l = fruit.listIterator();
        while (l.hasNext()){
            System.out.println(l.hasNext());
            String i =l.next();
            System.out.println(i);
            System.out.println("..."+l.hasNext());
        }

    }
}
