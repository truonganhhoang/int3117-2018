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
public class DiagramTest {
    
    public DiagramTest() {
    }

    /**
     * Test of eraseCircleOfLayerInDiagram method, of class Diagram.
     */
    @Test
    public void testEraseCircleOfLayerInDiagram() {
        System.out.println("eraseCircleOfLayerInDiagram");
        Diagram instance = new DiagramImpl();
        instance.eraseCircleOfLayerInDiagram();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Diagram.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Diagram.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class DiagramImpl extends Diagram {
    }
    
}
