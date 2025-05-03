package collections.ex;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Integer , Integer> lhm = new LinkedHashMap<>();        //----(1)
        LinkedHashMap<Integer , Integer> lhm1 = new LinkedHashMap<>(20);             //----(2)
        LinkedHashMap<Integer , Integer> lhm2 = new LinkedHashMap<>(20,.6f);         //----(3)
        LinkedHashMap<Integer , Integer> lhm3 = new LinkedHashMap<>(lhm);         //----(4)
        lhm.put(1,20);
        lhm.put(2,30);
        lhm.put(3,40);
        System.out.println(lhm);
        System.out.println(lhm3);
        lhm.get(2);
        lhm.remove(1);
        System.out.println(lhm);
    }
}
