import static org.junit.Assert.*;

public class TestBinarySearch {

    @org.junit.Test
    public void binarySearch() {
        BinarySearch test = new BinarySearch();
        int [] a = new int[6];
        a[0] = 33;
        a[1] = 22;
        a[2] = 44;
        a[3] = 56;
        a[4] = 12;
        a[5] = 99;
        int result = test.binarySearch(a, 44);

        assertEquals(2, result);

    }
    @org.junit.Test
	    public void testNullSearch() {
		int result = test.binarySearch(a, 34);

		assertArrayEquals(-1, result);
	}
}
