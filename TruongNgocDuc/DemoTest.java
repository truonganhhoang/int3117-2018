package demo;

public class DemoTest {
	public int findMinNumber(int[] array) {
		int min = array[0];
		for(int i = 0; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int[] array1 = {1,5,2,4,3};
		int[] array2 = {5,3,2,4,1};
		DemoTest demoTest = new DemoTest();
		int minNumber1 = demoTest.findMinNumber(array1);
		int minNumber2 = demoTest.findMinNumber(array2);
		System.out.println(minNumber1);
		System.out.println(minNumber2);
 	}
}
