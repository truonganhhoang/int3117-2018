/**
 * Created by hoangmanh on 9/16/18.
 */

// Code Fixed after run test case
public class Demo1 {
    public boolean isPrimeNumber(int input) {
        if (input < 2) {
            return false;
        }
        for (int i = 2; i < input; i++) {
            if (input % i == 0)
                return false;
        }
        return true;
    }
}
