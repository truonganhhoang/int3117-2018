package main;

public class Sort {
	public  int[] bubble_sort(int[]a){
		int n = a.length;
		for(int i=n-1; i> 0; i--) {
			for(int j=0; j<i; j++) {
				if(a[j]>a[j+1]) {
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1]=tmp;
				}
			}
		}
		return a;
	}
	
	public int[] quick_sort(int[]a, int left, int right) {
		if (left<right) {
		int i=left+1;
		int j= right;
		int pivot = a[left];
		do {
		while (a[i]<=pivot && i<=j) i++;
		while (a[j]>pivot && j>=i) j--;
		if (i<j) {
			int tmp = a[i];
			a[i] = a[j];
			a[j] = tmp;
			i++; j--;
		}
		} while(i<=j);
		a[left] = a[j];
		a[j] = pivot;
		
		quick_sort(a, left, j-1);
		quick_sort(a, j+1, right);
		}
		return a;
	}
	
}


