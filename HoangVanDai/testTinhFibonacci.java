package bai1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Đại Hoàng
 */
public class testTinhFibonacci {

    /**
     * Test of TinhFibonacci method, of class Bai1.
     *
     */
    @Test
    public void testTinhFibonacci1() {
        int n = -2147483648;
        Bai1 instance = new Bai1();
        int expResult = -1;
        int result = instance.TinhFibonacci(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testTinhFibonacci2() {
        int n = -2147483647;
        Bai1 instance = new Bai1();
        int expResult = -1;
        int result = instance.TinhFibonacci(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testTinhFibonacci3() {
        int n = -1;
        Bai1 instance = new Bai1();
        int expResult = -1;
        int result = instance.TinhFibonacci(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testTinhFibonacci4() {
        int n = 0;
        Bai1 instance = new Bai1();
        int expResult = 0;
        int result = instance.TinhFibonacci(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testTinhFibonacci5() {
        int n = 1;
        Bai1 instance = new Bai1();
        int expResult = 1;
        int result = instance.TinhFibonacci(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testTinhFibonacci6() {
        int n = 3;
        Bai1 instance = new Bai1();
        int expResult = 2;
        int result = instance.TinhFibonacci(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testTinhFibonacci7() {
        int n = 20;
        Bai1 instance = new Bai1();
        int expResult = 6765;
        int result = instance.TinhFibonacci(n);
        assertEquals(expResult, result);
    }
}
