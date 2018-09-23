import org.junit.Test;

import static org.junit.Assert.*;

public class BigIntegerTest {

    @Test
    public void addNormal() {
        BigInteger ac1 = new BigInteger(100L);
        BigInteger ac2 = new BigInteger(12L);
        BigInteger expected = ac1.add(ac2);
        BigInteger actual = new BigInteger(112L);
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
    public void addNormalWithBigNum() {
        BigInteger ac1 = new BigInteger("100000000000000");
        BigInteger ac2 = new BigInteger(1);
        BigInteger expected = ac1.add(ac2);
        BigInteger actual = new BigInteger("100000000000001");
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
    public void subtractBigNumWithNormal() {
        BigInteger ac1 = new BigInteger("999999999999999999");
        BigInteger ac2 = new BigInteger(1);
        BigInteger expected = ac1.subtract(ac2);
        BigInteger actual = new BigInteger("999999999999999998");
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

}