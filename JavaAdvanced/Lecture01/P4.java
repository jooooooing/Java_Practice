package Lecture01;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// #4 원하는 자릿수 반올림, 버림 처리
		
		int k31_ii = 12345; //12345원은 10원 이하 버려서 처리하기.
		int k31_j = (k31_ii/10) * 10; // 1234.5 => 1234 * 10 = 12340
		System.out.printf("#4-1 : %d\n", k31_j); //출력
		
		k31_ii = 12345; //12345원은 10원이하 반올림 처리
		k31_j = ((k31_ii+5)/10) *10; // 12345+5 => 12350 / 10 => 1235 * 10 = 12350 반올림 결과
		
		System.out.printf("#4-2 : %d\n", k31_j); // 출력
		
		k31_ii = 12344; // 변수 입력
		k31_j = ((k31_ii+5)/10) * 10; // 12349 /10 => 1234.9 * 10 => 12340 : 반올림 시 버림 결과
		
		System.out.printf("#4-2 : %d\n", k31_j); // 출력
		
		

	}

}
