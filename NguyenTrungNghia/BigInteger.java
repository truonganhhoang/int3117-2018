public class BigInteger
{
    private String arr;

    public BigInteger(long init) {
        arr = Long.toString(init);
    }

    public BigInteger(String init) {
        int i = init.charAt(0) == '-' ? 1 : 0;
        arr = init.charAt(0) == '-' ? "-" : "";
        while(i+1 < init.length() && init.charAt(i) == '0')
            i++;
        arr = arr + init.substring(i, init.length());
        if(arr.equals("-0")) arr = "0";
    }

    public String toString() {
        return arr;
    }

    public int compareTo(BigInteger other) {
        if(arr.charAt(0) == '-') {
            if(other.arr.charAt(0) == '-') {
                return -1 * inverse().compareTo(other.inverse());
            } else
                return -1;
        } else {
            if(other.arr.charAt(0) == '-')
                return 1;
            else {
                if(arr.length() < other.arr.length()) return -1;
                else if(arr.length() > other.arr.length()) return 1;
                else {
                    for(int i = 0; i < arr.length(); ++i)
                        if((int)arr.charAt(i) < (int)other.arr.charAt(i)) return -1;
                        else if((int)arr.charAt(i) > (int)other.arr.charAt(i)) return 1;
                    return 0;
                }
            }
        }

    }

    public boolean equals(Object other) {
        return arr.compareTo(other.toString()) == 0;
    }

    public long toLong() {
        return Long.parseLong(arr);
    }

    public BigInteger inverse() {
        if(arr.charAt(0) == '-') return new BigInteger(arr.substring(1, arr.length()));
        else return new BigInteger("-" + arr);
    }

    public BigInteger add(BigInteger other) {
        String a = toString();
        String b = other.toString();
        String c = new String("");
        BigInteger zero = new BigInteger(0);
        if(compareTo(zero) == -1) {
            if(other.compareTo(zero) == -1)
                return (inverse().add(other.inverse())).inverse();
            else
                return (other.subtract(inverse()));
        } else {
            if(other.compareTo(zero) == -1)
                return subtract(other.inverse());
            else {
                while(a.length() < b.length())
                    a = "0" + a;
                while(b.length() < a.length())
                    b = "0" + b;
                int m = 0;
                for(int i = a.length()-1; i >= 0; i--) {
                    c = String.valueOf((char)(((int)a.charAt(i) + (int)b.charAt(i) - 96  + m) % 10 + 48)) + c;
                    m = ((int)a.charAt(i) + (int)b.charAt(i) - 96  + m) / 10;
                }
                if(m > 0) c = "1" + c;
                return new BigInteger(c);
            }
        }
    }

    public BigInteger subtract(BigInteger other) {
        String a = toString();
        String b = other.toString();
        String c = new String("");
        BigInteger zero = new BigInteger(0);
        if(compareTo(zero) == -1) {
            if(other.compareTo(zero) == -1)
                return (other.inverse().subtract(inverse()));
            else
                return (inverse().add(other)).inverse();
        } else {
            if (other.compareTo(zero) == -1)
                return add(other.inverse());
            else {
                String sign = new String("");
                if(compareTo(other) == -1) {
                    c = a;
                    a = b;
                    b = c;
                    sign = "-";
                }
                c = "";
                int m = 0;
                while(b.length() < a.length())
                    b = "0" + b;
                for(int i = a.length()-1; i >= 0; --i) {
                    c = String.valueOf((char)(((int)a.charAt(i) - (int)b.charAt(i) - m + 10) % 10 + 48)) + c    ;
                    m = ((int)a.charAt(i) - (int)b.charAt(i) - m < 0 ? 1 : 0);
                }
                c = sign + c;
                return new BigInteger(c);
            }
        }
    }
    public BigInteger clone() {
        return new BigInteger(toString());
    }
}