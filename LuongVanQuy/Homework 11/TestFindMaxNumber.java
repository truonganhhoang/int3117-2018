import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestFindMaxNumber {

	@Test
	public void test() {
		int[] array = {3, 5};
		DemoJUnitTest demo = new DemoJUnitTest();
		int maxNumber = demo.findMaxNumber(array);
		assertEquals(5, maxNumber);
	}
	
	@Test
	public void test() {
		int[] array = {3};
		DemoJUnitTest demo = new DemoJUnitTest();
		int maxNumber = demo.findMaxNumber(array);
		assertEquals(3, maxNumber);
	}

}
