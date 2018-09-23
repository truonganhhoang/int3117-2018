package JUnit;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class JUnitTest {
    @Test
    public void testSortTrue() {
        JUnit test = new JUnit();
        int array[] = {7, 3, 2, 2, 6};
        int array1Result[] = {2, 2, 3, 6, 7};

        Assert.assertArrayEquals(array1Result, test.sort(array1));
    }

    @Test
    public void testSortNull() {
        JUnit test = new JUnit();
        int array[] = {};
        int arrayResult[] = {};

        Assert.assertArrayEquals(arrayResult, test.sort(array));
    }

    @Test
    public void testSortFalse() {
        JUnit test = new JUnit();
        int array[] = {7, 3, 2, 2, 6};
        int arrayResult[] = {2, 2, 3, 3, 7};

        Assert.assertArrayEquals(arrayResult, test.sort(arrayResult));
    }

    @Test
    public void testSortReverse() {
        JUnit test = new JUnit();
        int array[] = {7, 6, 5, 5, 4};
        int arrayResult[] = {4, 5, 5, 6, 7};

        Assert.assertArrayEquals(arrayResult, test.sort(arrayResult));
    }
}


