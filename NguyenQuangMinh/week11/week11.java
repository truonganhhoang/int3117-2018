public class MyClass{
    public int myFunction(int a, int b) {
        if (a < 0){
            a = -a;
        }
        if(b < 0){
            b = b;
        }
        int c = a + b;
        if(a < b){
            a = c - a;
            b = c - b;
        }
        int d = a - b;
        if (c == 0 || d == 0){
            return c + d;
        }
        while(c != d){
            if(c > d){
                c = c - d;
            }
            if (d > c){
                d = d - c;
            }
        }
        return c;
    }
}
