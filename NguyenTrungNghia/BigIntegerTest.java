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
        BigInteger bigInt = new BigInteger("010");
        assertEquals("10", bigInt.toString());
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
        BigInteger bigInt1 = new BigInteger(-10L);
        BigInteger bigInt2 = new BigInteger(-10L);
        BigInteger bigInt3 = new BigInteger("-10");

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
        BigInteger bigInt1 = new BigInteger("-111111111111111111111");
        BigInteger bigInt2 = new BigInteger("-1");
        BigInteger sum = bigInt1.add(bigInt2);

        assertEquals(new BigInteger("-111111111111111111112"), sum);
    }

    @Test
    public void testAdditionWithCarryOn()
    {
        BigInteger bigInt1 = new BigInteger("-111111111111111111111");
        BigInteger bigInt2 = new BigInteger("-999999999999999999999");
        BigInteger sum = bigInt1.add(bigInt2);

        assertEquals(new BigInteger("-1111111111111111111110"), sum);
    }

    @Test
    public void testSubtractionWithoutCarryOn()
    {
        BigInteger bigInt1 = new BigInteger("111111111111111111111");
        BigInteger bigInt2 = new BigInteger("111111111111111111111");
        BigInteger difference = bigInt1.subtract(bigInt2);

        assertEquals(new BigInteger("0"), difference);
    }

    @Test
    public void testSubtractionWithCarryOn()
    {
        BigInteger bigInt1 = new BigInteger("-100000000000000000001");
        BigInteger bigInt2 = new BigInteger("-99999999999999999999");
        BigInteger difference = bigInt1.subtract(bigInt2);
        assertEquals(new BigInteger(-2L), difference);
    }

    @Test
    public void testClone(){
        BigInteger bigInt1 = new BigInteger("-0");
        BigInteger bigInt2 = new BigInteger("0");
        BigInteger bigInt3 = bigInt1.clone();
        assertEquals(new BigInteger(0), bigInt1);
        assertEquals(new BigInteger(-0), bigInt2);
        assertEquals(bigInt3, bigInt1);
        assertEquals(bigInt3, bigInt2);
    }
    @Test
    public void testDifferentSignSubtractions(){
        BigInteger bigInt1 = new BigInteger("-100000000000000000001");
        BigInteger bigInt2 = new BigInteger("99999999999999999999");
        BigInteger difference1 = bigInt1.subtract(bigInt2);
        BigInteger difference2 = bigInt2.subtract(bigInt1);
        assertEquals(new BigInteger("-200000000000000000000"), difference1);
        assertEquals(new BigInteger("200000000000000000000"), difference2);
    }
    @Test
    public void testDifferentSignAdd(){
        BigInteger bigInt1 = new BigInteger("-100000000000000000001");
        BigInteger bigInt2 = new BigInteger("99999999999999999999");
        BigInteger difference1 = bigInt1.add(bigInt2);
        BigInteger difference2 = bigInt2.add(bigInt1);
        assertEquals(new BigInteger("-2"), difference1);
        assertEquals(new BigInteger("-2"), difference2);
    }
    @Test
    public void testCompareTo(){
        BigInteger bigInt1 = new BigInteger("-0");

        assertEquals(bigInt1.compareTo(new BigInteger(0)), 0);
        assertEquals(bigInt1.compareTo(new BigInteger(1)),-1);
        assertEquals(bigInt1.compareTo(new BigInteger(-1)),1);
    }

    @Test
    public void testLeadingZero() {
        BigInteger bigInt1 = new BigInteger("-0000000000000000000001000");
        BigInteger bigInt2 = new BigInteger("-0000000000000000000000000000000000001001");
        BigInteger diff1 = bigInt1.subtract(bigInt2);
        BigInteger diff2 = bigInt2.subtract(bigInt1);

        assertEquals(diff1, new BigInteger(1L));
        assertEquals(diff2, new BigInteger("-0000000000000000000000000000000000000001"));

    }
}