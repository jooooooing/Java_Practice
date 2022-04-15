package Lecture02;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] k31_iLMD = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 배열 선언

		for (int i = 1; i < 13; i++) { // for 반복 i가 1부터 13까지 1씩 증가하며 반복
			System.out.printf(" %d월 =>", i); // 출력 i
			for (int j = 1; j < 32; j++) { // for 반복 j가 1부터 32까지 1씩 증가하며 반복
				System.out.printf("%d", j); // 출력 j

				if (k31_iLMD[i - 1] == j) { // 배열값이 j와 같으면 break, 배열값 == 마지막 날짜이면 콤마를 안찍기 위해서
					break;  	
				} 
				
				System.out.printf(","); //날짜뒤에 콤마찍기
				
			}
			System.out.println(); // 한 칸 띄우기
		}

	}

}
