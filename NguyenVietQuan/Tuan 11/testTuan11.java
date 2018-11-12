/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

import org.junit.Test;
import static org.junit.Assert.*;
import tuan11.Tuan11;

/**
 *
 * @author bjergsen
 */
public class testTuan11 {
    @Test
    public void testgiaiPTBac2(){
        String expected = "a phai khac 0";
        String result = Tuan11.giaiPTBac2(0,1,2);
        assertEquals(expected, result);
    }
    @Test
    public void testgiaiPTBac2_1(){
        String expected = "Phuong trinh co 2 nghiem la: x1 = -2.0 va x2 = -3.0";
        String result = Tuan11.giaiPTBac2(1,5,6);
        assertEquals(expected, result);
    }
    @Test
    public void testgiaiPTBac2_2(){
        String expected = "Phuong trinh co nghiem kep x1 = x2 = -2.0";
        String result = Tuan11.giaiPTBac2(1,4,4);
        assertEquals(expected, result);
    }
    @Test
    public void testgiaiPTBac2_3(){
        String expected = "Phuong trinh vo nghiem!";
        String result = Tuan11.giaiPTBac2(2,1,2);
        assertEquals(expected, result);
    }
}
