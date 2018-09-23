import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestThePhase extends TestCase{

	public void testMinValue() {
		ThePhase p new ThePhase();
		assertEquals(0, p.findPhase(Integer.MIN_VALUE));
	}

	public void testZeroValue() {
		ThePhase p new ThePhase();
		assertEquals(1, p.findPhase(0));
	}

	public void testCommonValue() {
		ThePhase p new ThePhase();
		assertEquals(1, p.findPhase(1));
	}

	public void testOverLoad() {
		ThePhase p new ThePhase();
		assertTrue(0 < p.findPhase(Integer.MAX_VALUE));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		junit.textui.TestRunner.run(new TestSuite(TestThePhase.class));
	}
}
