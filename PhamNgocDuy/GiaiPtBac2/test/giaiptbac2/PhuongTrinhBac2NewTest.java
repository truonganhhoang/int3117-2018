package giaiptbac2;

import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 * Lớp này dùng để kiểm thử lớp PhuongTrinhBac2
 *
 * @author github.com/phamngocduy98
 */
public class PhuongTrinhBac2NewTest extends TestCase {


    /**
     * Kiểm tra phương trình bậc 2 nghiệm kép
     */
    @Test
    public void testNghiemKep() {
        String result = PhuongTrinhBac2New.solve(1, 2, 1);
        assertEquals("PhuongTrinhBac2{a=1.0, b=2.0, c=1.0, nghiem=[-1.0]}", result);
    }

    /**
     * Kiểm tra phương trình bậc 2 có 2 nghiệm phân biệt
     */
    @Test
    public void test2Nghiem() {
        String result = PhuongTrinhBac2New.solve(1, 3, 2);
        assertEquals("PhuongTrinhBac2{a=1.0, b=3.0, c=2.0, nghiem=[-1.0 ; -2.0]}", result);
    }

    /**
     * Kiểm tra phương trình vô nghiệm
     */
    @Test
    public void testVoNghiem() {
        // denta < 0
        String result = PhuongTrinhBac2New.solve(1, 2, 10);
        assertEquals("PhuongTrinhBac2{a=1.0, b=2.0, c=10.0, nghiem=[]}", result);

        // phương trình bậc nhất vô nghiệm
        result = PhuongTrinhBac2New.solve(0, 0, 5.2f);
        assertEquals("PhuongTrinhBac2{a=0.0, b=0.0, c=5.2, nghiem=[]}", result);
    }

    /**
     * Kiểm tra nếu hệ số a == 0 (phương trình bậc 1 có nghiệm)
     */
    @Test
    public void testPTB1CoNghiem() {
        String result = PhuongTrinhBac2New.solve(0, 2, 10);
        assertEquals("PhuongTrinhBac2{a=0.0, b=2.0, c=10.0, nghiem=[-5.0]}", result);
    }

    /**
     * Kiểm tra phương trình bậc nhất vô số nghiệm: hệ số a == b == c == 0;
     */
    @Test
    public void testPTB1VoSoNghiem() {
        String result = PhuongTrinhBac2New.solve(0, 0, 0);
        assertEquals("PhuongTrinhBac2{a=0.0, b=0.0, c=0.0, nghiem=[]}", result);
    }
}
