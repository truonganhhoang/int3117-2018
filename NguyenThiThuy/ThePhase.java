public class ThePhase {
	public long findPhase(int n) {
		if (n<0)
			return 0;
		long phase = 1;
		for(int i=1; i<=n; i++)
			phase = phase * i;
		return phase;
	}	
}
