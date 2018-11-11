import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CFGExampleTest {
    @Test
    public void test1(){
        float [] r = CFGExample.solveFormula(0,0, 1);
        assertEquals(r[0] , Float.MIN_VALUE, 0.00f);
        assertEquals(r[1] , Float.MIN_VALUE, 0.00f);
    }

    @Test
    public void test2(){
        float [] r = CFGExample.solveFormula(0,1, 0);
        assertEquals(r[0] , 0, 0.0f);
        assertEquals(r[1] , 0, 0.0f);
    }

    @Test
    public void test3(){
        float [] r = CFGExample.solveFormula(1,3, 1);
        assertEquals(r[0] , -2.618034f, 0.0f);
        assertEquals(r[1] , -0.38196602f, 0.0f);
    }

    @Test
    public void test4(){
        float [] r = CFGExample.solveFormula(1,2, 1);
        assertEquals(r[0] , -1, 0.00f);
        assertEquals(r[1] , -1, 0.00f);
    }

    @Test
    public void test5(){
        float [] r = CFGExample.solveFormula(1,1, 1);
        assertEquals(r[0] , Float.MIN_VALUE, 0.00f);
        assertEquals(r[1] , Float.MIN_VALUE, 0.00f);
    }
}
