import static  org.junit.Assert.*;
import org.junit.*;


import java.io.IOException;
/**
 * Created by LocDZ on 9/11/2018.
 */
public class SayHITest {
    SayHI x;
    @Before
    public void setUp() throws Exception {

        x = new SayHI(1, 2);
    }
    @Test
    // test sum
    public  void cay() {
        int delta = 0;
       assertEquals(47, x.Sum(),delta);
       System.out.println(x.Sum());
    }



}