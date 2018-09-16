import org.junit.*;
import static org.junit.Assert.*;

public class Testing
{
    @Test
    public void testCreate()
    {
        BigInteger bigI = new BigInteger(1234L);
        assertEquals("1234", bigI.toString());
        BigInteger bigS = new BigInteger("0111102010");
        assertEquals("111102010", bigS.toString());
        bigS = new BigInteger("0000000");
        assertEquals("0", bigS.toString());
        bigS = new BigInteger("009");
        assertEquals("9", bigS.toString());
    }

    @Test
    public void testConvert()
    {
        BigInteger bigI = new BigInteger("0709");
        assertEquals(709L, bigI.toLong());
    }

    @Test
    public void testEquality()
    {
        BigInteger bigInt1 = new BigInteger(12345L);
        BigInteger bigInt2 = new BigInteger(12345L);
        BigInteger bigInt3 = new BigInteger("00012345");

        assertEquals(bigInt1, bigInt2);
        assertEquals(bigInt1, bigInt3);

        BigInteger bigInt4 = new BigInteger(12346L);

        assertFalse(bigInt1.equals(bigInt4));
        assertTrue(bigInt1.equals(bigInt3));
    }

    @Test
    public void testAddition()
    {
        BigInteger bigInt1 = new BigInteger("9999999999999999999");
        BigInteger bigInt2 = new BigInteger("0");
        BigInteger sum = bigInt1.add(bigInt2);

        assertEquals(new BigInteger("9999999999999999999"), sum);

        BigInteger bigInt3 = new BigInteger("1");
        sum = bigInt1.add(bigInt3);

        assertEquals(new BigInteger("10000000000000000000"), sum);
    }

    @Test
    public void testSubtraction()
    {
        BigInteger bigInt1 = new BigInteger("111111111111111111111");
        BigInteger bigInt2 = new BigInteger("1");
        BigInteger difference = bigInt1.subtract(bigInt2);

        assertEquals(new BigInteger("111111111111111111110"), difference);

        BigInteger bigInt3 = new BigInteger("9");
        difference = bigInt1.subtract(bigInt3);

        assertEquals(new BigInteger("111111111111111111102"), difference);
    }
    
    @Test
    public void testForFun() {
        BigInteger bitInt1= new BigInteger(-155);
        BigInteger bitInt2= new BigInteger(149);
        BigInteger middle= bitInt1.add(bitInt2);
        assertEquals("-6", middle.toString());
    }
}
