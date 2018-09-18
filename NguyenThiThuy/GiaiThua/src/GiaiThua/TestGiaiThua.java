package GiaiThua;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestGiaiThua extends TestCase{	
	
	public void testTrue() {
		TimGiaiThua t = new TimGiaiThua();
		assertEquals(0, t.GiaiThua(-1));
		assertEquals(1, t.GiaiThua(0));
		assertEquals(1, t.GiaiThua(1));
		assertEquals(0, t.GiaiThua(Integer.MIN_VALUE));
	}
	
	public void testOverLoad() {
		TimGiaiThua t = new TimGiaiThua();
		//assertTrue(0 < t.GiaiThua(20));
		//assertTrue(0 < t.GiaiThua(25));
		assertTrue(0 < t.GiaiThua(28));
		assertTrue(0 < t.GiaiThua(Integer.MAX_VALUE));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		junit.textui.TestRunner.run(new TestSuite(TestGiaiThua.class));
	}

}
