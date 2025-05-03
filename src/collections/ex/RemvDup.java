package collections.ex;
import java.util.ArrayList;
import java.util.HashSet;
//import java.util.ListIterator;

public class RemvDup {
    public static void main(String[] args) {
        int count=0;
        ArrayList<String> arlist1 = new ArrayList<>();
        ArrayList<String> newList = new ArrayList<>();
        arlist1.add("Hi");
        arlist1.add("Hello");
        arlist1.add("Bye");
        arlist1.add("Hi");
        System.out.println(arlist1);
//        for (int i = 0; i<arlist1.size(); i++)
//        {
//            for (int j = 0; j<arlist1.size(); j++)
//            {
//                if(arlist1.get(i) == arlist1.get(i+j+1))
//                {
//                    count++;
//                }
//            }
//            if(count==0) {
//                newList.add(arlist1.get(i));
//                count = 0;
//            }
//        }
//        System.out.println(arlist1);
//        ListIterator<String> l = arlist1.listIterator();
//        while (l.hasNext()){
//            String i = l.next();
//            while (l.hasNext()) {
//                String j = l.next();
//                if (i == j) {
//                    arlist1.remove(j);
//                }
//            }
//        }
//        System.out.println(arlist1);
//        System.out.println(newList);
        HashSet<String> hs = new HashSet<>(arlist1);
        System.out.println(hs);

    }
}
