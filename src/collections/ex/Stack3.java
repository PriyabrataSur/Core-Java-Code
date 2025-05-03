package collections.ex;

import java.util.Stack;

public class Stack3 {
    public static void main(String[] args) {
        String s = "Hello";
        Stack<Character> st = new Stack<>();
        for (int i = 0 ; i<s.length(); i++)
        {
            st.push(s.charAt(i));
        }
        System.out.println(st);

        String p = "" ;             // Empty string

        while(!st.isEmpty()){
            p+=st.pop();            // This is not the right choice , right choice is String-Builder
        }
        System.out.println(p);
    }
}
