/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Anh Tran
 */
public class LayerTest {
    
    public LayerTest() {
    }

    /**
     * Test of eraseTriangleOfShape method, of class Layer.
     */
    @Test
    public void testEraseTriangleOfShape() {
        System.out.println("eraseTriangleOfShape");
        Layer instance = new Layer();
        instance.eraseTriangleOfShape();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eraseCircleOfShape method, of class Layer.
     */
    @Test
    public void testEraseCircleOfShape() {
        System.out.println("eraseCircleOfShape");
        Layer instance = new Layer();
        instance.eraseCircleOfShape();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
