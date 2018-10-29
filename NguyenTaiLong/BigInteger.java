public class BigInteger {
    private String bigString;

    public BigInteger(long init) {
        this.bigString = String.valueOf(init);
    }

    public BigInteger(String init) {
        this.bigString = init;
    }

    public String toString() {
        int k = -1;
        int start = 0;
        String sign = "";

        if(this.bigString.charAt(0) == '-'){
            start = 1;
            sign  = "-";
        }

        for(int i = start; i < bigString.length(); i++){
            if(bigString.charAt(i) != '0') {
                k = i;
                break;
            }
        }

        if(k < 0){
            return "0";
        }
        else{
            return new String(sign + bigString.substring(k));
        }
    }

    public boolean equals(Object other) {
        
        int diff = this.toString().compareTo(other.toString());
        if ( diff != 0 ) 
            return false;
        return true;

    }

    public long toLong() {
        Long l = Long.parseLong(this.toString());
        return l;
    }

    public BigInteger add(BigInteger other) {
        String str1 = this.toString(), str2 = other.toString();
        if (str1.charAt(0) == '-' && str2.charAt(0) != '-'){
            this.bigString = abs(str1);
            return other.subtract(this);
        }
        else
            if(str2.charAt(0) == '-' && str1.charAt(0) != '-'){
                BigInteger newBI = new BigInteger(abs(str2));
                return this.subtract(newBI);
            }
            else
                if(str2.charAt(0) == '-' && str1.charAt(0) == '-')
                    this.bigString = new String("-" + addString(abs(str1), abs(str2)));
                else
                    if(str2.charAt(0) != '-' && str1.charAt(0) != '-')
                        this.bigString = addString(str1, str2);
        return this;
    }

    public BigInteger subtract(BigInteger other) {
        String str1 = this.toString(), str2 = other.toString();
        if(this.equals(other)) {
            this.bigString = "0";
            return this;
        }
        else {
            if (str1.charAt(0) != '-' && str2.charAt(0) == '-')
                this.bigString = addString(str1, abs(str2));
            else if (str1.charAt(0) == '-' && str2.charAt(0) != '-')
                this.bigString = new String("-" + addString(abs(str1), str2));
            else if (str1.charAt(0) == '-' && str2.charAt(0) == '-') {
                this.bigString = abs(str1);
                BigInteger newBI = new BigInteger(abs(str2));
                return newBI.subtract(this);
            } else if (str1.charAt(0) != '-' && str2.charAt(0) != '-') {
                if (this.smaller(other))
                    this.bigString = new String("-" + subString(str2, str1));
                else
                    this.bigString = subString(str1, str2);
            }
        }
        return this;
    }

    public String addString(String str1, String str2){
        int t = 0 ;
        int i = str1.length()-1, j = str2.length()-1;
        int size = (i >= j) ? i+2 : j+2;
        int size2 = size;
        char [] res = new char[size--];

        while(true) {
            
            int temp = 0;
            if (i >= 0 && j >= 0) temp = Character.getNumericValue(str1.charAt(i--)) + Character.getNumericValue(str2.charAt(j--));
            else
                if (i >= 0 && j < 0) temp = Character.getNumericValue(str1.charAt(i--));
                else
                    if (i < 0 && j >= 0) temp = Character.getNumericValue(str2.charAt(j--));
                    else
                        if (i < 0 && j < 0) {
                            res[0] = Character.forDigit(t, 10);
                            break;
                        }
            
            res[size--] = Character.forDigit((temp + t) % 10, 10);
            if ((temp + t) >= 10) 
                t = 1;
            else 
                t = 0;
        }
        if(res[0] == '0'){
            return new String(res).substring(1);
        }
        else return new String(res);
    }

    public String subString(String str1, String str2){
        int i = str1.length()-1, j = str2.length()-1;
        int t = 0;
        int size = (i > j)? i+1 : j+1;
        int size2 = size;
        char[] res = new char[size--];

        while(true){
            int temp = 0;
            if (i >= 0 && j >= 0) temp = Character.getNumericValue(str1.charAt(i--)) - Character.getNumericValue(str2.charAt(j--));
            else
            if (i >= 0 && j < 0) temp = Character.getNumericValue(str1.charAt(i--));
            else
            if (i < 0 && j < 0) {
                break;
            }
            if( (temp - t) < 0) {
                res[size--] = Character.forDigit(temp - t +10, 10);
                t = 1;
            }
            else{
                res[size--] = Character.forDigit(temp - t, 10);
                t = 0;
            }
        }
        int k = 0;
        for(int ij = 0; ij < size2; ij++)
            if(res[ij] != '0'){
                k = ij;
                break;
            }
        return new String(res).substring(k);
    }

    public boolean smaller(Object other){
        if( this.equals(other)) return false;
        else {
            int i = this.toString().length() - 1, j = other.toString().length() - 1;
            if (i < j) return true;
            else if (i == j) {
                for (int z = i; z >= 0; z--)
                    if (Character.getNumericValue(this.toString().charAt(z)) < Character.getNumericValue(other.toString().charAt(z))){
                        return true;
                    }
                    else if (Character.getNumericValue(this.toString().charAt(z)) > Character.getNumericValue(other.toString().charAt(z))){
                        return false;
                    }
            }
            else return false;
        }

        return false;
    }

    public String abs(String str){
        if(str.charAt(0) != '-') return str;
        else {
            return str.substring(1);
        }
    }

    public BigInteger clone(){
        BigInteger newOne = new BigInteger(this.toString());
        return newOne;
    }
}
