package algorithm;

/**
 * This class supports some common algorithms
 * @author Tran Minh Hieu
 */
public class Algorithm {
    
    /**
     * This function sorts an integer array in non-decreasing order
     */
    public static int[] insertionSort(int[] array) {
        if(array == null) {
            return null;
        }
        int[] result = array.clone();
        for(int i = 1; i < result.length; ++i) {
            int key = result[i];
            int j = i - 1;
            while(j >= 0 && result[j] > key) {
                result[j + 1] = result[j];
                --j;
            }
            result[j + 1] = key;
        }
        return result;
    }
    
    /**
     * Main function
     */
    public static void main(String[] args) {
        
    }
    
}
