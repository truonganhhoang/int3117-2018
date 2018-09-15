package Demotest;
public class Demo {
	public int max(int a, int b) {
		if(a>=b)
			return a;
		else
			return b;
		}
	public int min (int arr[]) {
		int minNum =arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<minNum)
				minNum=arr[i];
		}
		return minNum;
	}
	}
