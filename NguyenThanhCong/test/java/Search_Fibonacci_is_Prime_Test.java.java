import static org.junit.Assert.*;

public class Search_Fibonacci_Is_Prime {

    @org.junit.Test
    public void checkSNT() {
        Search_Fibonacci_Is_Prime test = new Search_Fibonacci_Is_Prime();
	    int[] f = new int[20];
	    for (int m = 0; m <20 ; m++){
	      f[m] = m;
	    }
        int result = test.checkSNT(f);
        assertEquals(2, result);
    }
    public void searchFibonacci() {
        Search_Fibonacci_Is_Prime test = new Search_Fibonacci_Is_Prime();
        int n = 15;
	    int[] f = new int[20];
	    f[2] = 2;
        int result1 = test.searchFibonacci(f, 15);
        assertEquals(2, result1);
    }
}
