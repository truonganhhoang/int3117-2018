
package songuyento;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DaoLQ
 */
public class SoNguyenToTest {
    
    public SoNguyenToTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of SNT method, of class SoNguyenTo.
     */
    @Test
    public void testSNT() {
        System.out.println("SNT");
        int x = 74;
        SoNguyenTo instance = new SoNguyenTo();
        boolean expResult = false;
        boolean result = instance.SNT(x);
        assertEquals(expResult, result);
    }
    @Test
    public void testSNT2() {
        System.out.println("SNT");
        int x = 3;
        SoNguyenTo instance = new SoNguyenTo();
        boolean expResult=true;
        boolean result = instance.SNT(x);
        assertEquals(expResult, result);
    }
}
