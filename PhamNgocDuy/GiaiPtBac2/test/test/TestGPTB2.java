package test;

import giaiptbac2.PhuongTrinhBac2;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
import junit.framework.TestCase;

/**
 * Lớp này dùng để kiểm thử lớp PhuongTrinhBac2
 *
 * @author github.com/phamngocduy98
 */
public class TestGPTB2 extends TestCase {

    // sai số cho phép của nghiệm
    private float denta = 0.0000001f;

    /**
     * constructor
     */
    public TestGPTB2(String name) {
        super(name);
    }

    /**
     * Kiểm tra nghiệm kép
     */
    public void testNghiemKep() {
        PhuongTrinhBac2 ptNghiemKep = new PhuongTrinhBac2(1, 2, 1);
        ptNghiemKep.solve();
        assertEquals(1, ptNghiemKep.getSoNghiem());
        assertEquals(-1.0, ptNghiemKep.getNghiem()[0], this.denta);
    }

    /**
     * Kiểm tra nghiệm kép
     */
    public void test2Nghiem() {
        PhuongTrinhBac2 pt2Nghiem = new PhuongTrinhBac2(1, 3, 2);
        pt2Nghiem.solve();
        assertEquals(2, pt2Nghiem.getSoNghiem());
        assertEquals(-1.0, pt2Nghiem.getNghiem()[0], this.denta);
        assertEquals(-2.0, pt2Nghiem.getNghiem()[1], this.denta);
    }

    /**
     * Kiểm tra nghiệm kép
     */
    public void testVoNghiem() {
        PhuongTrinhBac2 ptVoNghiem = new PhuongTrinhBac2(1, 2, 10);
        ptVoNghiem.solve();
        assertEquals(0, ptVoNghiem.getSoNghiem());
    }

    /**
     * Kiểm tra nếu hệ số a = 0 (phương trình bậc 1)
     */
    public void testPTB1CoNghiem() {
        PhuongTrinhBac2 ptBac1 = new PhuongTrinhBac2(0, 2, 10);
        ptBac1.solve();
        assertEquals(1, ptBac1.getSoNghiem());
        assertEquals(-5.0, ptBac1.getNghiem()[0], this.denta);
    }
}
