
public class DemoJUnitTest {
	
//	Ham tim so nguyen lon nhat trong day
	public int findMaxNumber(int[] array) {
		int max = array[0];
		for(int i = 1; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
}
