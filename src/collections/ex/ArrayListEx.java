package collections.ex;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListEx {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();        // ----- (1)
        list.add(10);
//        list.add("hjbvg");  //error
        list.add(12);
        list.add(36);
        list.add(40);
        System.out.println(list);
//
//        ArrayList l1 = new ArrayList(6);                // --------(2)
//        list.add(56);
//        l1.add(21);
//        l1.add(9);
//        System.out.println(l1);

//        System.out.println("GET :"+list.get(2));
        list.set(1,30);
//        System.out.println(list);
        list.add(3,50);
        list.add(4,60);
//        System.out.println(list);
//        System.out.println("Index of 40 :"+list.indexOf(40));
//        list.add(2,20);
        System.out.println(list);


//        list.remove(2);
//        System.out.println(list);
//        System.out.println(list.isEmpty());
//        list.removeAll(list);
//        System.out.println(list);
//        System.out.println(list.isEmpty());



//        ArrayList<String> l = new ArrayList();              // --------- (3)
//        l.add("Ram");
//        l.add("Soumo");
//        l.add("Rajdeep");
//        System.out.println(l);
//        int size = l.size();
//        System.out.println("Size of the List is: "+size);
//        l.add(3,"Rahul");
//        System.out.println(l);
//
//        System.out.println("Size of the List is: "+l.size());
//        System.out.println(l.isEmpty());
//        System.out.println(l.get(0));
//        System.out.println(l.get(1));
//        System.out.println(l.get(2));
//        System.out.println(l.get(3));

//        for (int i = 0; i<l.size(); i++)
//        {
//            System.out.println(l.get(i));                     //--- (1)
//        }

//        for (Integer num:list)
//        {
//            System.out.println(num);                             //--- (2)
//        }
//        System.out.println("Hiiiiiiiiiiiiiii");
//
        list.forEach(element -> System.out.println(element));           //---(3)

//        ListIterator<Integer> l3 = list.listIterator();
//        while (l3.hasNext()){
//            Integer i = l3.next();                                    //--- (4)
//            System.out.println(i);
//        }



//        Object[] st = list.toArray();
//        for(Object i : st){                                       //--- (5)
//            System.out.println(i);
//        }
    }
}
