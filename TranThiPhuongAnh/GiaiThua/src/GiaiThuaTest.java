/**
 * Lop nay test class GiaiThua
 * @author TranThiPhuongAnh
 *
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class GiaiThuaTest {

	/**
	 * Test truong hop input la 0
	 */
	@Test
	public void testTinhGiaiThua0() {
		GiaiThua gt = new GiaiThua();
		assertEquals(1, gt.tinhGiaiThua(0));
	}
	
	/**
	 * Test truong hop input la 1
	 */
	@Test
	public void testTinhGiaiThua1() {
		GiaiThua gt = new GiaiThua();
		assertEquals(1, gt.tinhGiaiThua(1));
	}
	
	/**
	 * Test truong hop input la so nguyen am
	 */
	@Test
	public void testTinhGiaiThuaSoNguyenAm() {
		GiaiThua gt = new GiaiThua();
		assertEquals(0, gt.tinhGiaiThua(-2));
	}
	
	/**
	 * Test truong hop input la so nguyen duong
	 */
	@Test
	public void testTinhGiaiThuaSoNguyenDuongLonHon1() {
		GiaiThua gt = new GiaiThua();
		assertEquals(6, gt.tinhGiaiThua(3));
	}

}
