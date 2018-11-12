package binarysearch;

/**
 *
 * @author NguyenDucNhien
 */
public class BinarySearch {

    public static int binarySearch(int arr[], int key) {
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        int pos = -1;

        while (left <= right) {
            mid = (left + right) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return pos;
    }

    public static void main(String[] args) {
    }
}
