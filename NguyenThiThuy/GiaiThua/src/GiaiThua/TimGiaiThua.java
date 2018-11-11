package GiaiThua;

public class TimGiaiThua {
	public long GiaiThua(int n) {
		if (n<0)
			return 0;
		long tich = 1;
		for(int i=1; i<=n; i++)
			tich = tich * i;
		return tich;
	}
	
	public static void main(String[] args) {
		TimGiaiThua t = new TimGiaiThua();
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;		
		System.out.println(t.GiaiThua(20));
	}
}
