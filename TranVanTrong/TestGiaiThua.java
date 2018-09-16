package TestController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.example.security.app.welcome.GiaiThua;




public class TestGiaiThua {
	@Test
	 public void testGiaiThua0() {
		GiaiThua test = new GiaiThua();
		long result = test.tinhGiaithua(0);
		Assert.assertEquals(1,result);
		 }
	@Test
	 public void testGiaiThua1() {
		GiaiThua test = new GiaiThua();
		long result = test.tinhGiaithua(1);
		Assert.assertEquals(1,result);
		 }
	@Test
	 public void testGiaiThua5() {
		GiaiThua test = new GiaiThua();
		long result = test.tinhGiaithua(5);
		Assert.assertEquals(120,result);
		 }
	
}
