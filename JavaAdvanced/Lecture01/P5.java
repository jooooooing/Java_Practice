package Lecture01;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// # 5. 소수점 이하에서는 어떻게 될까?
		int k31_MyVal = 14 / 5; // 이 값은 2.8이지만 소수점 이하 버리면2, 반올림하면 3

		System.out.printf("#5-1 : %d\n", k31_MyVal); // 정수형 출력
		double k31_MyValF; // 실수형 변수 선언
		k31_MyValF = 14 / 5; // 정수형태 계산 
		System.out.printf("#5-2 : %f\n", k31_MyValF); // 정수형 출력, 소수점 이하 버려져서 2
		k31_MyValF = 14.0 / 5; // 실수형태 표시후 계산 2.8
		System.out.printf("#5-3 : %f\n", k31_MyValF); // 실수형 출력 2.8
		k31_MyValF = (14.0) / 5 + 0.5;  // 2.8 + 0.5 
		System.out.printf("#5-4 : %f\n", k31_MyValF); // 실수형 3.3
		k31_MyVal = (int) ((14.0) / 5 + 0.5); // 실수형 계산 후 정수형 변환 3.3 => 3
		System.out.printf("#5-5 : %d\n", k31_MyVal); // 정수형 3

	}

}
