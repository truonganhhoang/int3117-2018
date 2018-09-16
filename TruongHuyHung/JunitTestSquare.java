
import org.junit.Test;

import static org.junit.Assert.*;

public class JunitTestSquare {

    @Test
    public void testSquare() {
        NumberSquare numberSquare = new NumberSquare();
        int a = numberSquare.square(3);
        assertEquals(4, a);
    }
}
