package demo;

import static org.junit.Assert.*;

class Test {

	@org.junit.jupiter.api.Test
	public void testFindMinNumber() {
		int[] array1 = {32, 2, 4, 5,9};
		int[] array2 = {1, 3 ,5, 8, 9};
		SumOfEven test = new SumOfEven();
		int num1 = test.sumEven(array1), num2 = test.sumEven(array2);
		assertEquals(num1, 38);
		assertEquals(num2, 8);
	}
}
