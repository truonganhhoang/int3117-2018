import junit.framework.Assert;
import junittest.MaxArray;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class test the result of the array
 * @author quynh
 */
public class JUnitTest {
    
    /*
    This function test the true max value
    */
    @Test
    public void testArrayTrue() {
        MaxArray maxArray = new MaxArray();
        int array[] = {5, 20, 10, 4, 7, 9};
        int result = 20;
        assertEquals(result, maxArray.findArrayMax(array));
    }
    
    /*
    This function test the true max value
    */
    @Test
    public void testArrayFalse() {
        MaxArray maxArray = new MaxArray();
        int array[] = {2, 3, 7, 9, 11};
        int result = 12;
        Assert.assertNotSame(result, maxArray.findArrayMax(array) );
    }
    
    /*
    This function test the uppper bound value of the array
    */
    @Test
    public void testArrayBegin() {
        MaxArray maxArray = new MaxArray();
        int array[] = {20, 8, 2, 3, 1};
        int result = array[0];
        Assert.assertEquals(result, maxArray.findArrayMax(array));
    }
    
    /*
    This function test the uppper lower value of the array
    */
    @Test
    public void testArrayEnd() {
        MaxArray maxArray = new MaxArray();
        int array[] = {1, 2, 3, 5, 7};
        int result = array[4];
        Assert.assertEquals(result, maxArray.findArrayMax(array));
    }
}
