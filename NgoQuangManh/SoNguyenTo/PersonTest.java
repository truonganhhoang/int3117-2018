/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Manh-PC
 */
public class PersonTest {
    
    public PersonTest() {        
    }

    @Test
    public void testSetName() {
        Person p = new Person();           
    }

    @Test
    public void testSetAge() {
    }

    @Test
    public void testGetName() {
        Person p = new Person("Manh", 21);
        assertEquals(p.GetName(), "Manh");
    }

    @Test
    public void testGetAge() {
        Person p = new Person("Manh", 21);
        assertEquals(p.GetAge(), 21);        
    }
    
    @Test
    public void testKiemTraNguyenTo() {
        Person p = new Person("Manh", 21);
        boolean check = true;
        if (p.GetAge() < 2) {
            check = false;
        } else {
            for (int i = 2; i < Math.sqrt(p.GetAge()); i++) {
                if (p.GetAge() % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        assertEquals("Tuổi của bạn không phải là một số nguyên tố", check, p.KiemTraNguyenTo());
    }
    
}
