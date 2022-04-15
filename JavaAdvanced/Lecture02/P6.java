package Lecture02;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 13; i++) { // for문 i가 1부터 13까지 1부터 증가하면서 반복
			System.out.printf(" %d월 => ", i); // 출력 : 월
			for (int j = 1; j < 32; j++) { // for문 j가 1부터 32까지 1부터 증가하면서 반복
				System.out.printf("%d, ", j); // 출력 : 일
				if (i == 4 || i == 6 || i == 7 || i == 11) { // i가 4 또는 6 또는 7 또는 11이고
					if (j == 30) // j가 30이면
						break; // 반복 멈추고 탈출 -> 22행으로
				}

				if (i == 2) { // i가 2월이고
					if (j == 28) // j가 28이면
						break; // 반복 멈추고 탈출 -> 22행으로
				}
			}
			System.out.println(); // 한칸 띄우기
		}
	}
}
