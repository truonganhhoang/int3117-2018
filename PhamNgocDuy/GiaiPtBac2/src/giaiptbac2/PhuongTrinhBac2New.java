package giaiptbac2;

import static java.lang.Math.sqrt;

public class PhuongTrinhBac2New{

	public static void main(String []args){
		System.out.println(solve(1.0f,3.0f,2.0f));
	}
	public static String solve(float a, float b, float c) {
		int soNghiem = 0;
		float[] nghiem = new float[2];

		if (a == 0) {

			if (b != 0) {
				nghiem[0] = -c / b;
				soNghiem = 1;
			}
		} else {
			float denta = b * b - 4 * a * c;

			if (denta > 0) {
				nghiem[0] = (float) ((-b + sqrt(denta)) / (2 * a));
				nghiem[1] = (float) ((-b - sqrt(denta)) / (2 * a));
				soNghiem = 2;

			} else if (denta == 0) {
				nghiem[0] = -b / (2 * a);
				soNghiem = 1;
			}
		}
		String nghiemToString = "[";

		if (soNghiem > 0) {

			for (int i = 0; i < soNghiem; i++) {
				nghiemToString += nghiem[i];
				
				if (i + 1 < soNghiem) {
					nghiemToString += " ; ";
				}
			}
		}
		nghiemToString += "]";
		return "PhuongTrinhBac2{" + "a=" + a + ", b=" + b + ", c=" + c + ", nghiem=" + nghiemToString + '}';
	}
}