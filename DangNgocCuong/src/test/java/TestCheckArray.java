import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Bit on 9/29/2018.
 */
public class TestCheckArray {
    CheckArray ob;

    @Before
    public void setUp() throws Exception {
        ob = new CheckArray();
    }
    @Test
    public void TestPositiveArray() {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        String actuals = ob.checkArray(arr);
        assertEquals("Positive", actuals);
    }
    @Test
    public void TestNegativeArray() {
        int arr[] = {-1,-5,-7,-3};
        String actuals = ob.checkArray(arr);
        assertEquals("Negative", actuals);
    }
    @Test
    public void TestMixedArray() {
        int arr[] = {-1,5,7,-3};
        String actuals = ob.checkArray(arr);
        assertEquals("Mix", actuals);
    }
}