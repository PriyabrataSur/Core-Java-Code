package collections.ex;

import java.util.HashMap;

public class HMP3 {
    public static void main(String[] args) {
        HashMap<Character,Integer> HghFr = new HashMap<>();
        String st = "kanailalvidyamandir";
        for (int i = 0 ; i< st.length() ; i++){
            if (HghFr.containsKey(st.charAt(i))) {
                Integer val = HghFr.get(st.charAt(i));
                val++;
                HghFr.put(st.charAt(i), val);
            } else {
                HghFr.put(st.charAt(i), 1);
            }
        }
        System.out.println("hm"+HghFr);

        Character hf = st.charAt(0);
        for(Character ch: HghFr.keySet()){
            System.out.println(ch);
            if(HghFr.get(hf)<HghFr.get(ch)){
                hf = ch;
            }
        }

        System.out.println("HFC="+hf);

    }
}
