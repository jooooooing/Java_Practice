package Lecture02;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 13; i++) { //for 반복문 i가 1부터 13까지 1씩 증가하며 아래 반복
			System.out.printf(" %d월 =>", i); // 출력 i
			LOOP: for (int j = 1; j < 32; j++) { // LOOP라벨 j가 1부터 32까지 1씩 증가하며 아래 반복
				System.out.printf("%d, ", j); // 출력 j

				switch (i) {case 4: case 6: case 9: case 7: case 11: // i 값이 4,6,9,11일때 case
					if (j == 30) // j가 30이면
						break LOOP; // LOOP로간다.
					break; // 반복문 탈출
				case 2: // i 값이 4,6,9,11일때 case
					if (j == 28) // j가 28이면
						break LOOP; // LOOP로간다.
					break; // 반복문 탈출
				}
			}
			System.out.printf("\n"); // 한칸 띄우기
		}
	}
}
