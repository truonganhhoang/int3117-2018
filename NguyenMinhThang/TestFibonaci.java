package TestController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.example.security.app.welcome.TinhSoFibonaci;




public class TestFibonaci {
	@Test
	 public void testFibonaciAm() {
		TinhSoFibonaci test = new TinhSoFibonaci();
		long result = test.fibonacci(-5);
		Assert.assertEquals(-1,result);
		 }
	@Test
	 public void testFibonaci0() {
		TinhSoFibonaci test = new TinhSoFibonaci();
		long result = test.fibonacci(0);
		Assert.assertEquals(0,result);
		 }
	@Test
	 public void testFibonaci1() {
		TinhSoFibonaci test = new TinhSoFibonaci();
		long result = test.fibonacci(1);
		Assert.assertEquals(1,result);
		 }
	@Test
	 public void testFibonaci() {
		TinhSoFibonaci test = new TinhSoFibonaci();
		long result = test.fibonacci(20);
		Assert.assertEquals(6765,result);
		 }
}
