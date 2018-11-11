import java.util.Random;

/**
 * Created by Bach on 24-9-2016.
 */
public class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger bigInt1 = new BigInteger("157125725678256372658925672385624987285739856289568293473289563289563295");
        BigInteger bigInt2 = new BigInteger("2584279265278943564789235623794854236872936987238698379999999999999999385423564239773823");

        BigInteger sum = bigInt1.add(bigInt2);
        BigInteger diff = bigInt1.subtract(bigInt2);
        System.out.println(sum.toString());
        System.out.println(diff.toString());
    }
}
