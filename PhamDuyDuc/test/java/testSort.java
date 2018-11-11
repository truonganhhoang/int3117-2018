package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Sort;

public class testSort {

	@Test
	public void testBubbleSort() {
		Sort test = new Sort();
		int[] a = {22,46,12,22,35,24,47};
		int[] result = test.bubbleSort(a);
		int[] b = {12,22,22,24,35,46,47};
		assertArrayEquals(result, b);
	}
	
	@Test
	public void testQuickSort() {
		Sort test = new Sort();
		int[] a = {22,46,12,22,35,24,47};
		int[] result = test.quickSort(a,0,6);
		int[] b = {12,22,22,24,35,46,47};
		assertArrayEquals(result, b);
	}

}
