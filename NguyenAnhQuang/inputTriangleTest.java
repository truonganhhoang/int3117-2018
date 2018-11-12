/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Neo
 */
public class inputTriangleTest extends TestCase {
    inputTriangle input;
    
    @Before
    public void setUp() {
        input = new inputTriangle();
    }
    
    /**
     * Test of checkTriangle method, of class inputTriangle.
     */
    @Test
    public void testNotTriangle() {
        int x = 0;
        int y = 0;
        int z = 0;
        assertEquals("Not a Triangle", input.checkTriangle(x, y, z));
    }
        
    @Test
    public void testEquilateralTriangle() {
        int x = 3;
        int y = 3;
        int z = 3;
        assertEquals("equilateral triangle", input.checkTriangle(x, y, z));
    }
    
    @Test
    public void testIsoscelesTriangle() {
        int x = 3;
        int y = 5;
        int z = 3;
        assertEquals("isosceles triangle", input.checkTriangle(x, y, z));
    }
    
    @Test
    public void testNormalTriangle() {
        int x = 3;
        int y = 4;
        int z = 5;
        assertEquals("normal triangle", input.checkTriangle(x, y, z));
    }
}
