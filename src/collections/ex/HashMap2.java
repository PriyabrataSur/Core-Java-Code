package collections.ex;

import java.util.HashMap;

public class HashMap2 {
    public static void main(String[] args) {
        String name = "priyabrata";
        HashMap<Character, Integer> CountA = new HashMap<>();
        for (int i = 0 ; i<name.length(); i++)
        {
            if (CountA.containsKey(name.charAt(i))) {
                Integer val = CountA.get(name.charAt(i));
                val++;
                CountA.put(name.charAt(i), val);
            } else {
                CountA.put(name.charAt(i), 1);
            }
        }
        System.out.println(CountA);
        System.out.println(CountA.get('a'));
    }
}
