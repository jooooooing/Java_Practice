package Lecture02;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k31_iVal; // 변수 선언 
		for (int k31_i = 0; k31_i < 300; k31_i++) { //for 반복 i가 0부터 299까지 (300번) 1씩 증가하며 반복
			k31_iVal = 5 * k31_i; // iVal = 5 * i
			if (k31_iVal >= 00 && k31_iVal < 10) { // iVal이 0보다 크거나 같을때 or 10보다 작을때
				System.out.printf("일 %d\n", k31_iVal); //출력 일
			} else if (k31_iVal >= 10 && k31_iVal < 100) {  // iVal이 10보다 크거나 같을때 or 100보다 작을때
				System.out.printf("십 %d\n", k31_iVal); //출력 십
			} else if (k31_iVal >= 100 && k31_iVal < 1000) { // iVal이 100보다 크거나 같을때 or 1000보다 작을때
				System.out.printf("백 %d\n", k31_iVal); //출력 백
			} else {  //ival이 1000보다 크거나 같을때
				System.out.printf("천 %d\n", k31_iVal); //출력 천
			}
		}

	}

}
