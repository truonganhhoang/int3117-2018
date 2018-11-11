/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author banhb
 */
public class BMITest {
    
    public BMITest() {
    }
    
    /**
     * Test of BMI method, of class BMI.
     */
    @Test
    public void testBMI() {
        System.out.println("BMI");
        assertEquals("thua can",BMI.BMI(75, 1.8));
        assertEquals("binh thuong",BMI.BMI(74, 1.8));
        assertEquals("binh thuong",BMI.BMI(64, 1.72));
        assertEquals("beo phi",BMI.BMI(100, 1.8));
        assertEquals("thieu can",BMI.BMI(50, 1.8));
    }
    
}
