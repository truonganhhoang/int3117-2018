package demotest;

import java.io.*;
import java.util.*;

public class DemoTest {
	public int[] quickSort(int[] a, int l, int r) {
		int key = a[(l + r) / 2], i = l, j = r;
		while (i <= j) {
			while (a[i] < key)i++;
			while (a[j] > key)j--;
			if (i <= j) {
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
				i++;
				j--;
			}
		}
		if (i < r)quickSort(a, i, r);
		if (l < j)quickSort(a, l, j);
		return a;
	}
}
