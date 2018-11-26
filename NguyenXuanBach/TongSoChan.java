
public class TongSoChan {
	public static long tongSoChan(int m) {
		long tong = 0;
		if(m == 0 || m == 1) {
			return tong;
		}
		for(int i = 1; i <= m; i++) {
			if(i % 2 == 0) {
				tong += i;
			}
		}
		return tong;
	}
	public static void main(String[] args) {
		System.out.print(tongSoChan(4));
	}
}
