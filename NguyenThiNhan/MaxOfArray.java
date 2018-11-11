public class MaxOfArray {
    public int findMaxOfArray(int arr[]) {
      // Finding the largest element
      if(arr.length<1) return null;
      int max = arr[0];
      for (int i = 1; i < arr.length; i++) {
         if (arr[i] > max) max = arr[i];
      }
      return max;
   }
}
