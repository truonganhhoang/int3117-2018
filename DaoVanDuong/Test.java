package demotest;

import static org.junit.Assert.*;

import org.junit.Assert;

public class Test {

	@org.junit.Test
	public void testQuickSort() {
		DemoTest test = new DemoTest();
		int[] test1 = {3,99,2,4},equal1 = {2,3,4,99}, test2 = {4,3,2,1}, equal2 = {1,2,3,4};
		int[] result1 = test.quickSort(test1,0,3), result2 = test.quickSort(test2,0,3);
		assertArrayEquals(result1, equal1);
		assertArrayEquals(result2, equal2);
	}
}
