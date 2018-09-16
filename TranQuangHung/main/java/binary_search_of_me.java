import java.util.Arrays;


import edu.princeton.cs.algs4.*;
public class binary_search_of_me {
    public static void sortarray(int[] a){
        Arrays.sort(a);
    }
    public static int binary_search(int[]a, int key){
        int lo = 0, hi = a.length-1;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if (key < a[mid]) hi = mid-1;
            else if (key > a[mid]) lo = mid+1;
            if(key == a[mid]) return mid;
        }
        return -1;
    }
    public static void main(String[] args)  {
        //In in = new In(args[0]);
        // int[] a = in.readAllInts();
        int [] a = new int[6];
        a[0] = 33;
        a[1] = 22;
        a[2] = 44;
        a[3] = 56;
        a[4] = 12;
        a[5] = 99;
        //sortarray(a);
        //if(binary_search(a,33)>-1)
        StdOut.println("vi tri so can tim: "+binary_search(a,44));
        //else
        // StdOut.println("khong tim thay");
    }
}
