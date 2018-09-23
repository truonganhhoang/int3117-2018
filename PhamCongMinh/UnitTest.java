package UnitTest;

public class UnitTest {
    public UnitTest(){

    }

    public boolean binarySearch(int[] array,int numberSearch, int leftIndex, int rightIndex) {
        this.bubbleSort(array);
        if (rightIndex >= 1) {
            int mid = leftIndex + (rightIndex - leftIndex) / 2;
            if (array[mid] == numberSearch) {
                return true;
            } else if (array[mid] > numberSearch) {
                return binarySearch(array, numberSearch, leftIndex, mid - 1);
            } else {
                return binarySearch(array, numberSearch, mid + 1, rightIndex);
            }
        }
        return false;
    }

    private void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap temp and arr[i]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}


