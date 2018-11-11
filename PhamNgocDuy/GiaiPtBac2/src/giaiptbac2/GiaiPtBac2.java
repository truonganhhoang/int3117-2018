package giaiptbac2;

/**
 * Lớp này chứa hàm main thực hiện giải phương trình bậc 2
 *
 * @author github.com/phamngocduy98
 */
public class GiaiPtBac2 {

    public static void main(String[] args) {
        PhuongTrinhBac2 ptb2 = new PhuongTrinhBac2(1, 3, 2);
        ptb2.solve();
        System.out.println(ptb2.toString());
    }

}
