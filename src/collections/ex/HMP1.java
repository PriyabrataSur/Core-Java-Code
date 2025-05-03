package collections.ex;

import java.util.HashMap;

public class HMP1 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int[] arr = {1,2,3,4,1,5,6,2,3,2,2,1,2,7,3} ;
        for (int i = 0 ; i< arr.length ; i++){
            if (arr[i] == 2) {
                if (h.containsKey(arr[i])) {
                    Integer val = h.get(arr[i]);
                    val++;
                    h.put(arr[i], val);
                } else {
                    h.put(arr[i], 1);
                }
            }
        }
        System.out.println(h);
        System.out.println(h.get(2));
    }
}
