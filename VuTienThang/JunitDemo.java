package junit.demo;

public class JunitDemo {
    
    public static boolean camelCase(int a){
        if(a > 0){
            int count = 0;
            for(int i = 1; i <= a; i++){
                if(a % i == 0)
                    count++;
            }
            if(count == 2)
                return true;
            return false;
        }
        return false;
    }
    
    public static void main(String[] args) {
    }
}
