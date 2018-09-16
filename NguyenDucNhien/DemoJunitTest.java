package demojunit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NguyenDucNhien
 */
public class DemoJunitTest {
    @Test
    public void testBMI1() {
        float canNang = 45F;
        float chieuCao = 1.7F;
        String expResult = "Thieu can";
        String result = DemoJunit.BMI(canNang, chieuCao);
        assertEquals(expResult, result);
    }
     @Test
    public void testBMI2() {
        float canNang = 60F;
        float chieuCao = 1.7F;
        String expResult = "Binh thuong";
        String result = DemoJunit.BMI(canNang, chieuCao);
        assertEquals(expResult, result);
    }  
    @Test
    public void testBMI3() {
        float canNang = 70F;
        float chieuCao = 1.7F;
        String expResult = "Thua can";
        String result = DemoJunit.BMI(canNang, chieuCao);
        assertEquals(expResult, result);
    }
    @Test
    public void testBMI4() {
        float canNang = 80F;
        float chieuCao = 1.7F;
        String expResult = "Beo phi";
        String result = DemoJunit.BMI(canNang, chieuCao);
        assertEquals(expResult, result);
    }
    @Test
    public void testBMI5() {
        float canNang = 100F;
        float chieuCao = 1.7F;
        String expResult = "Beo phi";
        String result = DemoJunit.BMI(canNang, chieuCao);
        assertEquals(expResult, result);
    }
}
