package collections.ex;

import java.util.ArrayList;

public class Arrlst2 {
    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        list.add(2,25);
        list.remove(4);
        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println("Size of the list: "+list.size());
        System.out.println("Elements of the list: ");
        list.forEach(i -> System.out.println(i));
    }

}
