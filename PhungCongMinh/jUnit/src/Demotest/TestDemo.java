package Demotest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDemo {
	Demo f1=new Demo();
	@Test
	public void testMax() {
		assertEquals(10, f1.max(5,10));
	}
	@Test
	public void testMin() {
		int arr[]={1, 5, 7, 8, 9, 10};
		assertEquals(1,f1.min(arr));
	}
	
}
