
// Viết chương trình tính giai thừa số nguyên không âm 
public class GiaiThua {
	

	public static long tinhGiaithua(int n) {
        long giai_thua =1;
        if (n == 0 || n == 1) {
            return 1;
        } 
        else {
            for (int i = 2; i <= n; i++) {
                giai_thua *= i;
            }
            return giai_thua;
        }
    }
    
}

