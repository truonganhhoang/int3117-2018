package giaiptbac2;

import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 * Lớp này dùng để kiểm thử lớp PhuongTrinhBac2
 *
 * @author github.com/phamngocduy98
 */
public class PhuongTrinhBac2Test extends TestCase {

    // sai số cho phép của nghiệm
    private final float denta = 0.0000001f;

    /**
     * constructor
     *
     * @param name tên test, just for fun :v
     */
    public PhuongTrinhBac2Test(String name) {
        super(name);
    }

    /**
     * Kiểm tra phương trình bậc 2 nghiệm kép
     */
    @Test
    public void testNghiemKep() {
        PhuongTrinhBac2 ptNghiemKep = new PhuongTrinhBac2(1, 2, 1);
        ptNghiemKep.solve();
        assertEquals(1, ptNghiemKep.getSoNghiem());
        assertEquals(-1.0, ptNghiemKep.getNghiem()[0], this.denta);
    }

    /**
     * Kiểm tra phương trình bậc 2 có 2 nghiệm phân biệt
     */
    @Test
    public void test2Nghiem() {
        PhuongTrinhBac2 pt2Nghiem = new PhuongTrinhBac2(1, 3, 2);
        pt2Nghiem.solve();
        assertEquals(2, pt2Nghiem.getSoNghiem());
        assertEquals(-1.0, pt2Nghiem.getNghiem()[0], this.denta);
        assertEquals(-2.0, pt2Nghiem.getNghiem()[1], this.denta);
    }

    /**
     * Kiểm tra phương trình vô nghiệm
     */
    @Test
    public void testVoNghiem() {
        // denta < 0
        PhuongTrinhBac2 ptVoNghiem = new PhuongTrinhBac2(1, 2, 10);
        ptVoNghiem.solve();
        assertEquals(0, ptVoNghiem.getSoNghiem());

        // phương trình bậc nhất vô nghiệm
        PhuongTrinhBac2 ptBac1 = new PhuongTrinhBac2(0, 0, 5.2f);
        ptBac1.solve();
        assertEquals(0, ptBac1.getSoNghiem());
    }

    /**
     * Kiểm tra nếu hệ số a == 0 (phương trình bậc 1 có nghiệm)
     */
    @Test
    public void testPTB1CoNghiem() {
        PhuongTrinhBac2 ptBac1 = new PhuongTrinhBac2(0, 2, 10);
        ptBac1.solve();
        assertEquals(1, ptBac1.getSoNghiem());
        assertEquals(-5.0, ptBac1.getNghiem()[0], this.denta);
    }

    /**
     * Kiểm tra phương trình bậc nhất vô số nghiệm: hệ số a == b == c == 0;
     */
    @Test
    public void testPTB1VoSoNghiem() {
        PhuongTrinhBac2 ptBac1 = new PhuongTrinhBac2(0, 0, 0);
        ptBac1.solve();
        assertEquals(0, ptBac1.getSoNghiem());
    }

    /**
     * Kiểm tra gọi hàm getNghiem() và getSoNghiem() mà không solve()
     */
    @Test
    public void testGetWithoutSolve() {
        PhuongTrinhBac2 ptBac1 = new PhuongTrinhBac2(0, 0, 0);
        assertEquals(0, ptBac1.getSoNghiem());
        
        PhuongTrinhBac2 ptNghiemKep = new PhuongTrinhBac2(1, 2, 1);
        assertEquals(-1.0, ptNghiemKep.getNghiem()[0], this.denta);
    }
    
    /**
     * Kiểm tra toString()
     */
    @Test
    public void testToString() {
        PhuongTrinhBac2 pt2Nghiem = new PhuongTrinhBac2(1, 3, 2);
        pt2Nghiem.solve();
        assertEquals("PhuongTrinhBac2{a=1.0, b=3.0, c=2.0, nghiem=[-1.0 ; -2.0], isSolved=true}", pt2Nghiem.toString());
    
        PhuongTrinhBac2 ptBac1 = new PhuongTrinhBac2(0, 0, 0);
        assertEquals("PhuongTrinhBac2{a=0.0, b=0.0, c=0.0, nghiem=[], isSolved=false}", ptBac1.toString());
    }
}
