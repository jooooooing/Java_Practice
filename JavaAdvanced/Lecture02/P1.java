package Lecture02;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k31_sum = 0; // 변수 선언 및 초기화
		for (int k31_i = 0; k31_i < 10; k31_i++) { // for 반복 0부터 9까지 1씩 증가하며 반복
			k31_sum = k31_sum + k31_i; // sum 변수에 i를 더하면서 누적시킴
		}
		System.out.printf("sum %d\n", k31_sum); // 출력 sum

		for (int k31_j = 1; k31_j < 10; k31_j++) { // for 반복 1부터 9까지 1씩 증가하며 반복
			System.out.println("*************************************************"); // 구분선 출력
			System.out.printf("*구구단 %d 단 \n*", k31_j); //출력 j
			System.out.println("*************************************************"); // 구분선 출력
			for (int k31_k = 1; k31_k < 10; k31_k++) { // for 반복 1부터 9까지 1씩 증가하며 반복
				System.out.printf(" %d * %d = %d \n", k31_j, k31_k, k31_j * k31_k); // 출력 단 * 배수 = 결과
			}
		}
	}
}
