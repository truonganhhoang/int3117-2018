package PKDM;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DemoTestTest {

	@Test
	void test() {
		DemoTest dm = new DemoTest();
		int u = dm.dem('thao khi');
		assertEquals(1,u);
	}

}
