public class BigInteger
{
    private long LInteger;
    private String SInteger;
    private String st;

    public BigInteger(long init) {
        LInteger = init;
        st = String.valueOf(LInteger);
    }

    public BigInteger(String init) {
        SInteger = init;
        st = SInteger;
    }

    public String toString() {
        char first = st.charAt(0);
        int x = st.length();
        while (first == '0' && x > 1){
            st = st.substring(1,st.length());
            first = st.charAt(0);
            x = st.length();
        }
        return st;
    }

    public boolean equals(Object other) {
      //  System.err.print("OBJ");
        if (other instanceof BigInteger) {
            BigInteger obj = (BigInteger) other;
            int check = st.compareTo(obj.st);
            return check == 0;
        } else {
            return false;
        }
    }

    public BigInteger clone(){
        BigInteger tmp = new BigInteger(st);
        return tmp;
    }

    public long toLong() {
        long x = Integer.parseInt(st);
        return x;
    }

    public int compareTo(BigInteger other){

        int x = st.length();
        int y = other.st.length();
        if (x > y) return(1); else if (x < y) return(-1);
        else {
            for (int i=0; i<=x-1; ++i){
                String t1; t1 = st.substring(i,i+1);
                int u = Integer.parseInt(t1);
                String t2; t2 = other.st.substring(i,i+1);
                int v = Integer.parseInt(t2);

                if (u > v) return 1;
                if (u < v) return -1;
            }
        }

        return 0;
    }

    private String sum(String s1, String s2){
        String s = "";
        int x = s1.length()-1;
        int y = s2.length()-1;

        while (x < y){
            s1 = "0" + s1;
            ++x;
        }

        while (y < x){
            s2 = "0" + s2;
            ++y;
        }

        int rmb = 0;
        for (int i=x; i>=0; --i){
            String t1; t1 = s1.substring(i,i+1);
            int u = Integer.parseInt(t1);
            String t2; t2 = s2.substring(i,i+1);
            int v = Integer.parseInt(t2);

            int t = u + v + rmb;
            if (t >= 10) {
                t = t - 10;
                rmb = 1;
            }
            else rmb = 0;

            s = String.valueOf(t) + s;
        }

        if (rmb == 1) s = "1" + s;
        return s;
    }

    public BigInteger add(BigInteger other) {

        BigInteger tmp = new BigInteger(st);
        tmp.st = sum(st,other.st);

        // return
        return tmp;
    }

    private  String minus(String s1, String s2){
        String s = "";

        int ok = 0; int check = s1.compareTo(s2);
        if (check == -1) {
            String tmp = s1;
            s1 = s2;
            s2 = tmp;
            ok = 1;
        }
        if (check == 0) return "0";

        int x = s1.length()-1;
        int y = s2.length()-1;

        while (x < y){
            s1 = "0" + s1;
            ++x;
        }

        while (y < x){
            s2 = "0" + s2;
            ++y;
        }


        int rmb = 0;
        for (int i=x; i>=0; --i){
            String t1; t1 = s1.substring(i,i+1);
            int u = Integer.parseInt(t1);
            String t2; t2 = s2.substring(i,i+1);
            int v = Integer.parseInt(t2);

            int t = u - v - rmb;
            if (t < 0) {
                t = t + 10;
                rmb = 1;
            }
            else rmb = 0;

            s = String.valueOf(t) + s;
        }

        char first = s.charAt(0);
        while (first == '0'){
            s = s.substring(1,s.length());
            first = s.charAt(0);
        }

        if (ok == 1) s = "-" + s;
        return s;
    }

    public BigInteger subtract(BigInteger other) {
        BigInteger tmp = new BigInteger(st);
        tmp.st = minus(st,other.st);

        return tmp;

    }
}
