public class ThePhase {
	public long findPhase(int n) {
		if (n<0)
			return 0;
		long phase = 1;
		for(int i=1; i<=n; i++)
			phase = phase * i;
		return phase;
	}
	
	public static void main(String[] args) {
		ThePhase p = new ThePhase();
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;		
		System.out.println(p.findPhase(20));
	}
}
