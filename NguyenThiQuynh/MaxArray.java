package junittest;

/**
 * This class find the max element of a given array
 * @author quynh
 */
public class MaxArray {
    
    /**
     * This class find the max value of the array
     * @param arr the given array
     * @return the max value of the array
     */
    public int findArrayMax(int arr[]) {
        int max = arr[0];
        
        for (int i = 0 ; i < arr.length ; i++) {
            if(arr[i] >= max) {
                max = arr[i];
            }
        }
        
        return max;
    }
    
}
