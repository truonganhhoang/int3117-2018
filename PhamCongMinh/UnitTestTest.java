package UnitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnitTestTest {
    @Test
    public void binarySearchWithArraySorted() {
        UnitTest unitTest = new UnitTest();
        //Mang duoc sap xep tang dan
        int array1[] = {1, 3, 5, 80, 10000};
        Assertions.assertTrue(unitTest.binarySearch(array1, 3, 0, array1.length - 1));
        Assertions.assertTrue(unitTest.binarySearch(array1, 2, 0, array1.length - 1));

    }

    @Test
    public void binarySearchWithArrayUnsort() {
        //Mang sap xep khong theo thu tu tang dan
        int array2[] = {3, 5, 100000, 80, 1};
        UnitTest unitTest = new UnitTest();
        Assertions.assertTrue(unitTest.binarySearch(array2, 1, 0, array2.length - 1));
    }
}
