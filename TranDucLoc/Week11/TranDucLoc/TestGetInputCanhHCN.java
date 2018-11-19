/**
 * Created by LocDZ on 11/8/2018.
 */
import static  org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;

public class TestGetInputCanhHCN{
        GetInputCanhHCN x;
        @Before
        public void setUp() throws Exception {
            x = new GetInputCanhHCN(1,2);
        }
        @Test
        public  void Test1() {
            int delta = 0;
            assertEquals("Day khong phai canh hinh chu nhat", x.Dientich(-1,2));
        }
        public  void Test2() {
            int delta = 0;
            assertEquals("day la hinh chu nhat co chu vi la: 14 dien tich la: 12", x.Dientich(3,4));

        }
        public  void Test2() {
            int delta = 0;
            assertEquals("day la hinh vuong co chu vi la: 12 dien tich la: 9", x.Dientich(3,3));

         }

}
