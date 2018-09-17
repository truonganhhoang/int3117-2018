package oop.util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by TienToan on 04/10/2016.
 */
public class StackTest {
    Stack s;

    @Before
    public void setUp() {
        s = new Stack();
    }

    @Test
    public void TestEmptyWithEmptyStack() {
        Stack s1 = new Stack();
        assertEquals(true, s1.empty());
    }

    @Test
    public void TestEmptyWithNotEmptyStack() {
        Stack s1 = new Stack();
        s1.push("1");
        assertEquals(false, s1.empty());
    }

    @Test
    public void TestLengthWithEmptyStack() {
        Stack s1 = new Stack();
        assertEquals(0, s1.length());
    }

    @Test
    public void TestLengthWithNotEmptyStack() {
        Stack s1 = new Stack();
        s1.push("1");
        s1.push("2");
        assertEquals(2, s1.length());
    }

    @Test
    public void TestPush() {
        s.push("1");
        assertEquals(false, s.empty());
        assertEquals(1, s.length());
    }

    @Test
    public void TestPop() {
        s.push("1");
        String pop = s.pop();
        assertEquals(true, s.empty());
        assertEquals("1", pop);
    }

    @Test
    public void TestGetTop() {
        s.push("1");
        assertEquals("1", s.getTop());
    }
}