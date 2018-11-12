import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestIsTriangle {
    
    Triangle_tmp tr = new Triangle_tmp();
   @Test
    public void testIsTriangle() {
         int deu = tr.isTriangle(3,3,3);
         int vuong = tr.isTriangle(3,4,5);
         int thuong = tr.isTriangle(3, 4, 5);
         int kp = tr.isTriangle(1,2,3);
         assertEquals(deu, "Tam giac deu");
         assertEquals(vuong, "Tam giac vuong");
         assertEquals(thuong, "Tam giac thuong");
         assertEquals(kp, "Khong phai tam giac");
    }
}