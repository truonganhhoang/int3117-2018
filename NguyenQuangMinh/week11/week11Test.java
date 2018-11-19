import week11;
import org.junit.Test;


import static org.junit.Assert.*;

public class week11Test {
    @Test
    public void testMyFunction() {
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        assertEquals(0, myFunction(0, 0));
        assertEquals(1, myFunction(1, 0));
        assertEquals(1, myFunction(0, 1));
        assertEquals(1, myFunction(-1, 0));
        assertEquals(1, myFunction(0, -1));
        assertEquals(2, myFunction(2, 2));
        assertEquals(3, myFunction(-3, 3));
        assertEquals(3, myFunction(3, -3));
        assertEquals(3, myFunction(3, 3));
        assertEquals(2, myFunction(4, 2));
        assertEquals(2, myFunction(-4, 2));
        assertEquals(2, myFunction(4, -2));
        assertEquals(2, myFunction(-4, -2));
        assertEquals(3, myFunction(3, 6));
        assertEquals(3, myFunction(-3, 6));
        assertEquals(3, myFunction(3, -6));
        assertEquals(3, myFunction(-3, -3));
        assertEquals(1, myFunction(maxInt, 1));
        assertEquals(1, myFunction(minInt, 1));
        assertEquals(1, myFunction(maxInt+1, 1));
        assertEquals(1, myFunction(minInt-1, 1));
        assertEquals(maxInt+1, myFunction(maxInt+1, maxInt+1));
        assertEquals(minInt-1, myFunction(minInt-1, minInt-1));
    }

    

}
