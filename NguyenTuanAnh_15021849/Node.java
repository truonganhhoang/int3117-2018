package com.company;

public class Node {
    private int item;
    public Node next;
    public Node(){
        item = 0;
        next = null;
    }
    public Node(int val){
        item = val;
        next = null;
    }
    public int getitem(){
        return item;
    }
    public String displaynode(){
        return "("+item+")";
    }
}