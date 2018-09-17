public class BigInteger
{
    private static int numberOfDigit = 15; //number of digits store in a element
    private static long base = (long) 1e15;
    private long[] value; //store elements
    private int l; // number of elements
    private int signum; //0: this = 0, -1: this < 0; 1: this > 0;

    public BigInteger() {}

    public BigInteger(long init) {
        long tmp = Math.abs(init);

        l = 0;
        while (tmp > 0) {
            l++;
            tmp /= base;
        }

        value = new long[l];
        tmp = Math.abs(init);

        if (tmp == 0) value[0] = 0;
        else
            for (int i = 0; i < l ; ++i) {
                value[i] = tmp % base;
                tmp /= base;
            }

        if (init < 0) signum = -1;
        else
            if (init > 0) signum = 1;
            else signum = 0;
    }

    public BigInteger(String init) {
        if ('-' == init.charAt(0)) {
            signum = -1;
            init = init.substring(1);
        }
        else signum = 1;


        int j = 0;
        while ('0' == init.charAt(j) && j != init.length() - 1) ++j;
        init = init.substring(j, init.length());

        l = (init.length() - 1) / numberOfDigit + 1;

        while (init.length() < l * numberOfDigit) init = '0' + init;
        value = new long[l];

        l = 0;

        for (int i = init.length() - numberOfDigit; i >= 0; i -= numberOfDigit)
            value[l++] = Long.parseLong(init.substring(i, i + numberOfDigit));

        if (1 == l && 0 == value[0]) signum = 0;
    }

    public void setSignum(int s) {
        signum = s;
    }

    BigInteger negative() {
        BigInteger res = this.clone();
        res.setSignum(-res.signum);
        return res;
    }

    private void negate() {
        signum = -signum;
    }

    public String toString() {
        String res = "";

        for (int i = 0; i < l - 1; ++i)
            res = String.format("%015d", value[i]) + res;

        res = String.valueOf(value[l - 1]) + res;

        if (-1 == signum) res = '-' + res;

        return res;
    }

    public boolean equals(Object other) {
        return this.toString().equals(other.toString());
    }

    public long toLong() {
        long res = 0;
        long tmp = 1;

        for (int i = 0; i < l; ++i) {
            res += value[i] * tmp;
            tmp = tmp * base;
        }

        if (-1 == signum) res = -res;

        return res;
    }

    public BigInteger add(BigInteger other) {
        if (signum == 0) return other.clone(); // this == 0
        if (other.signum == 0) return this.clone(); // other == 0

        if (signum != other.signum) return this.subtract(other.negative()); //-a + b or a + -b

        BigInteger res = new BigInteger();
        res.setSignum(signum);

        res.l = Math.max(this.l, other.l);
        res.value = new long[res.l + 1];

        long carry = 0; //carry

        for (int i = 0; i < res.l; ++i) {
            long tmp = (i >= this.l ? 0 : this.value[i]) +
                    (i >= other.l ? 0 : other.value[i]) + carry;
            res.value[i] = tmp % base;
            carry = tmp / base;
        }

        if (carry > 0) res.value[res.l++] = carry;

        return res;
    }

    public BigInteger subtract(BigInteger other) {
        if (signum == 0) return other.negative(); // this == 0
        if (other.signum == 0) return this.clone();// other == 0

        if (signum != other.signum) return this.add(other.negative()); //-a - b or a - -b

        BigInteger res = new BigInteger();
        res.signum = this.signum;

        res.l = Math.max(this.l, other.l);
        res.value = new long[res.l];

        if (this.compareAbsTo(other) == 1) {
            long carry = 0;
            for (int i = 0; i < this.l; ++i) {
                res.value[i] = (this.value[i])
                        - (i >= other.l ? 0 : other.value[i]) - carry;
                if (res.value[i] < 0) {
                    res.value[i] += base;
                    carry = 1;
                } else carry = 0;
            }
        } //case: |a| > |b|
        else {
            long carry = 0;
            for (int i = 0; i < other.l; ++i) {
                res.value[i] = other.value[i] - (i >= this.l ? 0 : this.value[i]) - carry;

                if (res.value[i] < 0) {
                    res.value[i] += base;
                    carry = 1;
                } else carry = 0;
            }

            res.negate();
        } //case |a| < |b|

        while (res.l > 1 && res.value[res.l - 1] == 0) --res.l;

        return res;
    }

    private int compareAbsTo(BigInteger other) {
        if (this.l < other.l) return -1;
        else
        if (this.l > other.l) return 1;

        for (int i = this.l - 1; i >= 0; --i)
            if (this.value[i] < other.value[i]) return -1;
            else
            if (this.value[i] > other.value[i]) return 1;

        return 0;
    }

    public int compareTo(BigInteger other) {
        if (signum == other.signum) {
            int tmp = compareAbsTo(other);
            if (signum >= 0) return tmp;
            return -tmp;
        }
        else {
            if (signum < other.signum) return -1;
            if (signum > other.signum) return 1;
            return 0;
        }
    }

    public BigInteger clone() {
        BigInteger tmp = new BigInteger();
        tmp.l = this.l;
        tmp.value = this.value;
        tmp.signum = this.signum;

        return tmp;
    }
}
