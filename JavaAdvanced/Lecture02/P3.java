package Lecture02;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k31_i; // int 정수형 변수 선언 
		double k31_d; // double 실수형 변수 선언

		k31_i = 10 / 3; // 변수 초기화 3.3333이나 값은 3
		k31_d = 10 / 3.0; // 변수 초기화 3.33333

		if (k31_i == k31_d) { //i와 d가 같다면
			System.out.printf("eqaul\n"); // eqaul 출력
		} else {  //i와 d가 같지 않다면
			System.out.printf("Not equal[%f][%f]\n", (double) k31_i, k31_d); // Not eqaul 출력
		}

		if (k31_d == 3.333333) { // d가 3.33333과 같다면
			System.out.println("equal"); // eqaul 출력
		} else { //같지 않다면
			System.out.printf("Not equal[3.333333][%f]\n", k31_d); // Not eqaul 출력
		}

		k31_d = (int) k31_d; //변수 d에 int형으로 형변환한 d를 입력
		if (k31_i == k31_d) { // 변수 i와 int형 전환된 d가 같다면
			System.out.printf("eqaul\n"); // eqaul 출력
		} else { //같지 않다면
			System.out.printf("Not equal[%f][%f]\n", (double) k31_i, k31_d); // Not eqaul 출력
		}
		//출력
		System.out.printf("int로 인쇄[%d][%f]\n", k31_i, k31_d);
		System.out.printf("double로 인쇄[%f][%f]\n", (double) k31_i, k31_d);

		char k31_a = 'c'; // char 변수 선언 및 초기화

		if (k31_a == 'b') { // 문자형 변수 a와 문자 b가 같다면
			System.out.println("a는 b이다");
		}
		if (k31_a == 'c') { // 문자형 변수 a와 문자 c가 같다면
			System.out.println("a는 c이다");
		}
		if (k31_a == 'd') { // 문자형 변수 a와 문자 d가 같다면
			System.out.println("a는 d이다");
		}

		String k31_aa = "abcd"; // String 변수 선언 및 초기화

		if (k31_aa.equals("abcd")) { // String형 변수 aa와 문장 abcd가 같다면
			System.out.println("aa는 abcd이다");
		} else {
			System.out.println("aa는 abcd가 아니다");
		}

		boolean k31_bb = true; // boolean 변수 선언 및 초기화

		if (!!k31_bb) { // boolean 변수 선언 bb가 true가 아니고 아니면 => 즉, true이면
			System.out.println("bb가 아니고 아니면 참이다");
		} else {
			System.out.println("bb가 아니고 아니면 거짓이다");
		}
	}

}
