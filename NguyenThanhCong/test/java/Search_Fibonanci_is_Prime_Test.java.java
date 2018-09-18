import static org.junit.Assert.*;

public class search_fibonanci_is_prime {

    @org.junit.Test
    public void checkSNT() {
        search_fibonanci_is_prime test = new search_fibonanci_is_prime();
	    int[] f = new int[20];
	    for (int m = 0; m <20 ; m++){
	      f[m] = m;
	    }
        int result = test.checkSNT(f);
        assertEquals(2, result);
    }
    public void SearchFibonanci() {
        search_fibonanci_is_prime test = new search_fibonanci_is_prime();
        int n = 15;
	    int[] f = new int[20];
	    for (int m = 0; m <20 ; m++){
	      f[m] = m;
	    }
        int result1 = test.SearchFibonanci(f, 15);
        assertEquals(2, result1);
    }
}
