package Lecture01;

public class P7 {

	public static int netprice(int price, double rate) {
		return (int) (price / (1 + rate));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k31_price = 1234; // 상품가격 변수 선언 및 초기화
		double k31_tax_rate = 0.1; // 세율 변수 선언 및 초기화

		int k31_netPrice = netprice(k31_price, k31_tax_rate); // 세전가격 변수 선언 메소드로 값 입력
		int k31_tax = k31_price - k31_netPrice; // 세금 = 소비자가격 - 세전가격
		//출력
		System.out.printf("******************************************************\n");
		System.out.printf("*         소비자가,세전가격,세금 계산                      *\n");
		System.out.printf("소비자가격: %d, 세전가격: %d, 세금 계산: %d\n", k31_price, k31_netPrice, k31_tax);
		System.out.printf("******************************************************\n");

	}

}
