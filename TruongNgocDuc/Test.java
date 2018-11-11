package demo;

import static org.junit.Assert.*;
import demo.DemoTest;

class Test {

	@org.junit.jupiter.api.Test
	public void testFindMinNumber() {
		int[] array1 = {1,5,2,4,3};
		int[] array2 = {5,3,2,4,1};
		DemoTest demoTest = new DemoTest();
		int minNumber1 = demoTest.findMinNumber(array1);
		int minNumber2 = demoTest.findMinNumber(array2);
		assertEquals(minNumber1, minNumber2);
	}
}
