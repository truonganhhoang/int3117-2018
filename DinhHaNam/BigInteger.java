public class BigInteger
{
    private int[] bigInt;

    private int Size (String s) {
        int n = s.length()/9;
        if (s.length()%9 != 0)
            n++;
        return n;
    }

    public BigInteger(long initlong) {
        int n = 1;
        int s = 0;
        if (initlong < 0) {
            n = -1;
            initlong = 0-initlong;
        }
        if (initlong == 0)
            s =0;
        else
            s = (int) Math.floor(Math.log10(initlong));
        s++;
        if (s%9 != 0)
            s = s/9 + 1;
        s++;
        bigInt = new int[s];
        bigInt[0] = n;
        bigInt[1] = 0;
        while (initlong > 0) {
            int i = 1;
            bigInt[s-i] = (int) (initlong%1000000000);
            initlong = (int) Math.floor(initlong/1000000000);
        }
    }

    public BigInteger(String init) {
        int n = 1;
        String bigint = init;
        if (bigint.charAt(0) == '-') {
            n = -1;
            bigint = bigint.substring(1);
        }
        while (bigint.charAt(0) == '0' && bigint.length() > 1)
            bigint = bigint.substring(1);
        int size = Size(bigint);
        bigInt = new int[size + 1];
        bigInt[0] = n;
        for (int i = 0;i < size-1;i++) {
            bigInt[size-i] = Integer.parseInt(bigint.substring(bigint.length()-9));
            bigint = bigint.substring(0,bigint.length()-9);
        }
        bigInt[1] = Integer.parseInt(bigint);
    }

    public String toString() {
        String bigint = null;
        int size = bigInt.length-1;
        if (bigInt[0] == -1)
            bigint = String.format("-%d",bigInt[1]);
        else
            bigint = String.format("%d",bigInt[1]);
        for (int i = 2;i <= size;i++)
            bigint = bigint.concat(String.format("%09d",bigInt[i]));
        return bigint;
    }

    public boolean equals(Object other) {
        String Other = other.toString();
        if (Other.equals(this.toString()))
            return true;
        return false;
    }

    public long toLong() {
        String n = toString();
        long m = Long.parseLong(n);
        return m;
    }

    public BigInteger add(BigInteger other) {
        String s = other.toString();
        if (s.charAt(0) == '-')
            s = s.substring(1);
        else
            s = "-".concat(s);
        BigInteger New = new BigInteger(s);
        New = subtract(New);
        return New;
    }

    public BigInteger subtract(BigInteger other) {
        String Other = other.toString();
        String result = null;
        int s=0;
        int no;
        int thisSize = Size(toString());
        int otherSize = Size(Other);
        if (Other.charAt(0) == '-') {
            no = -1;
            Other = Other.substring(1);
        }
        else
            no = 1;
        if (no != bigInt[0])
            for (int i=0;i < thisSize-1 || i < otherSize-1;i++) {
                if (thisSize-i > 0)
                    s += bigInt[thisSize-i];
                if (otherSize-i > 1) {
                    s += Integer.parseInt(Other.substring(Other.length()-9));
                    Other = Other.substring(0,Other.length()-9);
                }
                if (otherSize-i == 1)
                    s += Integer.parseInt(Other);
                if (result == null)
                    result = String.format("%09d",s%1000000000);
                else
                    result = String.format("%09d",s%1000000000).concat(result);
                s = (s > 999999999) ? 1:0;
            }
        else
            for (int i=0;i < thisSize-1 || i < otherSize-1;i++) {
                if (thisSize-i > 0)
                    s += bigInt[thisSize-i];
                if (otherSize-i > 1) {
                    s -= Integer.parseInt(Other.substring(Other.length()-9));
                    Other = Other.substring(0,Other.length()-9);
                }
                if (otherSize-i == 1)
                    s -= Integer.parseInt(Other);
                if (result == null)
                    result = String.format("%09d",(s + 1000000000)%1000000000);
                else
                    result = String.format("%09d",(s + 1000000000)%1000000000).concat(result);
                s = (s < 0) ? -1:0;
            }
        if (bigInt[0] == -1)
            s = 0-s;
        if (thisSize >= otherSize) {
            if (bigInt[0] == 1)
                s += bigInt[1];
            else
                s -= bigInt[1];
        }
        if (otherSize >= thisSize) {
            if (no == -1)
                s += Integer.parseInt(Other);
            else
                s -= Integer.parseInt(Other);
        }
        if (result == null)
            result = String.format("%d",s);
        else
            result = String.format("%d",s).concat(result);
        BigInteger New = new BigInteger(result);
        return New;
    }

    public int compareTo (BigInteger other) {
        other = subtract(other);
        if (other.toString().charAt(0) == '0')
            return 0;
        if (other.toString().charAt(0) == '-')
            return -1;
        return 1;
    }

    public BigInteger clone() {
        BigInteger New = new BigInteger(toString());
        return New;
    }
}
