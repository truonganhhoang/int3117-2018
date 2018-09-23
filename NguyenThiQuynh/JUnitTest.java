import junittest.MaxArray;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * class nay de test ket qua cua ham findArrayMax
 * @author quynh
 */
public class JUnitTest {
    
    @Test
    public void testArrayMax() {
        MaxArray maxArray = new MaxArray();
        int array[] = {5, 20, 10, 4, 7, 9};
        int result = 20;
        assertEquals(result, maxArray.findArrayMax(array));
    }
}
