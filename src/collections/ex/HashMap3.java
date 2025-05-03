package collections.ex;

import java.util.HashMap;

public class HashMap3 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(1,1);
        hm.put(2,11);
        hm.put(3,111);
        hm.put(4,1111);
        System.out.println(hm);

        System.out.println(hm.get(1));
        System.out.println(hm.size());

    }
}
