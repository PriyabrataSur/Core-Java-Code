package StringEx;

public class StringEx3 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Priyabrata");
        s.append(" Sur");
        System.out.println(s);

        String s2 = "hi";
        StringBuilder st = new StringBuilder(s2);
        //String n = st.reverse();

        //System.out.println(s.reverse());

        //System.out.println(s.replace(0, 5, " Tech "));
        //System.out.println(s.insert(8," Soumo "));
        //System.out.println(s.insert(0,89.95));

        System.out.println(s.capacity());

        StringBuilder s1 = new StringBuilder();
        System.out.println(s1.capacity());
    }
}
