public class Prime {
	
	private static boolean check_prime(int k) {
		if(k<2) {
			return false;
		}else {
			int root = (int)Math.sqrt(k);
			for(int i=2; i<=root; i++) {
				if(k%i==0) {
					return false;
				}
			}
		}
		return true;
    }
}