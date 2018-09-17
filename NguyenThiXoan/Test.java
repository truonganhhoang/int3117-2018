
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test() {
    @Test
    public void testCheckPrimeNumber1() {
        boolean test1 = AnalysisIntergerNumber.checkPrimeNumber(31);
        assertTrue(test1);
    }
    
    @Test 
    public void testCheckPrimeNumber2() {
        boolean test2 = AnalysisIntergerNumber.checkPrimeNumber(1);
        assertFalse(test2);
    }
    
    @Test 
    public void testCheckPrimeNumber3() {
        boolean test3 = AnalysisIntergerNumber.checkPrimeNumber(-2);
        assertFalse(test2);
    }
    
    @Test 
    public void testCheckPrimeNumber4() {
        boolean test4 = AnalysisIntergerNumber.checkPrimeNumber(2147483647);
        assertFalse(test2);
    }
    
	@Test
	public void testAnalysis(31) {
		int[] test = new int[50];
		test = AnalysisIntergerNumber.analysis(31);
		for (int i = 0; i < test.lenght; i++) {
			result *= test[i];
		}
		assertEquals(result, 31)
	}
    
	
}