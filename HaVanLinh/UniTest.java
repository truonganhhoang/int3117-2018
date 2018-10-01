package snippet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UniTest {

	@Test
	void testCount() {
		Snippet test = new Snippet();
		int output = test.countString("Linh dương là một loài động vật quý hiếm");
		System.out.println(output);
		assertEquals(4, output);
		
	}
	@Test
	void testTriangle() {
		Snippet tr = new Snippet();
		int output = tr.CheckTriangle(10,8,6);
		System.out.println(output);
		assertEquals(3, output);
		
	}


}
