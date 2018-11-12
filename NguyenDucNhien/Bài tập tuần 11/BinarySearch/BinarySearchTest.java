package binarysearch;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NguyenDucNhien
 */
public class BinarySearchTest {

    /**
     * Truong hop key co trong mang arr va key < a[mid]
     */
    @Test
    public void testBinarySearch1() {
        int arr[] = {1, 3, 5, 7, 8};
        BinarySearch instance = new BinarySearch();
        int expResult = 1;
        int result = instance.binarySearch(arr, 3);
        assertEquals(expResult, result);
    }

    /**
     * Truong hop key co trong mang arr va key = a[mid]
     */
    @Test
    public void testBinarySearch2() {
        int arr[] = {1, 3, 5, 7, 8};
        BinarySearch instance = new BinarySearch();
        int expResult = 2;
        int result = instance.binarySearch(arr, 5);
        assertEquals(expResult, result);
    }

    /**
     * Truong hop key co trong mang arr[] va key > a[mid]
     */
    @Test
    public void testBinarySearch3() {
        int arr[] = {1, 3, 5, 7, 8};
        BinarySearch instance = new BinarySearch();
        int expResult = 3;
        int result = instance.binarySearch(arr, 7);
        assertEquals(expResult, result);
    }

    /**
     * Truong hop key khong co trong mang arr va key < a[mid]
     */
    @Test
    public void testBinarySearch4() {
        int arr[] = {1, 3, 5, 7, 8};
        BinarySearch instance = new BinarySearch();
        int expResult = -1;
        int result = instance.binarySearch(arr, 2);
        assertEquals(expResult, result);
    }

    /**
     * Truong hop key khong co trong mang arr va key > a[mid]
     */
    @Test
    public void testBinarySearch5() {
        int arr[] = {1, 3, 5, 7, 8};
        BinarySearch instance = new BinarySearch();
        int expResult = -1;
        int result = instance.binarySearch(arr, 6);
        assertEquals(expResult, result);
    }
}
