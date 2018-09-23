
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit test for Scholarship.java
 *
 * @author phuc
 */
public class ScholarshipTest {

    public ScholarshipTest() {
    }

    /**
     * Test of scholarship method, of class Scholarship. Test input avaragePoint
     * error
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

    /**
     * Test input trainingPoint error
     */
    @Test
    public void testScholarship1() {
        System.out.println("scholarship");
        double averagePoint = 3.5;
        int trainingPoint = 110;
        String expResult = "trainingPoint must be in 0-100.";
        String result = Scholarship.scholarship(averagePoint, trainingPoint);
        assertEquals(expResult, result);
    }

    /**
     * Test input avaragePoint & trainingPoint error
     */
    @Test
    public void testScholarship2() {
        System.out.println("scholarship");
        double averagePoint = -1;
        int trainingPoint = 1000;
        String expResult = "averagePoint must be in 0-4.0.";
        String result = Scholarship.scholarship(averagePoint, trainingPoint);
        assertEquals(expResult, result);
    }

    /**
     * Test input avaragePoint = 0.0 & trainingPoint = 0
     */
    @Test
    public void testScholarship3() {
        System.out.println("scholarship");
        double averagePoint = 0.0;
        int trainingPoint = 0;
        String expResult = "You don't receive Scholarship.";
        String result = Scholarship.scholarship(averagePoint, trainingPoint);
        assertEquals(expResult, result);
    }

    /**
     * Test student don't receive scholarship because of avaragePoint
     */
    @Test
    public void testScholarship4() {
        System.out.println("scholarship");
        double averagePoint = 2.0;
        int trainingPoint = 100;
        String expResult = "You don't receive Scholarship.";
        String result = Scholarship.scholarship(averagePoint, trainingPoint);
        assertEquals(expResult, result);
    }

    /**
     * Test student don't receive scholarship because of trainingPoint
     */
    @Test
    public void testScholarship5() {
        System.out.println("scholarship");
        double averagePoint = 3.9;
        int trainingPoint = 79;
        String expResult = "You don't receive Scholarship.";
        String result = Scholarship.scholarship(averagePoint, trainingPoint);
        assertEquals(expResult, result);
    }

    /**
     * Test student receive scholarship I
     */
    @Test
    public void testScholarship6() {
        System.out.println("scholarship");
        double averagePoint = 3.3;
        int trainingPoint = 99;
        String expResult = "You receive Scholarship I.";
        String result = Scholarship.scholarship(averagePoint, trainingPoint);
        assertEquals(expResult, result);
    }

    /**
     * Test student receive scholarship II
     */
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
