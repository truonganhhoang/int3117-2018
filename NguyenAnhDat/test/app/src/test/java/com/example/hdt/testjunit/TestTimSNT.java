package com.example.hdt.testjunit;

import junit.framework.TestCase;

public class TestTimSNT extends TestCase {

    public void testKiemTraSNT() {
        MainActivity p = new MainActivity();
        assertEquals(true, p.kiemTraSNT(2));
    }

    public void testInKetQuaSNT() {
        MainActivity p = new MainActivity();
        assertEquals("2 3 ", p.inKetQua(5));
    }
}
