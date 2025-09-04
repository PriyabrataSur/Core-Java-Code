package StringEx;

public class StringExample {

    public static void main(String[] args) {
        // in java string is immutable
        /*
         * By string literal
         * by new keyword
         * using char array convert into string
         * */

        String s = "Hello Java"; // string literal
        String s1 = "Hello Java";
        String s2 = new String("Hello Java");
//        s = s+"Hii";
        System.out.println(s == s2); // == check address
        System.out.println(s.equals(s2)); // .equals check instance also

        char[] a = {'a', 'b', 'c'};
        String str = new String(a);
        System.out.println(str);

    }
}

