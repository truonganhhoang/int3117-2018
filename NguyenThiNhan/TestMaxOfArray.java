import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestMaxOfArray {
    @Test
    public void testMaxOfArray() {
        MaxOfArray maxOfArray = new MaxOfArray();
        //test data
        int listArr[][] = {{3,-2,4,0,2,5,2}, {-324,3,54}, {4,3,-12,-435}, {234,23,-534,234,0}, {0,3,4}, {}};
        int results[] = {5,54,4,234,4, null};
        for(int i = 0; i<listArr.length; i++) {
            assertEquals(maxOfArray.findMaxOfArray(listArr[i]),results[i]);
        }
    }
}