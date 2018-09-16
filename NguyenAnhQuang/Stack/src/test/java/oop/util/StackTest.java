package oop.util;

import junit.framework.TestCase;

/**
 * Created by MyPC on 06/10/2016.
 */
public class StackTest extends TestCase {

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    /**
     * Test of push method, of class Stack.
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
     */
    public void testPushNTop() throws Exception {
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

    public void testIsEmpty() throws Exception {
        Stack stack = new Stack();

        stack.push("Nguyen Anh Quang");
        assertEquals(false, stack.isEmpty());

        stack.pop();
        assertEquals(true, stack.isEmpty());
    }
}