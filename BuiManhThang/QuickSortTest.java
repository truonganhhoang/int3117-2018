import org.junit.*;
import static org.junit.Assert.*;

public class QuickSortTest
{
    @Test
    public void testQuickSort1()
    {
        int[] arr = {1,5,2,4,8,3,7,0,10};
        QuickSort.sort(arr, 0, arr.length - 1);
        assertEquals(1, arr[1]);
        assertEquals(5, arr[5]);
    }

    @Test
    public void testQuickSort2()
    {
        int[] arr = {1,1,1,1,1,1,1,1,1};
        QuickSort.sort(arr, 0, arr.length - 1);
        assertEquals(1, arr[1]);
        assertEquals(1, arr[8]);
    }

    @Test
    public void testQuickSort3()
    {
        int[] arr = {5,4,3,2,1};
        QuickSort.sort(arr, 0, arr.length - 1);
        assertEquals(2, arr[1]);
        assertEquals(5, arr[4]);
    }
}
