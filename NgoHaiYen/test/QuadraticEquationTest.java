import main.QuadraticEquation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuadraticEquationTest {
    @Test
    public void test1() {
        String result = QuadraticEquation.caculate(0, 1, 0);
        assertEquals(result, "Phương trình có một nghiệm: x = -0.0");
    }

    @Test
    public void test2() {
        String result = QuadraticEquation.caculate(0, 0, 0);
        assertEquals(result, "Phương trình có vô số nghiệm");
    }

    @Test
    public void test3() {
        String result = QuadraticEquation.caculate(0, 0, 1);
        assertEquals(result, "Phương trình vô nghiệm!");
    }

    @Test
    public void test4() {
        String result = QuadraticEquation.caculate(1, -3, 2);
        assertEquals(result, "Phương trình có 2 nghiệm là: x1 = 2.0 và x2 = 1.0");
    }

    @Test
    public void test5() {
        String result = QuadraticEquation.caculate(1, -2, 1);
        assertEquals(result, "Phương trình có nghiệm kép: x1 = x2 = 1.0");
    }

    @Test
    public void test6() {
        String result = QuadraticEquation.caculate(1, 2, 3);
        assertEquals(result, "Phương trình vô nghiệm!");
    }
}
