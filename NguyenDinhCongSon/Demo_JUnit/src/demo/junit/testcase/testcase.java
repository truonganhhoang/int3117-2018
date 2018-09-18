package demo.junit.testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import demo.PhanSo;

public class testcase {
	public PhanSo ps1 = new PhanSo(1,2);
	public PhanSo ps2 = new PhanSo(1,3);

	@Test
	public void testAdd() {
		PhanSo add = ps1.add(ps2);
		assertEquals(5,add.getTuSo());
		assertEquals(6,add.getMauSo());
	}

	@Test
	public void testMinus() {
		PhanSo minus = ps1.minus(ps2);
		assertEquals(1,minus.getTuSo());
		assertEquals(6,minus.getMauSo());
	}

	@Test
	public void testToString() {
		assertEquals("1/2", ps1.toString());
	}

}
