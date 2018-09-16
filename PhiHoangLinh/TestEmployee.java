/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

/**
 *
 * @author Linh
 */
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

////fixture?

public class TestEmployee extends TestCase{
    private Employee batman, robin, batgirl, poisonivy, riddler;
    
    @Before@Override
    public void setUp()
    {
        batman = new Employee("Batman", 13, 20.5);
        robin = new Employee("Robin", 14, 20.5);
        batgirl = new Employee("Batgirl", 263, 20.5);
        poisonivy = new Employee("Poison Ivy", 0, 0);
        riddler = new Employee("Riddler", -1, 20.5);
    }
    
    @Test
    public void testGetInfo()
    {
        assertEquals("Name: Batman ID: 13", batman.getInfo());
        assertEquals("Name: Poison Ivy ID: 0", poisonivy.getInfo());
        assertEquals("Invalid name or ID", riddler.getInfo());
    }
    
    @Test
    public void testIDPrime()
    {
        assertTrue(batgirl.idPrime(263));
        assertTrue(batman.idPrime(13));
        assertFalse(robin.idPrime(14));
        assertFalse(riddler.idPrime(-1));
    }
    @Test
    public void testSalaryBonus()
    {
        assertEquals(2.665, batgirl.salaryBonus(263, 20.5));
        assertEquals(2.05, robin.salaryBonus(14, 20.5));
        assertEquals(0, poisonivy.salaryBonus(0, 0));
    }
}
