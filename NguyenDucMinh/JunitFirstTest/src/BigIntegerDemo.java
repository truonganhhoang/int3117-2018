/**
 * Created by W10-PRO on 9/27/2016.
 */
public class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger ac1 = new BigInteger(100L);
        BigInteger ac2 = new BigInteger(12L);

        System.out.printf("first number is %s", ac1.toString());
        System.out.printf("\nsecond number is %d", ac2.toLong());

        BigInteger ac3 = ac1.clone();
        System.out.printf("\nclone of ac1 %s", ac3.toString());

        BigInteger sum = ac1.add(ac2);
        BigInteger sub = ac1.subtract(ac2);

        System.out.print("\nsum = " + sum + "\nsub = " + sub);

        int check = ac1.compareTo(ac2);
        char s;
        if (check == 1) s = '>'; else if (check == -1) s = '<'; else s = '=';
        System.out.print("\nac1 " + s + " ac2");

        boolean check1 = ac1.equals(ac2);
        if (check1) System.out.print("\nac1 = ac2"); else System.out.print("\nac1 != ac2");
    }
}
