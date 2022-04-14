package Lecture01;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#2. 누적하기, 합구하기
		
		int k31_sum; // 변수 int 선언
		k31_sum=0; // 변수 초기화
		
		for (int k31_i=1; k31_i < 101; k31_i++) {  //for문 선언 1~100까지 반복
			k31_sum = k31_sum + k31_i;				// 1~100까지의 합을 누적시키는 식
		}
		System.out.printf("#2 : %d\n" , k31_sum); // 누적 합 출력
		
		System.out.printf("#2-2 : %d\n", k31_sum/100); // 
		
		int [] k31_v = {1,2,3,4,5}; // 배열 v 선언 및 초기화
		int k31_vsum; // 변수 선언
		
		k31_vsum = 0; // 변수 초기화
		
		for (int k31_i = 0; k31_i < 5; k31_i++){ //for문 선언 5번 반복		
			k31_vsum = k31_vsum + k31_v[k31_i];	//배열 인덱스 0~4까지 반복하면서 합을 누적시킴
		}
		
		System.out.printf("#2-3 : %d\n", k31_vsum); //최종 결과값 누적 합 출력

	}

}
