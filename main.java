class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class Stack {
    Node top;
    int count = 0;

    // PUSH
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        count++;
    }

    // POP
    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int removed = top.data;
        top = top.next;
        count--;

        return removed;
    }

    // PEEK
    int peek() {
        if (top == null) {
            System.out.println("Stack empty");
            return -1;
        }

        return top.data;
    }

    // isEmpty
    boolean isEmpty() {
        return top == null;
    }

    // SIZE
    int size() {
        return count;
    }

    // DISPLAY
    void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }
}

public class main {
    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Stack elements:");
        st.display();

        System.out.println("Top: " + st.peek());

        System.out.println("Removed: " + st.pop());

        System.out.println("Size: " + st.size());

        System.out.println("Is Empty: " + st.isEmpty());

        st.display();
    }
}
