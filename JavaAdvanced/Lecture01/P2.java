package Lecture01;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#2. 누적하기, 합구하기
		
		int k31_sum; // 변수 int 선언
		k31_sum=0; // 변수 초기화
		
		for (int k31_i=1; k31_i < 101; k31_i++) {
			k31_sum = k31_sum + k31_i;
		}
		System.out.printf("#2 : %d\n" , k31_sum);
		
		System.out.printf("#2-2 : %d\n", k31_sum/100);
		
		int [] k31_v = {1,2,3,4,5};
		int k31_vsum;
		
		k31_vsum = 0;
		
		for (int k31_i = 0; k31_i < 5; k31_i++){			
			k31_vsum = k31_vsum + k31_v[k31_i];	
		}
		
		System.out.printf("#2-3 : %d\n", k31_vsum);

	}

}
