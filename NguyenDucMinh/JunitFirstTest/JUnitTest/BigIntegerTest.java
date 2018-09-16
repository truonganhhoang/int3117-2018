import org.junit.Test;

import static org.junit.Assert.*;

public class BigIntegerTest {

    @Test
    public void addNormal() {
        BigInteger ac1 = new BigInteger(100L);
        BigInteger ac2 = new BigInteger(12L);
        BigInteger sum = ac1.add(ac2);
        BigInteger result = new BigInteger(112L);
        assertEquals(sum, result);
    }

    @Test
    public void addBigNum() {
        BigInteger ac1 = new BigInteger ("1000000000000000000000");
        BigInteger ac2 = new BigInteger("2000000000000000000000");
        BigInteger sum = ac1.add(ac2);
        BigInteger result = new BigInteger("3000000000000000000000");
        assertEquals(sum, result);
    }

    @Test
    public void addNormalWithBigNum() {
        BigInteger ac1 = new BigInteger("100000000000000");
        BigInteger ac2 = new BigInteger(1);
        BigInteger sum = ac1.add(ac2);
        BigInteger result = new BigInteger("100000000000001");
        assertEquals(sum, result);
    }

    @Test
    public void addNegative() {
        BigInteger ac1 = new BigInteger("100");
        BigInteger ac2 = new BigInteger(-1);
        BigInteger sum = ac1.add(ac2);
        BigInteger result = new BigInteger("99");
        assertEquals(sum, result);
    }


    @Test
    public void subtractNormal() {
        BigInteger ac1 = new BigInteger("100");
        BigInteger ac2 = new BigInteger(1);
        BigInteger subtract = ac1.subtract(ac2);
        BigInteger result = new BigInteger("99");
        assertEquals(subtract, result);
    }

    @Test
    public void subtractBigNum() {
        BigInteger ac1 = new BigInteger("300000000000000");
        BigInteger ac2 = new BigInteger("200000000000000");
        BigInteger subtract = ac1.subtract(ac2);
        BigInteger result = new BigInteger("100000000000000");
        assertEquals(subtract, result);
    }

    @Test
    public void subtractBigNumWithNormal() {
        BigInteger ac1 = new BigInteger("999999999999999999");
        BigInteger ac2 = new BigInteger(1);
        BigInteger subtract = ac1.subtract(ac2);
        BigInteger result = new BigInteger("999999999999999998");
        assertEquals(subtract, result);
    }

    @Test
    public void subtractNegative() {
        BigInteger ac1 = new BigInteger("999999999999999999");
        BigInteger ac2 = new BigInteger(-1);
        BigInteger subtract = ac1.subtract(ac2);
        BigInteger result = new BigInteger("100000000000000000");
        assertEquals(subtract, result);
    }

}