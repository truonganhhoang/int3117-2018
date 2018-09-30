import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestAddNumber {
    
    AddNumber math = new AddNumber();
   @Test
    public void testAdd() {
         int a[] = {1, 2, 1, 5, 4};
         int t = math.add(a);
         assertEquals(t, 13);
    }
}