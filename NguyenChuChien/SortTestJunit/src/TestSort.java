import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestSort {
	
	@Test
	public void testBubbleSort () {
		Sort underTest = new Sort();
		int[] a = {4, 2, 6, -1, 8, 7, 9, 0};
		int[] result = underTest.bubbleSort(a);
		int[] expectedResult = {-1, 0, 2, 4, 6, 7, 8, 9};
		assertArrayEquals(result, expectedResult);
	}
	
	@Test
	public void testQuickSort () {
		Sort underTest = new Sort();
		int[] a = {4, 2, 6, -1, 8, 7, 9, 0};
		int[] result = underTest.quickSort(a, 0, 7);
		int[] expectedResult = {-1, 0, 2, 4, 6, 7, 8, 9};
		assertArrayEquals(result, expectedResult);
	}
	
	@Test
	public void testQuickSort () {
		Sort underTest = new Sort();
		int[] a = {4, 2, 6, -1, 8, 7, 9, 0};
		int[] result = underTest.insertSort(a);
		int[] expectedResult = {-1, 0, 2, 4, 6, 7, 8, 9};
		assertArrayEquals(result, expectedResult);
	}
}
