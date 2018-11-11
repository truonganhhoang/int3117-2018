package source;

public class BCNN {

	public int bcnn(int a, int b) {
		int tmp = a * b;
		if (a == 0)
			return b;
		else if (b == 0)
			return a;
		while (a != 0 && b != 0) {
			if (a > b)
				a = a % b;
			else
				b = b % a;
		}
		int bcnn = tmp / (a + b);
		return bcnn;
	}

}
