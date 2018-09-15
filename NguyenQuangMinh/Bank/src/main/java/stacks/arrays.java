package stacks;


public class arrays implements StackOfString{

    int array[] = new int[1000];
    int length = 0;

    boolean empty(){
        return length == 0;
    }

    @Override
    public void push(int obj) {
        array[length] = obj;
        ++length;
    }

    @Override
    public int pop() {
        if(!empty()){
            --length;
            int temp = array[length];
            array[length] = Integer.parseInt(null);
            return temp;
        }
        return 0;
    }
}
