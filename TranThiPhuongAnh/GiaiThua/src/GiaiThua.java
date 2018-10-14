/**
 * Lop nay tinh giai thua cua mot so nguyen n (n!)
 * @author TranThiPhuongAnh
 *
 */
class GiaiThua {

	/**
	 * Ham tinh giai thua cua so nguyen n (n!)
	 * @param n so nguyen can tinh giai thua
	 * @return gia tri n!
	 */
	public int tinhGiaiThua(int n) {
		if(n < 0) {
			return 0;
		}
		if(n == 0 || n == 1) {
			return 1;
		}
		int ketQua = 1;
		for(int i = 2; i <= n; ++i) {
			ketQua = ketQua * i;
		}
		return ketQua;
	}
	
}
