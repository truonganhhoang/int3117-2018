/**
 * Created by Daniel Cruise on 03/10/2016.
 */
public class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger big1 = new BigInteger(11112);
        BigInteger big2 = new BigInteger(1245);
        BigInteger big3 = big1.clone();
        System.out.println(big1.toString());
        System.out.println(big2.toString());
        System.out.println(big3.toString());
        BigInteger sum = big1.add(big3);
        System.out.println(sum.toString());
        BigInteger big4 = new BigInteger("1111111111111111111111111111111111");
        BigInteger big5 = new BigInteger("1111111111111111111111111111111111");
        System.out.println(big4.compareTo(big5));
        System.out.println(big1.equals(big2));
        BigInteger big6 = new BigInteger("12345");
        System.out.println(big6.toLong());


    }
}

