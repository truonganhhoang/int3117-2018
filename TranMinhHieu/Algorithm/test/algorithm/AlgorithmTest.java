package algorithm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tran Minh Hieu
 */
public class AlgorithmTest {
    
    public AlgorithmTest() {
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
     * Test of insertionSort method, of class Algorithm.
     */
    @Test
    public void testInsertionSort() {
        System.out.println("insertionSort");
        int[] array = null;
        int[] expResult = null;
        int[] result = Algorithm.insertionSort(array);
        assertArrayEquals(expResult, result);
        
        int[] array1 = {1, 2, 8, 0, 9, 3, 0};
        int[] expResult1 = {0, 0, 1, 2, 3, 8, 9};
        int[] result1 = Algorithm.insertionSort(array1);
        assertArrayEquals(expResult1, result1);
        
        int[] array2 = {1};
        int[] expResult2 = {1};
        int[] result2 = Algorithm.insertionSort(array2);
        assertArrayEquals(expResult2, result2);
        
    }

    /**
     * Test of main method, of class Algorithm.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Algorithm.main(args);
//       
//    }
    
}
