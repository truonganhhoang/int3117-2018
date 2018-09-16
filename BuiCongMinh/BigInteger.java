public class BigInteger
{
    private String theNumber;

    public BigInteger(long init) {
     theNumber = String.valueOf(init);
    }

    public BigInteger(String init) {
     theNumber = init;
    }

    public String toString() {
        int i = 0;
        String sign = "";
        if(theNumber.charAt(i) == '-') {
            ++i;
            sign = "-";
        }
        while(theNumber.charAt(i) == '0' && i != theNumber.length() - 1) {
            ++i;
        }
        return theNumber.substring(i).compareTo("0") == 0? "0" : sign + theNumber.substring(i) ;
    }

    private int positiveCompareTo(BigInteger other) {
        String a = this.toString();
        String b = other.toString();
        if(a.compareTo(b) == 0) return 0;
        else if(a.length() > b.length()) {
            return 1;
        }
        else if(a.length() < other.theNumber.length()) {
            return -1;
        }
        else {
            for(int i = 0; i < theNumber.length(); ++i) {
                if(theNumber.charAt(i) > other.theNumber.charAt(i)) return 1;
                if(theNumber.charAt(i) < other.theNumber.charAt(i)) return -1;
            }
        }
        return 0;
    }

    public int compareTo(BigInteger other) {
        String a = this.toString();
        String b = other.toString();
        if(a.charAt(0) == '-' && b.charAt(0) == '-') {
            BigInteger subA = new BigInteger(a.substring(1));
            BigInteger subB = new BigInteger(b.substring(1));
            return -subA.positiveCompareTo(subB);
        }
        if(a.charAt(0) == '-') return -1;
        if(b.charAt(0) == '-') return 1;
        return this.positiveCompareTo(other);
    }

    public boolean equals(Object other) {
        String a = this.toString();
		String b = other.toString();
        return a.compareTo(b) == 0;
    }

    public long toLong() {
        return Long.parseLong(theNumber);
    }

    private BigInteger positiveAdd(BigInteger other) {
        String a = this.toString();
        String b = other.toString();
        String result = "";
        int surplus = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while(i >= 0 && j >= 0) {
            result = String.valueOf(((int)a.charAt(i) + (int)b.charAt(j) - 96 + surplus) % 10) + result;
            surplus = ((int)a.charAt(i) + (int)b.charAt(j) - 96 + surplus)/10;
            --i; --j;
        }
        while (i >= 0) {
            result = String.valueOf(((int)a.charAt(i) - 48 + surplus) % 10) + result;
            surplus = ((int)a.charAt(i) - 48 + surplus)/10;
            --i;
        }
        while (j >= 0) {
            result = String.valueOf(((int)b.charAt(j) - 48 + surplus) % 10) + result;
            surplus = ((int)b.charAt(j) - 48 + surplus)/10;
            --j;
        }
        if(surplus != 0) result = "1" + result;
        return new BigInteger(result);
    }

    private BigInteger positiveSubtract(BigInteger other) {
        String a = this.toString();
        String b = other.toString();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carryOn = 0;
        String result = "";
        while (j >= 0) {
            result = String.valueOf((int)a.charAt(i) >= ((int)b.charAt(j) + carryOn) ?
                    ((int)a.charAt(i) - (int)b.charAt(j) - carryOn) :
                    ((int)a.charAt(i) - (int)b.charAt(j) - carryOn + 10)) + result;
            carryOn = (int)a.charAt(i) >= ((int)b.charAt(j)+carryOn) ? 0 : 1;
            --i;
            --j;
        }
        while (i >= 0) {
            result = String.valueOf((int) a.charAt(i) >= carryOn ?
                    ((int) a.charAt(i) - carryOn - 48) :
                    ((int) a.charAt(i) - carryOn - 38)) + result;
            carryOn = (int) a.charAt(i) >= carryOn ? 0 : 1;
            --i;
        }
        return new BigInteger(new BigInteger(result).toString());
    }

    public BigInteger add(BigInteger other) {
        String a = this.toString();
        String b = other.toString();
        if(a.charAt(0) == '-' && b.charAt(0) == '-') {
            BigInteger subA = new BigInteger(a.substring(1));
            BigInteger subB = new BigInteger(b.substring(1));
            return new BigInteger("-" + subA.positiveAdd(subB).toString());
        }
        else if(a.charAt(0) == '-') {
            BigInteger subA = new BigInteger(a.substring(1));
            BigInteger subB = new BigInteger(b);
            return subB.subtract(subA);
        }
        else if(b.charAt(0) == '-') {
            BigInteger subA = new BigInteger(a);
            BigInteger subB = new BigInteger(b.substring(1));
            return subA.subtract(subB);
        }
        return this.positiveAdd(other);
    }

    public BigInteger subtract(BigInteger other) {
        String a = this.toString();
        String b = other.toString();
        if(this.compareTo(other) == 0) return new BigInteger(0);
        if(b.charAt(0) == '-') return this.add(new BigInteger(b.substring(1)));
        if(a.charAt(0) == '-') return this.add(new BigInteger("-" + b));
        if(this.compareTo(other) == 1) return this.positiveSubtract(other);
        return new BigInteger("-" + other.positiveSubtract(this).toString());
    }

    public BigInteger clone() {
        return new BigInteger(this.toString());
    }
}
