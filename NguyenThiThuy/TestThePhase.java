import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestThePhase extends TestCase{

	public void testMinValue() {
		ThePhase p = new ThePhase();
		assertEquals(0, p.findPhase(Integer.MIN_VALUE));
	}

	public void testZeroValue() {
		ThePhase p = new ThePhase();
		assertEquals(1, p.findPhase(0));
	}

	public void testCommonValue() {
		ThePhase p = new ThePhase();
		assertEquals(24, p.findPhase(4));
	}	
}
