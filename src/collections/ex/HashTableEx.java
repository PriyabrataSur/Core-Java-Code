package collections.ex;

import java.util.Hashtable;

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable<Integer,Integer> ht = new Hashtable<>() ;             //---1
        ht.put(1,10);
        ht.put(2,20);
        ht.put(3,30);
        ht.put(4,40);
        ht.put(5,50);
        ht.put(6,60);
        System.out.println(ht);
        System.out.println(ht.get(2));

    }
}
