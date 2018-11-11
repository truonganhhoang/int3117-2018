import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestUcln {
    
    UCLN ucln = new UCLN();
   @Test
    public void testUcln() {
         int result = ucln.ucln(4,12);
         assertEquals(result, 4);
    }
}