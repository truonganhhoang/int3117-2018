
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author phuc
 */
public class ScholarshipTest {

    public ScholarshipTest() {
    }

    /**
     * Test of scholarship method, of class Scholarship.
     */
    @Test
    public void testScholarship0() {
        System.out.println("scholarship");
        double averagePoint = -3.0;
        int trainingPoint = 85;
        String expResult = "averagePoint must be in 0-4.0.";
        String result = Scholarship.scholarship(averagePoint, trainingPoint);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testScholarship1() {
        System.out.println("scholarship");
        double averagePoint = 3.5;
        int trainingPoint = 110;
        String expResult = "trainingPoint must be in 0-100.";
        String result = Scholarship.scholarship(averagePoint, trainingPoint);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testScholarship2() {
        System.out.println("scholarship");
        double averagePoint = -1;
        int trainingPoint = 1000;
        String expResult = "averagePoint must be in 0-4.0.";
        String result = Scholarship.scholarship(averagePoint, trainingPoint);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testScholarship3() {
        System.out.println("scholarship");
        double averagePoint = 0.0;
        int trainingPoint = 0;
        String expResult = "You don't receive Scholarship.";
        String result = Scholarship.scholarship(averagePoint, trainingPoint);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testScholarship4() {
        System.out.println("scholarship");
        double averagePoint = 2.0;
        int trainingPoint = 100;
        String expResult = "You don't receive Scholarship.";
        String result = Scholarship.scholarship(averagePoint, trainingPoint);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testScholarship5() {
        System.out.println("scholarship");
        double averagePoint = 3.9;
        int trainingPoint = 79;
        String expResult = "You don't receive Scholarship.";
        String result = Scholarship.scholarship(averagePoint, trainingPoint);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testScholarship6() {
        System.out.println("scholarship");
        double averagePoint = 3.3;
        int trainingPoint = 99;
        String expResult = "You receive Scholarship I.";
        String result = Scholarship.scholarship(averagePoint, trainingPoint);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testScholarship7() {
        System.out.println("scholarship");
        double averagePoint = 3.9;
        int trainingPoint = 80;
        String expResult = "You receive Scholarship II.";
        String result = Scholarship.scholarship(averagePoint, trainingPoint);
        assertEquals(expResult, result);
    }
}
