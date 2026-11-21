import java.util.*;

public class stackreverse {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        Stack<Integer> temp = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);

        while(!st.isEmpty()) {
            temp.push(st.pop());
        }

        System.out.println("Reversed Stack: " + temp);
    }
}
