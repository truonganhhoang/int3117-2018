/**
 * Created by MyPC on 06/10/2016.
 */
package oop.util;

import java.util.EmptyStackException;

public class Stack {
    private int Size = 0;
    private Node head = null;

    public Stack() {}

    public void push(String data) {
        ++Size;
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    public String pop() {
        if (Size == 0) {
            throw new EmptyStackException();
        }

        String data = head.data;
        head = head.next;

        --Size;
        return(data);
    }

    public String top() {
        return (head.data);
    }

    public boolean isEmpty() {
        return (Size == 0);
    }

    private static class Node {
        String data;
        Node next = null;

        private Node(String data) {
            this.data = data;
        }
    }
}
