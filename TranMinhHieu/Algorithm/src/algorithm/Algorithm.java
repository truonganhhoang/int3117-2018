package algorithm;

/**
 *
 * @author Tran Minh Hieu
 */
public class Algorithm {

    private static void printArray(int[] array) {
        for(int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
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
    
    public static void main(String[] args) {
        
    }
    
}
