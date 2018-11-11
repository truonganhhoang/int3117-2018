public class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("-1111111111111111111111");
        BigInteger b = new BigInteger("-0000000000000000000000");
        System.out.println(a.subtract(b).toString());
    }
}
