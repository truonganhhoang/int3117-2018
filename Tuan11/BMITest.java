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
        assertEquals("thua can",BMI.BMI(75 , 1.8)); // BMI = 23,1
        assertEquals("binh thuong",BMI.BMI(74 , 1.8)); // BMI = 22.8
        assertEquals("beo phi",BMI.BMI(100 , 1.8)); // BMI = 30.8
        assertEquals("thieu can",BMI.BMI(50 , 1.8)); // BMI = 15.4
    }
    
}