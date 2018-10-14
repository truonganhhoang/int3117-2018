import java.util.EmptyStackException;
import junit.framework.TestCase;

public class StackTest extends TestCase {
    /**
     * Test of push method, of class Stack.
     * @throws java.lang.Exception
     */
    @org.junit.Test
    public void testPush() throws Exception {
        System.out.println("push");
        String data = "Neo";
        Stack instance = new Stack();
        instance.push(data);
    }
    
    /**
     * Test of top method, of class Stack.
     * @throws java.lang.Exception
     */
    public void testTop() throws Exception {
        Stack stack = new Stack();
        stack.push("hello");

        assertEquals("hello", stack.top());
    }

    public void testPop() throws Exception {
        Stack stack = new Stack();
        stack.push("Hello");
        stack.push("Im Quang");

        assertEquals("Im Quang", stack.pop());
        assertEquals("Hello", stack.pop());
    }
    
    public void testEmptyPop() throws Exception {
        Stack stack = new Stack();
    
        try {
            stack.pop();
        } catch (EmptyStackException e) {
        } catch (Exception e2) {
            fail("caught exception but it is not EmptyStackException");
        }
    }

    public void testIsEmpty() throws Exception {
        Stack stack = new Stack();

        stack.push("Nguyen Anh Quang");
        assertEquals(false, stack.isEmpty());

        stack.pop();
        assertEquals(true, stack.isEmpty());
    }
}