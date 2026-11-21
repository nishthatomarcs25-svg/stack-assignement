import java.util.*;

public class middle {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        Stack<Integer> temp = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        int n = st.size();

        for(int i = 0; i < n/2; i++) {
            temp.push(st.pop());
        }

        System.out.println("Middle Element: " + st.peek());

        while(!temp.isEmpty()) {
            st.push(temp.pop());
        }
    }
}
