public class BigInteger
{
    String value = new String();

    public BigInteger(long init) {
        while (init > 0) {
            value += (char)(init % 10 + 48);
            init /= 10L;
        }
    }

    public BigInteger(String init) {
        String reverse = new String();
        int pos = 0;
        for (int i = 0; i <= init.length() - 2; i++) {
            if (init.charAt(i) == '0') pos++;
            else break;
        }
        for (int i = init.length() - 1; i >= pos; i--) {
            reverse += init.charAt(i);
        }
        value = reverse;
    }

    public String toString() {
        String reverce = new String();
        for (int i = value.length() - 1; i >= 0; i--) {
            reverce += value.charAt(i);
        }
        return reverce;
    }

    public boolean equals(Object other) {
        if (other instanceof BigInteger) {
            BigInteger another = (BigInteger) other;
            if (another.value.length() == value.length()) {
                for (int i = 0; i < value.length(); i++) {
                    if (another.value.charAt(i) != value.charAt(i)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public long toLong() {
        int res = 0;
        for (int i = value.length() - 1; i >= 0; i--) {
            res = res * 10 + (int)value.charAt(i) - 48;
        }
        return res;
    }

    public BigInteger add(BigInteger other) {
        BigInteger res = new BigInteger(0L);
        int maxLength = Math.max(other.value.length(), value.length());
        for (int i = value.length(); i < maxLength; i++) {
            value += '0';
        }
        for (int i = other.value.length(); i < maxLength; i++) {
            other.value += '0';
        }
        int rem = 0;
        for (int i = 0; i < maxLength; i++) {
            int x1 = value.charAt(i) - 48;
            int x2 = other.value.charAt(i) - 48;
            int add = x1 + x2 + rem;
            if (add > 9) {
                rem = 1;
                add -= 10;
            } else {
                rem = 0;
            }
            res.value += (char)(add + 48);
        }
        if (rem == 1) {
            res.value += '1';
        }
        return res;
    }

    public BigInteger clone() {
        BigInteger res = new BigInteger(0);
        res.value = value;
        return res;
    }

    public BigInteger subtract(BigInteger other) {
        BigInteger res = new BigInteger(0L);
        int maxLength = Math.max(other.value.length(), value.length());
        for (int i = value.length(); i < maxLength; i++) {
            value += '0';
        }
        for (int i = other.value.length(); i < maxLength; i++) {
            other.value += '0';
        }
        int rem = 0;
        for (int i = 0; i < maxLength; i++) {
            int x1 = value.charAt(i) - 48;
            int x2 = other.value.charAt(i) - 48;
            int sub = x1 - x2 - rem;
            if (sub < 0) {
                rem = 1;
                sub += 10;
            } else {
                rem = 0;
            }
            res.value += (char)(sub + 48);
        }
        int pos = 0;
        for (int i = res.value.length() - 1; i >= 1; i--) {
            if (res.value.charAt(i) != '0') {
                pos = i;
                break;
            }
        }
        res.value = res.value.substring(0, pos + 1);
        return res;
    }

    public int compareTo(BigInteger other) {
        int len1 = value.length();
        int len2 = other.value.length();
        if (len1 < len2) return -1;
        if (len1 > len2) return 1;
        for (int i = len1 - 1; i >= 0; i--) {
            if (value.charAt(i) < other.value.charAt(i)) return -1;
            if (value.charAt(i) > other.value.charAt(i)) return 1;
        }
        return 0;
    }
}
