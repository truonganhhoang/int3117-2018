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
import week1.Minimum;

/**
 *
 * @author Quan
 */
public class testMinimum {
     @Test
    public void MinimumTest() {
        int a[] = new int[]{4, 1, 5, 7, 9};
        int expected = 1;
        int result = Minimum.findMin(a);
        assertEquals(expected, result);
    }

    @Test
    public void MinimumTest2() {
        int a[] = new int[]{5, 2, 5, 7, 9};
        int expected = 2;
        int result = Minimum.findMin(a);
        assertEquals(expected, result);
    }

    @Test
    public void MinimumTest3() {
        int a[] = new int[]{4, 1, 5, 7, 9};
        int expected = 4;
        int result = Minimum.findMin(a);
        assertEquals(expected, result);
    }

    @Test
    public void MinimumTest4() {
        int a[] = new int[]{4, 12, 5, 7, 9};
        int expected = 4;
        int result = Minimum.findMin(a);
        assertEquals(expected, result);
    }

    @Test
    public void MinimumTest5() {
        int a[] = new int[]{4, 1, 5, 7, 9};
        int expected = 9;
        int result = Minimum.findMin(a);
        assertEquals(expected, result);
    }
}
