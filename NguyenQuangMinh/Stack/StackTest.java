import OOP.util.Stack;
import OOP.util.Stack;
import org.junit.Test;


import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void testEmpty() {
        Stack stack = new Stack();
        assertTrue( stack.isEmpty());

        stack.push("Math");
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testPush() {
        Stack stack = new Stack();
        stack.push("Math");
        stack.push("Music");

        assertEquals("Music", stack.peek());
    }

    @Test
    public void testPop() {
        Stack stack = new Stack();
        stack.push("Math");
        stack.push("Music");
        stack.push("History");
        stack.push("Physic");

        assertEquals("Physic", stack.pop());
        assertEquals("History", stack.pop());
        stack.pop();
        assertEquals("Math", stack.pop());
        stack.pop();
        assertEquals(stack.pop(), null);

    }

    @Test
    public void testGetLength(){
        Stack stack = new Stack();
        stack.push("Math");
        stack.push("Music");
        stack.push("History");
        stack.push("Physic");

        assertEquals(4, stack.getLength());
    }

    @Test
    public  void testPeek(){
        Stack stack = new Stack();
        assertEquals(null, stack.peek());

        stack.push("Math");
        stack.push("Music");
        stack.push("History");
        stack.push("Physic");
        assertEquals("Physic", stack.peek());
    }


}
