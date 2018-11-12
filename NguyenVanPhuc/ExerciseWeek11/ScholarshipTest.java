import org.junit.Test;
import static org.junit.Assert.*;

/**
 ** JUnit test for Scholarship.java
 **
 ** @author phuc
 **/
public class ScholarshipTest {
	public ScholarshipTest() {
		    
	}

	@Test
	public void test1() {
		double aP = 4.1;
		int tP = 85;
		String expResult = "aP in 0-4.0.";
		String result = Scholarship.scholarship(aP, tP);
		assertEquals(expResult, result);
	}

	@Test
	public void test2() {
		double aP = 3.7;
		int tP = 1000;
		String expResult = "tP in 0-100.";
		String result = Scholarship.scholarship(aP, tP);
		assertEquals(expResult, result);
	}

	@Test
	public void test3() {
		double aP = 3.0;
		int tP = 75;
		String expResult = "No Scholarship.";
		String result = Scholarship.scholarship(aP, tP);
		assertEquals(expResult, result);
	}
	@Test
	public void test4() {
		double aP = 3.4;
		int tP = 83;
		String expResult = "Scholarship I.";
		String result = Scholarship.scholarship(aP, tP);
		assertEquals(expResult, result);
	}
	@Test
	public void test5() {
		double aP =3.8 ;
		int tP = 86;
		String expResult = "Scholarship II.";
		String result = Scholarship.scholarship(aP, tP);
		assertEquals(expResult, result);
	}
}
