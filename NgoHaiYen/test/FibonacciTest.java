
import main.Fibonacci;
import org.junit.Test;
 import static org.junit.Assert.assertEquals;
 public class FibonacciTest {
    @Test
    public void test1() {
        int fibo = Fibonacci.getFibonacci(1);
        assertEquals(fibo, 1);
    }
     @Test
    public void test2() {
        int fibo = Fibonacci.getFibonacci(0);
        assertEquals(fibo, 0);
    }
     @Test
    public void test3() {
        int fibo = Fibonacci.getFibonacci(-1);
        assertEquals(fibo, 0);
    }
 }