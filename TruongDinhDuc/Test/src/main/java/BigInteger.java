public class BigInteger {
    // Initiate variables
    private long number;
    private String numstr;


    public BigInteger(long init) { // if the number is in type long
        number = init;
        numstr = String.valueOf(init);
    }

    public BigInteger(String init) { // if the number is in type String
        try {
            if (init.length() < 9) {
                number = Long.parseLong(init);
                numstr = init;
            } else numstr = init;
        }
        catch (NumberFormatException e)  // concern if only the string is invalid or not
        {
            System.out.println("Invalid String!");
        }
    }

    public String toString() {

        if (number < Long.MAX_VALUE) {
            numstr = Long.toString(number);
        } // Concern if the number is unable to convert to long
        return numstr;
    }

    public boolean equals(Object other) {

        BigInteger minor = (BigInteger) other;
        if ((minor.numstr.compareTo(this.numstr)) == 0 || ((minor.number == this.number)
        && minor.number!=0 && this.number !=0)) return true;
        return false;


    }

    public long toLong() {
        if (numstr.length() < 9)
            number = Long.parseLong(numstr); // concern if the number is unable to convert
        return number;
    }

    public BigInteger add(BigInteger other) {
        int max = 50;
        char[] array = new char[max];// Change the way to store the number
        int[] arrayx = new int[max];
        // Divide the big number into digit by digit and convert char to int.
        for (int i = 0; i < numstr.length(); i++) {
            array[i] = numstr.charAt(i);  ///
            arrayx[i] = Integer.parseInt(String.valueOf(array[i]));


        }
        char[] arrayOther = new char[max]; // Change the way to store the Other number
        int[] arrayOtherx = new int[max];
        // Divide the big number into digit by digit and convert char to int.
        for (int i = 0; i < other.numstr.length(); i++) {
            arrayOther[i] = other.numstr.charAt(i);
            arrayOtherx[i] = Integer.parseInt(String.valueOf(arrayOther[i])); // convert to int

        }
        // Compute the sum of 2 big integers
        int[] arrayResult = new int[max];
        int k; // control variable for the case of carying on or not
        int NumOfNum1 = numstr.length(), NumOfNum2 = other.numstr.length();  // Variable for computing the array
        int Num1 = numstr.length(), Num2 = other.numstr.length(); // Variable for copying from array to string
        if (numstr.length() >= other.numstr.length()) {
            for (int i = 0; i < numstr.length(); i++) {
                arrayResult[i] = arrayx[i];

            }
            while (NumOfNum2 > 0) {
                if (arrayx[NumOfNum1 - 1] + arrayOtherx[NumOfNum2 - 1] >= 10) // with carry on
                {
                    arrayResult[NumOfNum1 - 1] = arrayResult[NumOfNum1 - 1] + arrayOtherx[NumOfNum2 - 1] - 10;
                    arrayResult[NumOfNum1 - 2]++;

                } else
                    arrayResult[NumOfNum1 - 1] = arrayResult[NumOfNum1 - 1] + arrayOtherx[NumOfNum2 - 1]; // without carry on

                NumOfNum1--; // continue computing with next digit
                NumOfNum2--; // continue computing with the next digit


            }
            k = 1; // add without carry on
        } else {
            for (int i = 0; i < other.numstr.length(); i++) {
                arrayResult[i] = arrayOtherx[i];
            }
            while (NumOfNum1 > 0) {
                if (array[NumOfNum1 - 1] + arrayOther[NumOfNum2 - 1] >= 10) {
                    arrayResult[NumOfNum2 - 1] = arrayx[NumOfNum1 - 1] + arrayResult[NumOfNum2 - 1] - 10; // with carry on
                    arrayResult[NumOfNum2 - 2]++;

                } else
                    arrayResult[NumOfNum2 - 1] = arrayx[NumOfNum1 - 1] + arrayResult[NumOfNum2 - 1];// without carry on

                NumOfNum1--; // continue computing with next digit
                NumOfNum2--; // continue computing with the next digit


            }
            k = 2; // add with carry on
        }

        char arrayResultx[] = new char[max];
        if (k == 1) {
        	for (int i = 0; i < Num1; i++) arrayResultx[i] = (char) (arrayResult[i] + 48); // covert according to ASCII
        	numstr = String.copyValueOf(arrayResultx, 0, Num1); // convert from array to String
        } else {
        	for (int i = 0; i < Num2; i++) arrayResultx[i] = (char) (arrayResult[i] + 48); // covert according to ASCII
        	numstr = String.copyValueOf(arrayResultx, 0, Num2); // convert from array to String
        }
  
        return new BigInteger(numstr);

    }


    public BigInteger subtract(BigInteger other) {

        int max = 50;
        char[] array = new char[max];// Change the way to store the number
        int[] arrayx = new int[max]; // Convert to int
        // Divide the big number into digit by digit and convert char to int.
        for (int i = 0; i < numstr.length(); i++) {
            array[i] = numstr.charAt(i);
            arrayx[i] = Integer.parseInt(String.valueOf(array[i]));


        }
        char[] arrayOther = new char[max]; // Change the way to store the Other number
        int[] arrayOtherx = new int[max];
        // Divide the big number into digit by digit and convert char to int.
        for (int i = 0; i < other.numstr.length(); i++) {
            arrayOther[i] = other.numstr.charAt(i);
            arrayOtherx[i] = Integer.parseInt(String.valueOf(arrayOther[i]));

        }
        // Compute the sub of 2 big integers
        int[] arrayResult = new int[max];
        int k;
        int NumOfNum1 = numstr.length(), NumOfNum2 = other.numstr.length();
        int Num1 = numstr.length(), Num2 = other.numstr.length();
        if (numstr.length() >= other.numstr.length()) {
            for (int i = 0; i < numstr.length(); i++) {
                arrayResult[i] = arrayx[i];

            }
            while (NumOfNum2 > 0) {
                if (arrayx[NumOfNum1 - 1] - arrayOtherx[NumOfNum2 - 1] < 0) // with carry on
                {
                    arrayResult[NumOfNum1 - 1] = 10- Math.abs(arrayResult[NumOfNum1 - 1] - arrayOtherx[NumOfNum2 - 1]);
                    arrayResult[NumOfNum1 - 2]--;

                } else
                    arrayResult[NumOfNum1 - 1] = arrayResult[NumOfNum1 - 1] - arrayOtherx[NumOfNum2 - 1]; // without carry on

                NumOfNum1--;
                NumOfNum2--;


            }
            k = 1; // substract without carry on
        } else {
            for (int i = 0; i < other.numstr.length(); i++) {
                arrayResult[i] = arrayOtherx[i];
            }
            while (NumOfNum1 > 0) {
                if (arrayOtherx[NumOfNum2 - 1] - arrayx[NumOfNum1 - 1] < 0) {
                    arrayResult[NumOfNum2 - 1] = 10 - Math.abs(arrayResult[NumOfNum1 - 1] - arrayx[NumOfNum2 - 1]); // with carry on
                    arrayResult[NumOfNum2 - 2]--;

                } else
                    arrayResult[NumOfNum2 - 1] = arrayResult[NumOfNum1 - 1] - arrayx[NumOfNum2 - 1];// without carry on

                NumOfNum1--;
                NumOfNum2--;

            }
            k = 2; // substract with carry on
        }

        char arrayResultx[] = new char[max];
        if (k == 1) for (int i = 0; i < Num1; i++) arrayResultx[i] = (char) (arrayResult[i] + 48); // Convert according to ASCII
        if (k == 2) for (int i = 0; i < Num2; i++) arrayResultx[i] = (char) (arrayResult[i] + 48); // Convert according to ASCII
        if (k == 1) numstr = String.copyValueOf(arrayResultx, 0, Num1);
        if (k == 2) numstr = String.copyValueOf(arrayResultx, 0, Num2);

        return new BigInteger(numstr);


    }

    public BigInteger clone() {
        BigInteger copyInt = this;
        return copyInt;
    }
    public int compareTo(BigInteger big){
        int res;
        if (this.number != 0){
            if (this.number == big.number){
                res = 0;
            } else if (this.number < big.number){
                res = -1;
            } else {
                res = 1;
            }
        } else {
            if(this.numstr.length() == big.numstr.length()) { // comparation base on string's length
                if (this.numstr.equals(big.numstr)) {
                    res = 0;
                } else if (this.numstr.compareTo(big.numstr) < 0) {
                    res = -1;
                } else {
                    res = 1;
                }
            }
            else if (this.numstr.length() < big.numstr.length()) res = -1;
            else res = 1;
        }


        return res;
    }


}