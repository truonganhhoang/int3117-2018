package SinhVien;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTestSinhVien {

	@Test
	void testNhapSinhVien() {
		SinhVien sv = new SinhVien("Nam", "A",7);
		assertEquals("Nam",sv.getTen());
		assertEquals("A",sv.getLop());
		assertEquals("Nam",sv.getDiem());
	}

}
