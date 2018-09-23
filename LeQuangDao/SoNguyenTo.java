package songuyento;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 * Class cho phép người dùng kiểm tra một số có phải số nguyên tố không
 *
 * @author DaoLQ
 */
public class SoNguyenTo {

    /**
     * Hàm main thực thi việc kiểm tra
     *
     * @param args không sử dụng
     */
    public static void main(String[] args) {
        SoNguyenTo test = new SoNguyenTo();
        System.out.print("nhap so x :");
        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();
        System.out.println(test.soNguyenTo(x));
    }

    /**
     * là phương thức kiểm tra một số nguyên tố
     *
     * @param x tham số để kiểm tra
     * @return trả về có phải số nguyên tố hay không
     */
    public boolean soNguyenTo(int x) {
        if (x <= 1) {
            return false;
        }
        if ((x == 2) || (x == 3)) {
            return true;
        }
        for (int i = 2; i <= sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
