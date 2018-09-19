package bai1;

/**
 * Class khởi tạo 2 phương thức
 *
 * @author Đại Hoàng
 */
public class Bai1 {

    /**
     * Phương thức tìm ước chung lớn nhất của 2 số nguyên
     *
     * @param a số thứ nhất
     * @param b số thứ hai
     * @return Ước chung lớn nhất của 2 số a, b
     */
    public int TimUocChungLonNhat(int a, int b) {
        int Tam = 0;

        if (a == 0 && b == 0) {
            System.err.println("Khong co uoc chung lon nhat thoa man");
            return -1;
        } else {

            while (b != 0) {
                Tam = a % b;
                a = b;
                b = Tam;
            }
            if (a < 0) {
                return -a;
            } else {
                return a;
            }
        }
    }

    /**
     * Phương thức tính Fibonacci của 1 số nguyên dương
     *
     * @param n là một số nguyên dương bất kỳ
     * @return Fibonacci của số nguyên dương n
     */
    public int TinhFibonacci(int n) {
        if (n < 0) {
            System.err.println("Dau vao khong hop le");
            return -1;
        } else if (n <= 1) {
            return n;
        } else {
            return TinhFibonacci(n - 1) + TinhFibonacci(n - 2);
        }
    }
}
