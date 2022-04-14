package Lecture01;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k31_ii = 1000/3; // 정수형 변수 ii를 선언하면서 초기화 333.3333 -> 333만 남음
		System.out.printf("#3-1 : %d\n", k31_ii); // 출력
		k31_ii = 1000%3; // 1000으로나눈 나머지 대입
		System.out.printf("#3-2 : %d\n", k31_ii); // 출력

		for (int k31_i = 0; k31_i <20 ; k31_i++) { //for문 20번 반복
			System.out.printf("#3-3 : %d ", k31_i); 
			
			if (((k31_i+1)%5)==0) { // 5의 배수일 때 행바꿈 출력
				System.out.print("\n");
			}
		}
	}

}
