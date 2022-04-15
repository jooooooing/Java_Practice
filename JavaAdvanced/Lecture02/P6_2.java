package Lecture02;

public class P6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int k31_i = 1; k31_i < 13; k31_i++) { // for1 반복문 i는 1부터 12까지 1씩 증가하며 반복
			System.out.printf(" %d월 =>", k31_i); //출력 i월
			for (int k31_j = 1; k31_j < 32; k31_j++) { //for2 반복문 j가 1부터 31까지 1씩 증가하며 반복
				System.out.printf("%d, ", k31_j); // 출력 j일

				if ((k31_i == 4 || k31_i == 6 || k31_i == 9 | k31_i == 7 || k31_i == 11) && (k31_j == 30)) //i가  4 or 6 or 9 or 7 or 11이면
					break; //break for2 반복 탈출
				if (k31_i == 2 && k31_j == 28) //i가 2 and j가 28이면
					break; //break for2 반복 탈출
			}
			System.out.println(); // 한 줄 띄우기
		}
	}
}
