package Test;

import static junit.demo.JunitDemo.songuyento;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test_Junit {
    @Test
    public void Test_1(){
        boolean kq = songuyento(-10);
        assertEquals(false, kq);
    }
    
    @Test
    public void Test_2(){
        boolean kq = songuyento(0);
        assertEquals(false, kq);
    }
    
    @Test
    public void Test_3(){
        boolean kq = songuyento(7);
        assertEquals(true, kq);
    }
    
    @Test
    public void Test_4(){
        boolean kq = songuyento(27);
        assertEquals(false, kq);
    }
    
    @Test
    public void Test_5(){
        boolean kq = songuyento(100);
        assertEquals(false, kq);
    }  
}
