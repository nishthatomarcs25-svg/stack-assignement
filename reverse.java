import java.util.*;

public class reverse {
    public static void main(String[] args) {

        String str = "HELLO";

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }

        String ans = "";

        while(!st.isEmpty()) {
            ans = ans + st.pop();
        }

        System.out.println(ans);
    }
}
