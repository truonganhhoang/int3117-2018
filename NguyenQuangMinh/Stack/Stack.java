package OOP.util;
public class Stack {
    private Nested top ;
    private int length = 0;

    public boolean isEmpty(){
        return length == 0;
    }

    public void push(String message){
        if(isEmpty()){
            top = new Nested(message);
        }
        else{
            Nested stack = new Nested(message);
            stack.next = top;
            top = stack;
        }
        ++length;
    }

    public String pop(){
        if(length > 0){
            --length;
            Nested stack = top;
            top = top.next;

            return stack.message;
        } else {
            return null;
        }

    }

    public int getLength(){
        return length;
    }

    public String peek(){
        if(length > 0 ){
            return top.message;
        } else return null;
    }

    private static class Nested {
        private String message;
        private Nested next;

        Nested(String message_){
            message = message_;
            next = null;
        }
    }
}
