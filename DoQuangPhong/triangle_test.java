import org.junit.*;
import static org.junit.Assert.*;

public class triangle_test {
    @Test
    public void equilateralTriangle() throws Exception {
        triangle t1 = new triangle(2, 2, 2);

        assertEquals(triangle.TriangleKind.EQUILATERAL, t1.getKind());
    }
    @Test
    public void isoscelesTriangle() throws Exception {
        triangle t1 = new triangle(3, 5, 5);
        assertEquals(triangle.TriangleKind.ISOSCELES, t1.getKind());
    }
    @Test
    public void isoscelesTriangle_1() throws Exception {
        triangle t1 = new triangle(5, 3, 5);
        assertEquals(triangle.TriangleKind.ISOSCELES, t1.getKind());
    }

    @Test
    public void scaleneTriangles() throws Exception {
        triangle t1 = new triangle(3, 4, 5);

        assertEquals(triangle.TriangleKind.SCALENE, t1.getKind());
    }

    @Test
    public void scaleneTriangles_1() throws Exception {
        triangle t1 = new triangle(12, 10, 11);

        assertEquals(triangle.TriangleKind.SCALENE, t1.getKind());
    }

    @Test
    public void scaleneTriangles_2() throws Exception {
        triangle t1 = new triangle(0.4, 0.6, 0.3);

        assertEquals(triangle.TriangleKind.SCALENE, t1.getKind());
    }

    @Test(expected = Exception.class)
    public void allSizeIsZero() throws Exception {
        new triangle(0, 0, 0);
    }

    @Test(expected = Exception.class)
    public void negativeSide() throws Exception {
        new triangle(-1,3,4);
    }

    @Test(expected = Exception.class)
    public void negativeSide_1() throws Exception {
        new triangle(3,3,-4);
    }

    @Test(expected = Exception.class)
    public void quailification() throws Exception {
        new triangle(1, 1, 3);
    }

    @Test(expected = Exception.class)
    public void quailification_1() throws Exception {
        new triangle(2, 4, 2);
    }
}