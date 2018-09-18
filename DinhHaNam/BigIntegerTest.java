import org.junit.*;
import static org.junit.Assert.*;

public class BigIntegerTest
{
    @Test
    public void CreateFromInt()
    {
        BigInteger bigInt = new BigInteger(10L);
        assertEquals("10", bigInt.toString());
    }
    
    @Test
    public void CreateFromStringWithLeadingZero()
    {
        BigInteger bigInt = new BigInteger("0010");
        assertEquals("10", bigInt.toString());
    }

    @Test
    public void CreateFromStringWithAllZeros()
    {
        BigInteger bigInt = new BigInteger("000");
        assertEquals("0", bigInt.toString());
    }

    @Test
    public void ConvertToLongWhenNotOverRange()
    {
        BigInteger bigInt = new BigInteger("10");
        assertEquals(10L, bigInt.toLong());
    }
    
    @Test
    public void Equality()
    {
        BigInteger bigInt1 = new BigInteger(10L);
        BigInteger bigInt2 = new BigInteger(10L);
        BigInteger bigInt3 = new BigInteger("10");
                
        assertEquals(bigInt1, bigInt2);
        assertEquals(bigInt1, bigInt3);
    }
    
    @Test
    public void Inequality()
    {
        BigInteger bigInt1 = new BigInteger(10L);
        BigInteger bigInt2 = new BigInteger(12L);
                
        assertFalse(bigInt1.equals(bigInt2));
    }
    
	@Test
    public void Addition1()
    {
        BigInteger bigInt1 = new BigInteger("111111111111111111111");
        BigInteger bigInt2 = new BigInteger("89");
        BigInteger sum = bigInt1.add(bigInt2);
        
        assertEquals(new BigInteger("111111111111111111200"), sum);
    }
    
    @Test
    public void Addition2()
    {
        BigInteger bigInt1 = new BigInteger("-111111111111111111111");
        BigInteger bigInt2 = new BigInteger("-89");
        BigInteger sum = bigInt1.add(bigInt2);
        
        assertEquals(new BigInteger("-111111111111111111200"), sum);
    }

    @Test
    public void Subtraction1()
    {
        BigInteger bigInt1 = new BigInteger("111111111111111111111");
        BigInteger bigInt2 = new BigInteger("9");
        BigInteger difference = bigInt1.subtract(bigInt2);
        
        assertEquals(new BigInteger("111111111111111111102"), difference);
    }

    @Test
    public void Subtraction2()
    {
        BigInteger bigInt1 = new BigInteger("111111111111111111111");
        BigInteger bigInt2 = new BigInteger("9");
        BigInteger difference = bigInt2.subtract(bigInt1);
        
        assertEquals(new BigInteger("-111111111111111111102"), difference);
    }

    @Test
    public void Subtraction3()
    {
        BigInteger bigInt1 = new BigInteger("111111111111111111111");
        BigInteger bigInt2 = new BigInteger("-9");
        BigInteger difference = bigInt1.subtract(bigInt2);
        
        assertEquals(new BigInteger("111111111111111111120"), difference);
    }
}
