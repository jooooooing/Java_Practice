package Lecture02;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double k31_fSin; //변수 선언

//		for (int k31_i = 0; k31_i < 360; k31_i++) { // for문 i는 0부터 359까지 1씩 증가하며 반복
//			k31_fSin = Math.sin(k31_i * 3.141592 / 180); //fsin에 i * 파이/180을 대입
//			System.out.printf("%d sin ==> %f\n", k31_i, k31_fSin); // i sin은 fSin
//		}
		for (int k31_i = 0; k31_i < 360; k31_i++) { //for문 i는 0부터 359까지 1씩 증가하며 반복
			k31_fSin = Math.sin(k31_i * 3.141592 / 180); //fsin에 i * 파이/180을 대입
			int k31_iSpace = (int) ((1.0 - k31_fSin) * 50); // iSpace에 정수형 (1-fSin * 50)을 대입
			for (int k31_j = 0; k31_j < k31_iSpace; k31_j++) { //for문 j는 0부터 iSpace까지 1씩 증가하며 반복 
				System.out.printf(" "); //빈칸 출력
			}
				System.out.printf("*[%f][%d]\n", k31_fSin, k31_iSpace); //*, fSin, iSpace 값 출력			
		}
	}
}
