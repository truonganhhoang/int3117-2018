public class Model {
	public int addNumber(int a, int b) {
		return a + b;
	}

	public boolean checkLogin(String username, String password) {
		boolean check = false;
		if ("darkness".equals(username) && "123456".equals(password))
			check = true;
		return check;
	}

	public int[] addArrayIndex(int[] arr) {
		int[] newArray = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			newArray[i] = arr[i] + 2;
		}

		return newArray;
	}
}

