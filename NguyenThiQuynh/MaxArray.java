package junittest;

/**
 * class nay de tim phan tu lon nhat cua 1 mang cho san
 * @author quynh
 */
public class MaxArray {
    public int findArrayMax(int arr[]) {
        int max = arr[0];
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] >= max) {
                max = arr[i];
            }
        }
        return max;
    }
    
}
