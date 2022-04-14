package Lecture01;

public class P6 {

	public static int taxcal(int val, int rate) { // 결과값 int인 메소드 taxcal, parameter는 int형 val과 rate,
		int ret; // 변수 선언
		if (((double) val * (double) rate / 100.0) == val * rate / 100) // 실수형 물건 값 * 세율 == 물건 값 * 세율 동일하다면
			ret = val * rate / 100; // ret은 물건 값 * 세율
		else // 그렇지 않다면
			ret = val * rate / 100 + 1; // ret는 물건 값 * 세율 + 1
		return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k31_val = 271; // 세전 물건 값
		int k31_rate = 3; // 세금 3퍼센트
		int k31_tax = taxcal(k31_val, k31_rate); // 세금은 메소드 taxcal을 통해 계산된 값
		// 출력
		System.out.printf("*****************************************\n");
		System.out.printf("단순 세금 계산\n");
		System.out.printf("실제 세금계산 : %f\n", k31_val * k31_rate / 100.0);
		System.out.printf("세전가격 : %d 세금 : %d 세금포함가격 : %d\n", k31_val, k31_tax, k31_val + k31_tax);
		System.out.printf("*****************************************\n");
	}
}
