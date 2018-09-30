class BCNN{
    public int bcnn(int a, int b) {
        int tmp = a*b;
        while (a != 0 && b != 0){
            if (a > b) a = a % b;
            else b = b % a;
        }
        int bcnn = tmp / (a+b);
        return bcnn;
    }
 } 