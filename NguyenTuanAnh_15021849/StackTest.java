package com.company;

import junit.framework.TestCase;

public class StackTest extends TestCase {

    public void testPush() {
        Stack stack2 = new Stack();
        for(int i = 0;i<3;i++){
            stack2.push(i);
        }
        assertEquals("(2)(1)",stack2.display());
    }

    public void testPop() {
        Stack stack2 = new Stack();
        assertEquals(-1,stack2.pop());

        Stack stack1 = new Stack();
        stack1.push(1);
        assertEquals(1,stack1.pop());
    }

    public void testIsEmpty() {
        Stack stack1 = new Stack();
        assertTrue(stack1.isEmpty());

        Stack stack2 = new Stack();
        stack2.push(1);
        assertFalse(stack2.isEmpty());
    }

    public void testNumOfElement() {
        Stack stack1 = new Stack();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        assertEquals(4,stack1.numOfElement());

        stack1.pop();

        Stack stack2 = new Stack();
        assertEquals(0,stack2.numOfElement());
    }

    public void testDisplay() {
        Stack stack1 = new Stack();
        assertEquals("your stack have nothing",stack1.display());

        Stack stack2 = new Stack();
        for(int i = 0;i<3;i++){
            stack2.push(i);
        }
        assertEquals("(2)(1)",stack2.display());
    }
}