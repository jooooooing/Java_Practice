package Lecture02;

public class p13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k31_m, k31_n; // 변수 m,n 선언

		k31_m = 20; // 변수 초기화
		k31_n = 1; // 변수 초기화

		while (true) { // while 반복문 break 만날때까지 계속
			for (int k31_i = 0; k31_i < k31_m; k31_i++) { // for 반복 i가 0부터 m까지 1씩 증가하며 반복
				System.out.print(" "); // 공백 출력
			}
			for (int k31_i = 0; k31_i < k31_n; k31_i++) { // for 반복 i가 0부터 n까지 1씩 증가하며 반복
				System.out.print("*"); // * 출력
			}
			System.out.println(""); // 한 줄 띄우기
			k31_m = k31_m - 1; // m-1을 m에 대입함
			k31_n = k31_n + 2; // n+2를 n에 대입함

			if (k31_m < 0) // m이 0보다 작아지면
				break; // 반복을 끝내라
		}
	}
}
