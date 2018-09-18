package GiaiThua;
import junit.framework.*;

public class TestJUnit extends TestCase{
	public void testSetup() {
		String str = "I am done with Junit setup";
		assertEquals("I am done with Junit setup;", str+';');
	}
	public void testEqual() {
		assertEquals(100, 100);
	}
}
