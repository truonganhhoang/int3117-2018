package Test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Testgcd {
    @Test
    public void test1(){
        int gcd = GCD.gcd(50,25);
        assertEquals(gcd,25);
    }

    @Test
    public void test2(){
        int gcd = GCD.gcd(27,12);
        assertEquals(gcd,3);
    }

    @Test
    public void test3(){
        int gcd = GCD.gcd(17,15);
        assertEquals(gcd,1);
    }

    @Test
    public void test4(){
        int gcd = GCD.gcd(17,0);
        assertEquals(gcd,0);
    }

    @Test
    public void test5(){
        int gcd = GCD.gcd(2147483647,13);
        assertEquals(gcd,1);
    }

    @Test
    public void test6(){
        int gcd = GCD.gcd(2147483646,13);
        assertEquals(gcd,1);
    }

    @Test
    public void test7(){
        int gcd = GCD.gcd(2147483648,13);
        assertEquals(gcd,1);
    }
}
