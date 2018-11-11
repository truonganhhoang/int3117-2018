import java.util.Arrays;


import edu.princeton.cs.algs4.*;
public class BinarySearch {
    public static void sortarray(int[] a){
        Arrays.sort(a);
    }
    public static int binarySearch (int[]a, int key){
        int lo = 0, hi = a.length-1;
        while (lo <= hi) {
            int mid = lo + (hi-lo)/2;
            if (key < a[mid]) hi = mid-1;
            else if (key > a[mid]) lo = mid+1;
            if(key == a[mid]) return mid;
        }
        return -1;
    }
    public static void main(String[] args)  {
        int [] a = new int[6];
        a[0] = 33;
        a[1] = 22;
        a[2] = 44;
        a[3] = 56;
        a[4] = 12;
        a[5] = 99;
        StdOut.println("vi tri so can tim: " + binarySearch(a,44));
    }
}
