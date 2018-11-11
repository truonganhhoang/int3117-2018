package com.company;

import junit.framework.TestCase;

public class NodeTest extends TestCase {

    public void testGetitem() {
        Node n1 = new Node(15021849);
        assertEquals(15021849, n1.getitem());

        Node n2 = new Node();
        assertEquals(0, n2.getitem());
    }
}