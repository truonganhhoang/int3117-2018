package com.company;

public class Stack {
    public Node top = new Node();
    private int size;

    public Stack(){
        size = setsize();
    }

    private int setsize(){
        //set gia tri cho bien size cua stack;
        //neu stack chi co 1 bien top duy nhat thi size = 0;
        Node count;
        count = top;
        int i=0;//i la bien dem so luong node
        while(count.next != null){
            i++;
            count = count.next;
        }
        size = i;
        return size;
    }
    public void push(int value){
        Node node = new Node(value);
        if(size == 0){
            top.next = node;
        }
        else{
            node.next = top.next;
            top.next = node;
        }
        this.setsize();
    }
    public int pop(){
        if(this.isEmpty() == false){
            Node temp;
            temp = top.next;
            top.next = temp.next;
            temp.next = null;

            return temp.getitem();
        }
        else{
            return -1;
        }
    }
    public boolean isEmpty(){
        return (size == 0);
    }

    public int numOfElement(){

        return this.setsize();
    }

    public String display(){
        Node p;
        if(this.isEmpty() == true){
            return ("your stack have nothing");
        }
        else{
            p = top.next;
            String result="";
            while(p.next != null){
                result = result + p.displaynode();
                p = p.next;
            }
            return result;
        }

    }
}