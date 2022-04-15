package Lecture02;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] k31_units = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"}; // 배열 선언 및 입력
		for (int k31_i = 0; k31_i < 101; k31_i++) { // for 반복 i가 0부터 100까지 1씩 증가하며 아래 반복
			if (k31_i >= 0 && k31_i < 10) { // 만약 i가 0이상이고 10보다 작으면
				System.out.printf("일의자리 : %s\n", k31_units[k31_i]); // 일의자리 : i를 반복하며 출력
			} else if (k31_i >= 10 && k31_i < 100) { // i가 10 이상이고 100보다 작으면
				int k31_i10, k31_i0; // 변수 선언
				k31_i10 = k31_i / 10; // 십의자리는 i /10 => 1 ~ 10
				k31_i0 = k31_i % 10; // 일의자리는 i를 10으로 나눈 나머지 =>1 ~10
				if (k31_i0 == 0) { // 일의자리가 0이면
					System.out.printf("십의자리 : %s십\n", k31_units[k31_i10]); // 출력 : "십의자리 + 십", 배열
				} else { // 일의자리가 0이 아닐때
					System.out.printf("십의자리 : %s십%s\n", k31_units[k31_i10], k31_units[k31_i0]); // 출력 : "십의자리 + 십", // 배열[i10], 배열[i0]
				}
			} else { // 101 이후 반복 종료 시
				System.out.printf("==> %d\n", k31_i); // 출력
			}
		}
	}

}
