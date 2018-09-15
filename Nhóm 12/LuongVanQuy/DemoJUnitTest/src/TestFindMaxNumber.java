import static org.junit.Assert.*;

import org.junit.Test;

public class TestFindMaxNumber {

	@Test
	public void test() {
		int[] array = {9, 1, 17, 5, 3, 7, 15};
		DemoJUnitTest demo = new DemoJUnitTest();
		int maxNumber = demo.findMaxNumber(array);
		assertEquals(17, maxNumber);
	}

}
