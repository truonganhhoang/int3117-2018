import static org.junit.Assert.*;

public class binary_search_of_meTest {

    @org.junit.Test
    public void binary_search() {
        binary_search_of_me test = new binary_search_of_me();
        int [] a = new int[6];
        a[0] = 33;
        a[1] = 22;
        a[2] = 44;
        a[3] = 56;
        a[4] = 12;
        a[5] = 99;
        int result1 = test.binary_search(a, 44);

        assertEquals(2, result1);

    }
}