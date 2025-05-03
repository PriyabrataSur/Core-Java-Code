package collections.ex;

import java.util.WeakHashMap;

class Person{
    public String toString(){
        return "Hello";
    }
    public void finalize(){
        System.out.println("Finalize Method Call");
    }
}

public class WeakHashMapEx {
    public static void main(String[] args) {
        WeakHashMap<Person , String> wh = new WeakHashMap<>();
        Person p = new Person();
        wh.put(p, "Priyabrata");
        System.out.println(wh);
        p= null;
        System.gc();
        System.out.println(wh);
    }
}
