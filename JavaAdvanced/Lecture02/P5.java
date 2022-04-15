package Lecture02;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i < 13; i++) { //반복문 1 : i가 1부터 12까지 1씩 증가하며 반복
			System.out.printf(" %d월 =>", i);  // i  몇월 출력
			for (int j = 1; j < 32; j++) { // 반복문 2 : j가 1부터 32까지 1씩 증가하며 반복
				System.out.printf("%d,", j); // j 몇일 출력
				if (i == 1 && j ==31) break; // i가 1이고 j가 31일이면 멈추고 반복문 나감
				if (i == 2 && j ==28) break; // i가 2이고 j가 28일이면 멈추고 반복문 나감
				if (i == 3 && j ==31) break; // i가 3이고 j가 31일이면 멈추고 반복문 나감
				if (i == 4 && j ==30) break; // i가 4이고 j가 30일이면 멈추고 반복문 나감
				if (i == 5 && j ==31) break; // i가 5이고 j가 31일이면 멈추고 반복문 나감
				if (i == 6 && j ==30) break; // i가 6이고 j가 30일이면 멈추고 반복문 나감
				if (i == 7 && j ==31) break; // i가 7이고 j가 31일이면 멈추고 반복문 나감
				if (i == 8 && j ==31) break; // i가 8이고 j가 31일이면 멈추고 반복문 나감
				if (i == 9 && j ==30) break; // i가 9이고 j가 30일이면 멈추고 반복문 나감
				if (i == 10 && j ==31) break; // i가 10이고 j가 31일이면 멈추고 반복문 나감
				if (i == 11 && j ==30) break; // i가 11이고 j가 30일이면 멈추고 반복문 나감
				if (i == 12 && j ==31) break; // i가 12이고 j가 31일이면 멈추고 반복문 나감
			}
			System.out.println(); // 한칸 띄우기
		}

	}

}
