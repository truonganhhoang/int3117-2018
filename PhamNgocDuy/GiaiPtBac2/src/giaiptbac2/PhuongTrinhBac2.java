package giaiptbac2;

import static java.lang.Math.sqrt;

/**
 * Lớp này cài đặt chương trình giải phương trình bậc 2
 *
 * @author github.com/phamngocduy98
 */
public class PhuongTrinhBac2 {

    // 3 hệ số trong phương trình bậc 2
    private float a, b, c;

    // số nghiệm của phương trình bậc 2
    private int soNghiem = 0;
    // 2 nghiệm nếu có của phương trình bậc 2
    private float[] nghiem = new float[2];

    // phương trình đã giải chưa?
    private boolean isSolved = false;

    /**
     * constructor
     *
     * @param a hệ số của x^2
     * @param b hệ số của x
     * @param c hệ số tự do
     */
    public PhuongTrinhBac2(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.isSolved = false;
        this.soNghiem = 0;
        this.nghiem = new float[2];
    }

    /**
     * Hàm thực hiện giải phương trình bậc 2
     */
    public void solve() {
        this.isSolved = true;
        if (this.a == 0) {
            if (this.b != 0) {
                this.nghiem[0] = -this.c / this.b;
                this.soNghiem = 1;
            }
        } else {
            float denta = this.b * this.b - 4 * this.a * this.c;
            if (denta > 0) {
                this.nghiem[0] = (float) ((-this.b + sqrt(denta)) / (2 * this.a));
                this.nghiem[1] = (float) ((-this.b - sqrt(denta)) / (2 * this.a));
                this.soNghiem = 2;
            } else if (denta == 0) {
                nghiem[0] = -b / (2 * a);
                this.soNghiem = 1;
            }
        }
    }

    /**
     * Hàm get số nghiệm của phương trình
     *
     * @return số nghiệm của phương trình ( = 0 nếu vô nghiệm hoặc là phương
     * trình bậc nhất vô số nghiệm)
     */
    public int getSoNghiem() {
        if (!this.isSolved) {
            this.solve();
        }
        return this.soNghiem;
    }

    /**
     * Hàm get các nghiệm của phương trình
     *
     * @return mảng float chứa các nghiệm (nếu có) của phương trình
     */
    public float[] getNghiem() {
        if (!this.isSolved) {
            this.solve();
        }
        return this.nghiem;
    }

    /**
     * Hàm toString()
     *
     * @return chuỗi string biểu thị cho đối tượng
     */
    @Override
    public String toString() {
        String nghiemToString = "[";
        if (this.soNghiem > 0) {
            for (int i = 0; i < this.soNghiem; i++) {
                nghiemToString += nghiem[i];
                if (i + 1 < this.soNghiem) {
                    nghiemToString += " ; ";
                }
            }
        }
        nghiemToString += "]";
        return "PhuongTrinhBac2{" + "a=" + a + ", b=" + b + ", c=" + c + ", nghiem=" + nghiemToString + ", isSolved=" + isSolved + '}';
    }

}
