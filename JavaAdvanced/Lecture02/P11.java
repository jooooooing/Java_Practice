package Lecture02;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int k31_i = 0; k31_i < 10; k31_i++) { // for 문 i가 0부터 10까지 1씩 증가하며 아래 반복
			for (int k31_j = 0; k31_j < k31_i; k31_j++) { // 이중 for문 i가 0부터 10까지 증가할 때 j도 0부터 i까지 1씩증가하며 아래 반복
				System.out.print(" "); // 빈칸, 띄어쓰기 입력
			}
			System.out.printf("%d\n", k31_i); // 행값(i) 출력
		}
	}
}
