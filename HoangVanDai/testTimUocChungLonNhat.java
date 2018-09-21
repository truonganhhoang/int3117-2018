package bai1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Đại Hoàng
 */
public class testTimUocChungLonNhat {

    /**
     * Test of TimUocChungLonNhat method, of class Bai1.
     */
    @Test
    public void testTimUocChungLonNhat1() {
        int a = 0;
        int b = 0;
        Bai1 instance = new Bai1();
        int expResult = -1;
        int result = instance.TimUocChungLonNhat(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testTimUocChungLonNhat2() {
        int a = 0;
        int b = 1;
        Bai1 instance = new Bai1();
        int expResult = 1;
        int result = instance.TimUocChungLonNhat(a, b);
        assertEquals(expResult, result);
        int result2 = instance.TimUocChungLonNhat(b, a);
        assertEquals(expResult, result2);
    }

    @Test
    public void testTimUocChungLonNhat3() {
        int a = 0;
        int b = -1;
        Bai1 instance = new Bai1();
        int expResult = 1;
        int result = instance.TimUocChungLonNhat(a, b);
        assertEquals(expResult, result);
        int result2 = instance.TimUocChungLonNhat(b, a);
        assertEquals(expResult, result2);
    }

    @Test
    public void testTimUocChungLonNhat4() {
        int a = 1;
        int b = -1;
        Bai1 instance = new Bai1();
        int expResult = 1;
        int result = instance.TimUocChungLonNhat(a, b);
        assertEquals(expResult, result);
        int result2 = instance.TimUocChungLonNhat(b, a);
        assertEquals(expResult, result2);
    }

    @Test
    public void testTimUocChungLonNhat5() {
        int a = -2147483648;
        int b = 1;
        Bai1 instance = new Bai1();
        int expResult = 1;
        int result = instance.TimUocChungLonNhat(a, b);
        assertEquals(expResult, result);
        int result2 = instance.TimUocChungLonNhat(b, a);
        assertEquals(expResult, result2);
    }

    @Test
    public void testTimUocChungLonNhat6() {
        int a = 2147483647;
        int b = 1;
        Bai1 instance = new Bai1();
        int expResult = 1;
        int result = instance.TimUocChungLonNhat(a, b);
        assertEquals(expResult, result);
        int result2 = instance.TimUocChungLonNhat(b, a);
        assertEquals(expResult, result2);
    }

    @Test
    public void testTimUocChungLonNhat7() {
        int a = -2147483648;
        int b = -1;
        Bai1 instance = new Bai1();
        int expResult = 1;
        int result = instance.TimUocChungLonNhat(a, b);
        assertEquals(expResult, result);
        int result2 = instance.TimUocChungLonNhat(b, a);
        assertEquals(expResult, result2);
    }

    @Test
    public void testTimUocChungLonNhat8() {
        int a = 214748367;
        int b = -1;
        Bai1 instance = new Bai1();
        int expResult = 1;
        int result = instance.TimUocChungLonNhat(a, b);
        assertEquals(expResult, result);
        int result2 = instance.TimUocChungLonNhat(b, a);
        assertEquals(expResult, result2);
    }

    @Test
    public void testTimUocChungLonNhat9() {
        int a = -2147483648;
        int b = 0;
        Bai1 instance = new Bai1();
        int expResult = 2147483647 + 1;
        int result = instance.TimUocChungLonNhat(a, b);
        assertEquals(expResult, result);
        int result2 = instance.TimUocChungLonNhat(b, a);
        assertEquals(expResult, result2);
    }

    @Test
    public void testTimUocChungLonNhat10() {
        int a = 2147483647;
        int b = 0;
        Bai1 instance = new Bai1();
        int expResult = 2147483647;
        int result = instance.TimUocChungLonNhat(a, b);
        assertEquals(expResult, result);
        int result2 = instance.TimUocChungLonNhat(b, a);
        assertEquals(expResult, result2);
    }

    @Test
    public void testTimUocChungLonNhat11() {
        int a = -2147483648;
        int b = 2147483647;
        Bai1 instance = new Bai1();
        int expResult = 1;
        int result = instance.TimUocChungLonNhat(a, b);
        assertEquals(expResult, result);
        int result2 = instance.TimUocChungLonNhat(b, a);
        assertEquals(expResult, result2);
    }

    @Test
    public void testTimUocChungLonNhat12() {
        int a = -2147483647;
        int b = 0;
        Bai1 instance = new Bai1();
        int expResult = 2147483647;
        int result = instance.TimUocChungLonNhat(a, b);
        assertEquals(expResult, result);

    }

    @Test
    public void testTimUocChungLonNhat13() {
        int a = 2147483646;
        int b = 0;
        Bai1 instance = new Bai1();
        int expResult = 2147483646;
        int result = instance.TimUocChungLonNhat(a, b);
        assertEquals(expResult, result);
        int result2 = instance.TimUocChungLonNhat(b, a);
        assertEquals(expResult, result2);
    }

    @Test
    public void testTimUocChungLonNhat14() {
        int a = -2147483647;
        int b = 1;
        Bai1 instance = new Bai1();
        int expResult = 1;
        int result = instance.TimUocChungLonNhat(a, b);
        assertEquals(expResult, result);
        int result2 = instance.TimUocChungLonNhat(b, a);
        assertEquals(expResult, result2);
    }

    @Test
    public void testTimUocChungLonNhat15() {
        int a = 2147483646;
        int b = 1;
        Bai1 instance = new Bai1();
        int expResult = 1;
        int result = instance.TimUocChungLonNhat(a, b);
        assertEquals(expResult, result);
        int result2 = instance.TimUocChungLonNhat(b, a);
        assertEquals(expResult, result2);
    }

    @Test
    public void testTimUocChungLonNhat16() {
        int a = -2147483647;
        int b = -1;
        Bai1 instance = new Bai1();
        int expResult = 1;
        int result = instance.TimUocChungLonNhat(a, b);
        assertEquals(expResult, result);
        int result2 = instance.TimUocChungLonNhat(b, a);
        assertEquals(expResult, result2);
    }

    @Test
    public void testTimUocChungLonNhat17() {
        int a = 2147483646;
        int b = -1;
        Bai1 instance = new Bai1();
        int expResult = 1;
        int result = instance.TimUocChungLonNhat(a, b);
        assertEquals(expResult, result);
        int result2 = instance.TimUocChungLonNhat(b, a);
        assertEquals(expResult, result2);
    }

}
