package Demotest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestDemo {
	Demo f1=new Demo();
	
	@Test
	public void testMax1() {
		assertEquals(10, f1.max(5,10));
	}
	
	@Test
	public void testMax2() {
		assertEquals(5, f1.max(5,1));
	}
	
	@Test
	public void testMin1() {
		int arr[]={1, 5, 7, 8, 9, 10};
		assertEquals(1,f1.min(arr));
	}
	
	@Test
	public void testMin2() {
		int arr[]={5, 4, 2, 10, 20, 7};
		assertEquals(2,f1.min(arr));
	}
	
}
