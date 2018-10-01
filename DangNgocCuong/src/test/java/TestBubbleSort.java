import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
/**
 * Created by Bit on 9/29/2018.
 */
public class TestBubbleSort {
    BubbleSort ob;

    @Before
    public void setUp() throws Exception {
        ob = new BubbleSort();
    }

    @Test
    public void TestSort() {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        int expectArr[] = {11, 12, 22, 25, 34, 64, 90};
        ob.bubbleSort(arr);
        assertArrayEquals(expectArr, arr);
    }
}