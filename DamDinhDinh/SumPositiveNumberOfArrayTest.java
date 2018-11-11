import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class SumPositiveNumberOfArrayTest {

    @Test
    public  void testCalculateSumPositiveNumber1() {
        int array[] = {1, -2, 3, -4, 5};
        int expect_sum = 9;
        int result = SumPositiveNumberOfArray.calculateSumPositiveNumber(array);

        assertEquals(expect_sum, result);
    }

    @Test
    public  void testCalculateSumPositiveNumber2() {
        int array[] = {Integer.MAX_VALUE, Integer.MIN_VALUE, 3, -4, 5};
        int expect_sum = 2147483647 + 3 + 5;
        int result = SumPositiveNumberOfArray.calculateSumPositiveNumber(array);

        assertEquals(expect_sum, result);
    }

    @Test
    public  void testCalculateSumPositiveNumber3() {
        int array[] = {2147483647, Integer.MIN_VALUE, 0, -4, -5};
        int expect_sum = 2147483647;
        int result = SumPositiveNumberOfArray.calculateSumPositiveNumber(array);

        assertEquals(expect_sum, result);
    }

    @Test
    public  void testCalculateSumPositiveNumber4() {
        int array[] = {-5, -4, -3, -4545, -999};
        int expect_sum = 0;
        int result = SumPositiveNumberOfArray.calculateSumPositiveNumber(array);

        assertEquals(expect_sum, result);
    }

    @Test
    public  void testCalculateSumPositiveNumber5() {
        int array[] = new int[5];
        int expect_sum = 0;
        int result = SumPositiveNumberOfArray.calculateSumPositiveNumber(array);

        assertEquals(expect_sum, result);
    }
}
