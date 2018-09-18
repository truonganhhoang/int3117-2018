import junit.framework.TestCase;

public class BigIntegerTest extends TestCase
{
    
    public BigIntegerTest(String name) {
        super(name);
    }

    public void testCreateBigIntegerFromInt()
    {
        BigInteger bigInt = new BigInteger(10L);
        assertEquals("10", bigInt.toString());
    }

    
    public void testCreateBigIntegerFromStringWithLeadingZero()
    {
        BigInteger bigInt = new BigInteger("010");
        assertEquals("10", bigInt.toString());
    }

    
    public void testCreateBigIntegerFromStringWithAllZeros()
    {
        BigInteger bigInt = new BigInteger("000");
        assertEquals("0", bigInt.toString());
    }

    
    public void testCreateBigIntegerFromStringWithAllButUnitZeros()
    {
        BigInteger bigInt = new BigInteger("001");
        assertEquals("1", bigInt.toString());
    }

    
    public void testConvertToLongWhenNotOverRange()
    {
        BigInteger bigInt = new BigInteger("10");
        assertEquals(10L, bigInt.toLong());
    }

    
    public void testEquality()
    {
        BigInteger bigInt1 = new BigInteger(-10L);
        BigInteger bigInt2 = new BigInteger(-10L);
        BigInteger bigInt3 = new BigInteger("-10");

        assertEquals(bigInt1, bigInt2);
        assertEquals(bigInt1, bigInt3);
    }

    
    public void testInequality()
    {
        BigInteger bigInt1 = new BigInteger(10L);
        BigInteger bigInt2 = new BigInteger(12L);

        assertFalse(bigInt1.equals(bigInt2));
    }

    
    public void testAdditionWithoutCarryOn()
    {
        BigInteger bigInt1 = new BigInteger("-111111111111111111111");
        BigInteger bigInt2 = new BigInteger("-1");
        BigInteger sum = bigInt1.add(bigInt2);

        assertEquals(new BigInteger("-111111111111111111112"), sum);
    }

    
    public void testAdditionWithCarryOn()
    {
        BigInteger bigInt1 = new BigInteger("-111111111111111111111");
        BigInteger bigInt2 = new BigInteger("-999999999999999999999");
        BigInteger sum = bigInt1.add(bigInt2);

        assertEquals(new BigInteger("-1111111111111111111110"), sum);
    }

    
    public void testSubtractionWithoutCarryOn()
    {
        BigInteger bigInt1 = new BigInteger("111111111111111111111");
        BigInteger bigInt2 = new BigInteger("111111111111111111111");
        BigInteger difference = bigInt1.subtract(bigInt2);

        assertEquals(new BigInteger("0"), difference);
    }

    
    public void testSubtractionWithCarryOn()
    {
        BigInteger bigInt1 = new BigInteger("-100000000000000000001");
        BigInteger bigInt2 = new BigInteger("-99999999999999999999");
        BigInteger difference = bigInt1.subtract(bigInt2);
        assertEquals(new BigInteger(-2L), difference);
    }

    
    public void testClone(){
        BigInteger bigInt1 = new BigInteger("-0");
        BigInteger bigInt2 = new BigInteger("0");
        BigInteger bigInt3 = bigInt1.clone();
        assertEquals(new BigInteger(0), bigInt1);
        assertEquals(new BigInteger(-0), bigInt2);
        assertEquals(bigInt3, bigInt1);
        assertEquals(bigInt3, bigInt2);
    }
    
    public void testDifferentSignSubtractions(){
        BigInteger bigInt1 = new BigInteger("-100000000000000000001");
        BigInteger bigInt2 = new BigInteger("99999999999999999999");
        BigInteger difference1 = bigInt1.subtract(bigInt2);
        BigInteger difference2 = bigInt2.subtract(bigInt1);
        assertEquals(new BigInteger("-200000000000000000000"), difference1);
        assertEquals(new BigInteger("200000000000000000000"), difference2);
    }
    
    public void testDifferentSignAdd(){
        BigInteger bigInt1 = new BigInteger("-100000000000000000001");
        BigInteger bigInt2 = new BigInteger("99999999999999999999");
        BigInteger difference1 = bigInt1.add(bigInt2);
        BigInteger difference2 = bigInt2.add(bigInt1);
        assertEquals(new BigInteger("-2"), difference1);
        assertEquals(new BigInteger("-2"), difference2);
    }
    
    public void testCompareTo(){
        BigInteger bigInt1 = new BigInteger("-0");

        assertEquals(bigInt1.compareTo(new BigInteger(0)), 0);
        assertEquals(bigInt1.compareTo(new BigInteger(1)),-1);
        assertEquals(bigInt1.compareTo(new BigInteger(-1)),1);
    }

    
    public void testLeadingZero() {
        BigInteger bigInt1 = new BigInteger("-0000000000000000000001000");
        BigInteger bigInt2 = new BigInteger("-0000000000000000000000000000000000001001");
        BigInteger diff1 = bigInt1.subtract(bigInt2);
        BigInteger diff2 = bigInt2.subtract(bigInt1);

        assertEquals(diff1, new BigInteger(1L));
        assertEquals(diff2, new BigInteger("-0000000000000000000000000000000000000001"));

    }
}