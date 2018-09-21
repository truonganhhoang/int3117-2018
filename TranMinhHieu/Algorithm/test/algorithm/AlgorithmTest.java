package algorithm;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class tests class algorithm.Algorithm
 * @author Tran Minh Hieu
 */
public class AlgorithmTest {
    
    /**
     * Constructor
     */
    public AlgorithmTest() {
    }
    
    /**
     * Test of insertionSort method, of class Algorithm. Case: Array is empty
     */
    @Test
    public void testInsertionSort1() {
        System.out.println("insertionSort");
        int[] array = null;
        int[] expResult = null;
        int[] result = Algorithm.insertionSort(array);
        assertArrayEquals(expResult, result);
    }
        
    /**
     * Test of insertionSort method, of class Algorithm. Case: Random
     */
    public void testInsertionSort2() {
        int[] array = {1, 2, 8, 0, 9, 3, 0};
        int[] expResult = {0, 0, 1, 2, 3, 8, 9};
        int[] result = Algorithm.insertionSort(array);
        assertArrayEquals(expResult, result);   
    }
    
    /**
     * Test of insertionSort method, of class Algorithm. Case: Array has only one element.
     */
    public void testInsertionSort3() {
        int[] array = {1};
        int[] expResult = {1};
        int[] result = Algorithm.insertionSort(array);
        assertArrayEquals(expResult, result);
        
    }
    
    /**
     * Test of insertionSort method, of class Algorithm. Case: Array has already been sorted.
     */
    public void testInsertionSort4() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expResult = {1, 2, 3, 4, 5};
        int[] result = Algorithm.insertionSort(array);
        assertArrayEquals(expResult, result);
        
    }

}
