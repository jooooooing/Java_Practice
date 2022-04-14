package Lecture01;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// # 5. 소수점 이하에서는 어떻게 될까?
		int k31_MyVal = 14 / 5; // 이 값은 2.8이지만 소수점 이하 버리면2, 반올림하면 3
		
		System.out.printf("#5-1 : %d\n", k31_MyVal); 

		double k31_MyValF;

		k31_MyValF = 14 / 5;
		System.out.printf("#5-2 : %f\n", k31_MyValF);

		k31_MyValF = 14.0 / 5;
		System.out.printf("#5-3 : %f\n", k31_MyValF);

		k31_MyValF = (14.0) / 5 + 0.5;
		System.out.printf("#5-4 : %f\n", k31_MyValF);

		k31_MyVal = (int) ((14.0) / 5 + 0.5);
		System.out.printf("#5-5 : %d\n", k31_MyVal);

	}

}
