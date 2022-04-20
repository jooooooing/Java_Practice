package Lecture04;

public class InputData {
	
	int[] k31_i;
	String[] k31_name;
	int[] k31_kor;
	int[] k31_eng;
	int[] k31_math;
	int[] k31_sum;
	double[] k31_ave;
	
	InputData(int a) {
		k31_i = new int[a];
		k31_name = new String[a];
		k31_kor = new int[a];
		k31_eng = new int[a];
		k31_math = new int[a];
		k31_sum = new int[a];
		k31_ave = new double[a];
	}

	public void SetData(int a, String b, int c, int d, int e) {
		k31_i[a] = a;
		k31_name[a] = b;
		k31_kor[a] = c;
		k31_eng[a] = d;
		k31_math[a] = e;
		k31_sum[a] = c + d + e;
		k31_ave[a] = (c + d + e) / 3;

	}

}
