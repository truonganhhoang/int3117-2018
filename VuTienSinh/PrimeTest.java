import org.junit.*;
import static org.junit.Assert.*;
import Prime;
public class PrimeTest
{
    @Test
    public void PrimeTest1(){
        assertEquals(TRUE,Prime.check_prime(17));
    }
    @Test
    public void PrimeTest2(){
        assertEquals(TRUE,Prime.check_prime(191));
    }
    @Test
    public void PrimeTest3(){
        assertEquals(FALSE,Prime.check_prime(5239));
    }
    @Test
    public void PrimeTest3(){
        assertEquals(FALSE,Prime.check_prime(10629));
    }
}
