public class BigInteger
{
    long alter;
    String saveSpot;

    public BigInteger(long init) {
        alter= (init < 0) ? -1 : 1;
        saveSpot= Long.toString(Math.abs(init));
        saveSpot= new StringBuffer(saveSpot).reverse().toString();
    }

    public BigInteger(String init) {
        if (init.charAt(0) == '-') {
            alter= -1;
            saveSpot= init.substring(1);
            saveSpot= new StringBuffer(saveSpot).reverse().toString();
        }
        else {
            alter= 1;
            saveSpot= init;
            saveSpot= new StringBuffer(saveSpot).reverse().toString();
        }
        int i= saveSpot.length();
        while (saveSpot.charAt(i-1)== '0') {
            if (i==1) break;
            i--;
        }
        saveSpot= saveSpot.substring(0,i);
    }

    public BigInteger(long init, String init2) {
        alter= init;
        saveSpot= init2;
    }

    public String toString() {
        String ss= new StringBuffer(saveSpot).reverse().toString();
        if (alter== 1)
            return ss;
        else return "-" + ss;
    }

    public boolean equals(Object other) {
        String ss= other.toString();
        if (this.toString().equals(ss)) return true;
        else return false;
    }

    public long toLong() {
        String ss= new StringBuffer(saveSpot).reverse().toString();
        if (alter== 1)
            return Long.parseLong(ss);
        else return -Long.parseLong(ss);
    }

    public BigInteger add(BigInteger other) {
         if (this.alter == 1) {
             if (other.alter == 1) {
                 String ss= "", sss;
                 long rem= 0;
                 long cur;
                 int mark= Math.min(this.saveSpot.length(), other.saveSpot.length());
                 for (int i= 0;i< mark; i++) {
                     cur= Long.parseLong(this.saveSpot.substring(i,i+1))
                         + Long.parseLong(other.saveSpot.substring(i, i+1)) + rem;
                     rem= cur/10;
                     cur= cur%10;
                     ss= ss + Long.toString(cur);
                 }
                 if (this.saveSpot.length() > other.saveSpot.length())
                     sss= this.saveSpot;
                 else sss= other.saveSpot;
                 for (int i= mark; i< Math.max(this.saveSpot.length(), other.saveSpot.length()); i++) {
                     cur= Long.parseLong(sss.substring(i,i+1)) + rem;
                     rem= cur/10;
                     cur= cur%10;
                     ss= ss + Long.toString(cur);
                 }
                 if (rem== 1) ss= ss + "1";
                 BigInteger middle= new BigInteger(1, ss);
                 return middle;
             }
             else {
                 BigInteger tg1= new BigInteger(1, this.saveSpot);
                 BigInteger tg2= new BigInteger(1, other.saveSpot);
                 BigInteger middle= tg1.subtract(tg2);
                 return middle;
             }
         }
         else {
             if (other.alter== 1) {
                 BigInteger tg1= new BigInteger(1, other.saveSpot);
                 BigInteger tg2= new BigInteger(1, this.saveSpot);
                 BigInteger middle= tg1.subtract(tg2);
                 return middle;
             }
             else {
                 BigInteger tg1= new BigInteger(1, this.saveSpot);
                 BigInteger tg2= new BigInteger(1, other.saveSpot);
                 BigInteger middle= tg1.add(tg2);
                 middle.alter= middle.alter*-1;
                 if (middle.saveSpot == "0") middle.alter= 1;
                 return middle;
             }
         }
    }

    public BigInteger subtract(BigInteger other) {
        if (this.alter== 1) {
            if (other.alter== 1) {
                long tgAlter= 1;
                if (this.saveSpot.length() < other.saveSpot.length()) {
                    tgAlter= -1;
                }
                else if (this.saveSpot.length()== other.saveSpot.length()) {
                    for (int i= 0;i< this.saveSpot.length(); i++)
                        if (Long.parseLong(this.saveSpot.substring(i,i+1)) <
                            Long.parseLong(other.saveSpot.substring(i,i+1))) {
                            tgAlter= -1;
                            break;
                        }
                }
                BigInteger tg1= new BigInteger(1, this.saveSpot);
                BigInteger tg2= new BigInteger(1, other.saveSpot);
                if (tgAlter== -1) {
                    tg1 = new BigInteger(1, other.saveSpot);
                    tg2 = new BigInteger(1, this.saveSpot);
                }
                int mark= tg2.saveSpot.length();
                String ss= "";
                long rem= 0, cur;
                for (int i=0;i< mark;i++) {
                    cur= Long.parseLong(tg1.saveSpot.substring(i,i+1))
                        - Long.parseLong(tg2.saveSpot.substring(i,i+1)) - rem;
                    rem= (cur < 0) ? 1 : 0;
                    cur = Math.abs(cur+10)%10;
                    ss= ss + Long.toString(cur);
                }
                for (int i=mark;i<tg1.saveSpot.length();i++) {
                    cur= Long.parseLong(tg1.saveSpot.substring(i,i+1)) - rem;
                    rem= (cur < 0) ? 1 : 0;
                    cur= Math.abs(cur+10)%10;
                    ss= ss + Long.toString(cur);
                }
                int i= ss.length();
                while (ss.charAt(i-1)== '0') {
                    if (i==1) break;
                    i--;
                }
                BigInteger middle= new BigInteger(tgAlter, ss.substring(0,i));
                if (ss== "0") middle.alter= 1;
                return middle;
            }
            else {
                BigInteger tg1= new BigInteger(1, this.saveSpot);
                BigInteger tg2= new BigInteger(1, other.saveSpot);
                BigInteger middle= tg1.add(tg2);
                return middle;
            }
        }
        else {
            if (other.alter== 1) {
                BigInteger tg1= new BigInteger(1, this.saveSpot);
                BigInteger tg2= new BigInteger(1, other.saveSpot);
                BigInteger middle= tg1.add(tg2);
                middle.alter= middle.alter*-1;
                if (middle.saveSpot == "0") middle.alter= 1;
                return middle;
            }
            else {
                BigInteger tg1= new BigInteger(1, other.saveSpot);
                BigInteger tg2= new BigInteger(1, this.saveSpot);
                BigInteger middle= tg1.subtract(tg2);
                return middle;
            }
        }
    }

    public BigInteger clone() {
        BigInteger tg= new BigInteger(this.alter, this.saveSpot);
        return tg;
    }

    public int compareTo(BigInteger other) {
        BigInteger tg= this.subtract(other);
        if (tg.alter == -1) return -1;
        else if (tg.saveSpot== "0") return 0;
        else return 1;
    }
}
