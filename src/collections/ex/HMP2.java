package collections.ex;

import java.util.HashMap;

public class HMP2 {
    public static void main(String[] args) {
        HashMap<Character,Integer> CntA = new HashMap<>();
        String s = "priyabrata";
        for (int i = 0 ; i< s.length() ; i++){
            if (s.charAt(i) == 'a') {
                if (CntA.containsKey(s.charAt(i))) {
                    Integer val = CntA.get(s.charAt(i));
                    val++;
                    CntA.put(s.charAt(i), val);
                } else {
                    CntA.put(s.charAt(i), 1);
                }
            }
        }

        System.out.println(CntA);

    }
}
