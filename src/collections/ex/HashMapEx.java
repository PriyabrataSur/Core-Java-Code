package collections.ex;

import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer , Integer> hm = new HashMap<>();        //----(1)
        HashMap<Integer , Integer> hm1 = new HashMap<>(20);             //----(2)
        HashMap<Integer , Integer> hm2 = new HashMap<>(20,.6f);         //----(3)
        HashMap<Integer , Integer> hm3 = new HashMap<>(hm);         //----(4)
        hm.put(1,20);
        hm.put(2,30);
        hm.put(3,30);
        hm.put(4,40);

        hm2.put(1,11);
        hm2.put(2,22);

        System.out.println(hm);
        System.out.println(hm3);
        System.out.println(hm.get(2));
        hm.remove(1);
        System.out.println(hm);



        Integer []ar ={1,2,3,4,1,3,5,1,3,3,8,9,3,5,3,8};
        HashMap<Integer,Integer> CountVal =new HashMap<>();
        for(int i = 0 ; i< ar.length ;i++) {
            if (ar[i] == 3) {
                if (CountVal.containsKey(ar[i])) {
                    Integer val = CountVal.get(ar[i]);
                    val++;
                    CountVal.put(ar[i], val);
                } else {
                    CountVal.put(ar[i], 1);
                }
            }
        }
        System.out.println(CountVal);
        System.out.println(CountVal.get(3));
    }
}
