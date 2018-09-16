/**
 * Created by TienToan on 04/10/2016.
 */
package oop.util;

public class Stack {
    private static class Node {
        String data;
        Node next;

        Node() {
            data = null;
            next = null;
        }

        Node(String d) {
            data = d;
            next = null;
        }
    }

    private Node top = new Node();
    private int size;

    Stack() {
        size = 0;
    }

    public boolean empty() {
        return size == 0;
    }

    public int length() {
        return size;
    }

    public void push(String x) {
        Node newNode = new Node(x);
        if (empty())
            top = newNode;
        else {
            newNode.next = top.next;
            top = newNode;
        }
        size++;
    }

    public String pop() {
        if (empty()) return null;
        else if (length() == 1) {
            String temp = top.data;
            top.data = null;
            size--;
            return temp;
        } else {
            String temp = top.data;
            top = top.next;
            size--;
            return temp;
        }
    }

    public String getTop() {
        return top.data;
    }
}
