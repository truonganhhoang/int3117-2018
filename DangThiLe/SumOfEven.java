package demo;

public class SumOfEven {

    public int sumEven(int arr[]) {
      
      int sum = 0;
      for (int i = 0; i < arr.length; i++) {
         if (arr[i]%2 == 0) sum += arr[i];
      }
      return sum;
    }
	public static void main(String[] args) {
 	}
}
