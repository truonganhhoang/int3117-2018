package songuyento;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * class kiểm thử chương trình SoNguyenTo
 *
 * @author DaoLQ
 */
public class SoNguyenToTest {

    /**
     * Kiểm thử phương thức soNguyenTo, trường hợp x không phải số nguyên tố
     */
    @Test
    public void testSNT1() {
        System.out.println("soNguyenTo");
        int x = 74;
        SoNguyenTo instance = new SoNguyenTo();
        boolean expResult = false;
        boolean result = instance.soNguyenTo(x);
        assertEquals(expResult, result);
    }

    /**
     * Kiểm thử phương thức soNguyenTo, trường hợp x là số nguyên tố
     */
    @Test
    public void testSNT2() {
        System.out.println("soNguyenTo");
        int x = 7;
        SoNguyenTo instance = new SoNguyenTo();
        boolean expResult = true;
        boolean result = instance.soNguyenTo(x);
        assertEquals(expResult, result);
    }

    /**
     * Kiểm thử phương thức soNguyenTo, trường hợp ngoại lệ
     */
    @Test
    public void testSNT3() {
        System.out.println("soNguyenTo");
        int x = -23;
        SoNguyenTo instance = new SoNguyenTo();
        boolean expResult = false;
        boolean result = instance.soNguyenTo(x);
        assertEquals(expResult, result);
    }
}
