import org.junit.Test;

import static org.junit.Assert.*;

public class BigIntegerTest {

    @Test
    public void addNormal() {
        BigInteger ac1 = new BigInteger(9L);
        BigInteger ac2 = new BigInteger(12L);
        BigInteger expected = ac1.add(ac2);
        BigInteger actual = new BigInteger(21L);
        assertEquals(expected, actual);
    }

    @Test
    public void addBigNum() {
        BigInteger ac1 = new BigInteger ("1000000000000000000000");
        BigInteger ac2 = new BigInteger("2000000000000000000000");
        BigInteger expected = ac1.add(ac2);
        BigInteger actual = new BigInteger("3000000000000000000000");
        assertEquals(expected, actual);
    }

    @Test
    public void addTestLengthBigNum() {
        BigInteger ac1 = new BigInteger("10");
        BigInteger ac2 = new BigInteger("1000");
        BigInteger expected = ac1.add(ac2);
        BigInteger actual = new BigInteger("1010");
        assertEquals(expected, actual);
    }

    @Test
    public void addNegative() {
        BigInteger ac1 = new BigInteger("100");
        BigInteger ac2 = new BigInteger(-1);
        BigInteger expected = ac1.add(ac2);
        BigInteger actual = new BigInteger("99");
        assertEquals(expected, actual);
    }


    @Test
    public void subtractNormal() {
        BigInteger ac1 = new BigInteger("100");
        BigInteger ac2 = new BigInteger(1);
        BigInteger expected = ac1.subtract(ac2);
        BigInteger actual = new BigInteger("99");
        assertEquals(expected, actual);
    }

    @Test
    public void subtractBigNum() {
        BigInteger ac1 = new BigInteger("300000000000000");
        BigInteger ac2 = new BigInteger("200000000000000");
        BigInteger expected = ac1.subtract(ac2);
        BigInteger actual = new BigInteger("100000000000000");
        assertEquals(expected, actual);
    }

    @Test
    public void subtractTestLengthBigNum() {
        BigInteger ac1 = new BigInteger("100");
        BigInteger ac2 = new BigInteger("1000000000");
        BigInteger expected = ac1.subtract(ac2);
        BigInteger actual = new BigInteger("-999999900");
        assertEquals(expected, actual);
    }

    @Test
    public void subtractNegative() {
        BigInteger ac1 = new BigInteger("999999999999999999");
        BigInteger ac2 = new BigInteger(-1);
        BigInteger expected = ac1.subtract(ac2);
        BigInteger actual = new BigInteger("100000000000000000");
        assertEquals(expected, actual);
    }

    @Test
    public void compareToSmaller() {
        BigInteger ac1 = new BigInteger("100");
        BigInteger ac2 = new BigInteger("1000000000");
        int expected = ac1.compareTo(ac2);
        int actual = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void compareToSameLength() {
        BigInteger ac1 = new BigInteger("9000000000");
        BigInteger ac2 = new BigInteger("1000000000");
        int expected = ac1.compareTo(ac2);
        int actual = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void compareToEqual() {
        BigInteger ac1 = new BigInteger("1000000000");
        BigInteger ac2 = new BigInteger("1000000000");
        int expected = ac1.compareTo(ac2);
        int actual = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void toStringDeleteZero() {
        BigInteger ac1 = new BigInteger("000100");
        String expected = ac1.toString();
        String actual = "100";
        assertEquals(expected, actual);
    }

    @Test
    public void cloneBignum() {
        BigInteger ac1 = new BigInteger("1000");
        BigInteger expected = new BigInteger("1000");
        BigInteger actual = ac1.clone();
        assertEquals(expected, actual);
    }

    @Test
    public void testEqual() {
        BigInteger ac1 = new BigInteger("1000");
        int ac2 = 1000;
        boolean expected = false;
        boolean actual = ac1.equals(ac2);
        assertEquals(expected, actual);
    }

    @Test
    public void testToLong() {
        BigInteger ac1 = new BigInteger("1000");
        long actual = 1000;
        long expected = ac1.toLong();
        assertEquals(expected, actual);
    }

}