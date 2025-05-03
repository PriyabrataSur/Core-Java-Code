package collections.ex;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Stack5 {
    public static void main(String[] args) {
        Stack<Integer> v = new Stack<>();
        v.push(10);
        v.push(20);
        v.push(30);
        v.push(40);
        v.push(20);
        System.out.println(v);

        //System.out.println(v.pop());
//        ListIterator<Integer> li = v.listIterator();
//        while (li.hasNext())
//        {
//            Integer i = li.next();
//            System.out.println(i);
//        }

//        Enumeration<Integer> e = v.elements();
//        while (e.hasMoreElements()){
//            Integer data = e.nextElement();
//            System.out.println(data);
//        }

        Iterator<Integer> i = v.iterator();
        while (i.hasNext()){
            Integer data = i.next();
            System.out.println(data);
        }
    }
}
