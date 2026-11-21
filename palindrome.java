import java.util.*;

public class palindrome {
    public static void main(String[] args) {

        String str = "MADAM";

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }

        String rev = "";

        while(!st.isEmpty()) {
            rev = rev + st.pop();
        }

        if(str.equals(rev)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
