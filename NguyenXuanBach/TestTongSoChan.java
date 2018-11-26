import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestTongSoChan {

	@Test
	void testTong0() {
		TongSoChan tong = new TongSoChan();
		long result = tong.tongSoChan(0);
		Assert.assertEquals(0, result);
		
	}
	@Test
	void testTong1() {
		TongSoChan tong = new TongSoChan();
		long result = tong.tongSoChan(1);
		Assert.assertEquals(0, result);
		
	}
	@Test
	void testTong4() {
		TongSoChan tong = new TongSoChan();
		long result = tong.tongSoChan(4);
		Assert.assertEquals(6, result);
		
	}
}
