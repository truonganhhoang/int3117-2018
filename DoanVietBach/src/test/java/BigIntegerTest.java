import org.junit.*;
import static org.junit.Assert.*;

public class BigIntegerTest
{
    @Test
    public void testCreateBigIntegerFromInt()
    {
        BigInteger bigInt = new BigInteger(10L);
        assertEquals("10", bigInt.toString());
    }
    
    @Test
    public void testCreateBigIntegerFromStringWithLeadingZero()
    {
        BigInteger bigInt = new BigInteger("01000000000000000000000000000000000001");
        assertEquals("1000000000000000000000000000000000001", bigInt.toString());
    }

    @Test
    public void testCreateBigIntegerFromStringWithAllZeros()
    {
        BigInteger bigInt = new BigInteger("000");
        assertEquals("0", bigInt.toString());
    }

    @Test
    public void testCreateBigIntegerFromStringWithAllButUnitZeros()
    {
        BigInteger bigInt = new BigInteger("001");
        assertEquals("1", bigInt.toString());
    }

    @Test
    public void testConvertToLongWhenNotOverRange()
    {
        BigInteger bigInt = new BigInteger("10");
        assertEquals(10L, bigInt.toLong());
    }
    
    @Test
    public void testEquality()
    {
        BigInteger bigInt1 = new BigInteger(10L);
        BigInteger bigInt2 = new BigInteger(10L);
        BigInteger bigInt3 = new BigInteger("10");
                
        assertEquals(bigInt1, bigInt2);
        assertEquals(bigInt1, bigInt3);
    }
    
    @Test
    public void testInequality()
    {
        BigInteger bigInt1 = new BigInteger(10L);
        BigInteger bigInt2 = new BigInteger(12L);
                
        assertFalse(bigInt1.equals(bigInt2));
    }

    @Test
    public void testAdditionWithoutCarryOn()
    {
        BigInteger bigInt1 = new BigInteger("111111111111111111111");
        BigInteger bigInt2 = new BigInteger("1");
        BigInteger sum = bigInt1.add(bigInt2);
        
        assertEquals(new BigInteger("111111111111111111112"), sum);
    }
   
	@Test
    public void testAdditionWithCarryOn()
    {
        BigInteger bigInt1 = new BigInteger("9999999999999999999999999999999999999999");
        BigInteger bigInt2 = new BigInteger("1");
        BigInteger sum = bigInt1.add(bigInt2);
        
        assertEquals(new BigInteger("10000000000000000000000000000000000000000"), sum);
    }
    
    @Test
    public void testSubtractionWithoutCarryOn()
    {
        BigInteger bigInt1 = new BigInteger("111111111111111111111");
        BigInteger bigInt2 = new BigInteger("1");
        BigInteger difference = bigInt1.subtract(bigInt2);
        
        assertEquals(new BigInteger("111111111111111111110"), difference);
    }
    
    @Test
    public void testSubtractionWithCarryOn()
    {
        BigInteger bigInt1 = new BigInteger("1000000000000000000000");
        BigInteger bigInt2 = new BigInteger("1");
        BigInteger difference = bigInt1.subtract(bigInt2);
        
        assertEquals(new BigInteger("999999999999999999999"), difference);
    }

    @Test
    public void testSubtractionNegative() {
        BigInteger bigInt1 = new BigInteger("1");
        BigInteger bigInt2 = new BigInteger("100000000000000000000000000000");

        BigInteger difference = bigInt1.subtract(bigInt2);
        assertEquals(new BigInteger("-99999999999999999999999999999"), difference);
    }

    @Test
    public void testAddWithNegativeBigInteger() {
        BigInteger bigInt1 = new BigInteger("15201");
        BigInteger bigInt2 = new BigInteger("-3258");

        BigInteger sum = bigInt1.add(bigInt2);

        assertEquals(new BigInteger("11943"), sum);
    }

    @Test
    public void testSubtractWithNegativeBigInteger() {
        BigInteger bigInt1 = new BigInteger("-12584");
        BigInteger bigInt2 = new BigInteger("-324849");

        BigInteger sum = bigInt1.subtract(bigInt2);

        assertEquals(new BigInteger("312265"), sum);
    }

    @Test
    public void testWhenResultIsZero() {
        BigInteger bigInt1 = new BigInteger("0");
        BigInteger bigInt2 = new BigInteger("-0");

        BigInteger sum = bigInt1.add(bigInt2);

        assertEquals(new BigInteger("0"), sum);
    }

    @Test
    public void testCompareTo() {
        BigInteger bigInt1 = new BigInteger("11");
        BigInteger bigInt2 = new BigInteger("-100");
        BigInteger bigInt3 = new BigInteger("-11");

        assertEquals(bigInt1.compareTo(bigInt2), 1);
        assertEquals(bigInt3.compareTo(bigInt2), 1);
    }

    @Test
    public void testCompareToEquals() {
        BigInteger bigInt1 = new BigInteger("11");
        BigInteger bigInt2 = new BigInteger("11");

        assertEquals(bigInt1.compareTo(bigInt2), 0);
    }

    @Test
    public void testCompareToZero() {
        BigInteger bigInt1 = new BigInteger(0);
        BigInteger bigInt2 = new BigInteger("-0");

        assertEquals(bigInt1.compareTo(bigInt2), 0);
    }
}
