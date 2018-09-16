import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestBcnn {
    BCNN bcnn = new BCNN();
   @Test
    public void testBcnn() {
         int result = bcnn.bcnn(4,3);
         assertEquals(result, 12);
    }
}