package JUnit;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class JUnitTest {
    @Test
    public void test_sort(){
        JUnit test=new JUnit();
        int array1[]={7, 3, 2 , 2, 6};
        int array1Result[]={2, 2, 3, 6, 7};
	Assert.assertArrayEquals(array1Result,test.sort(array1));

        int array2[]={};
        int array2Result[]={};
	Assert.assertArrayEquals(array2Result,test.sort(array2));
	
        int[] array3={3};
        int[] array3Result={3};
        
        
        Assert.assertArrayEquals(array3Result, test.sort(array3));


        Assert.assertArrayEquals(array1Result, test.sort(array1Result));
    }


}


