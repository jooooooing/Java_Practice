package Lecture02;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k31_A, k31_B; // 변수 선언

		k31_A = 0; //변수 A초기화
		while (true) { 	//while 반복문 true이면 break만날때까지 계속 됨
			k31_B = 0; //변수 B초기화
			while (true) { //while 반복 true이면 breka만날때까지 계속 됨
				System.out.print("*"); // * 출력
				if (k31_A == k31_B) // 만약 A와 B가 같다면
					break; // break해라
				k31_B++; // 변수 B는 A와B가 같지 않으면 +1이 반복됨
			}
			System.out.println(); // 줄바꿈
			k31_A++; // A에 +1
			if (k31_A == 30) // A가 30에 도달하면
				break; //종료
		}
	}
}
