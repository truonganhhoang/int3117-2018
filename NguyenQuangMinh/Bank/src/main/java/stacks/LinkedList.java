package stacks;


public class LinkedList implements StackOfString {
    public class Node {
        int element;
        Node next;


        public Node(int element, Node next) {
            this.element = element;
            this.next = next;
        }

        public Node(int element) {
            this(element, null);
        }
    }

    Node top;
    int length = 0;

    boolean empty() {
        return length == 0;
    }

    @Override
    public void push(int obj) {
        Node newNode = new Node(obj);

        if (this.empty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        ++length;
    }

    @Override
    public int pop() {
        if(!this.empty()){
            Node temp = top;
            top = top.next;
            --length;
            return temp.element;
        }
        return 0;
    }
}
