package Lecture01;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] k31_item = {"홈런볼", "썬칩", "포카칩", "치토스", "수미칩"}; //상품목록
		int[] k31_price = {1000,2000,3000,2500,1450}; // 상품가격(단가)
		int[] k31_amount = {10, 2, 1, 3, 5}; //구매수량 변수 선언
		double k31_taxRate = 0.1; //세율 변수 선언
		
		int k31_totalSum = 0; //지불금액 변수 선언
		
		System.out.printf("*******************************************************\n"); //영수증 구분선
		System.out.printf("	       	        상품목록					 \n"); 
		System.out.printf("항목		단가	      수량	 	 합계\n");
		for (int i = 0; i < k31_item.length; i++) { //상품목록만큼 반복문 실행
			int k31_sum=k31_price[i]*k31_amount[i]; //합계  = 품목 * 구매수량
			k31_totalSum=k31_totalSum+k31_sum; // 지불금액 누적(상품 목록만큼 반복)
			System.out.printf("%.5s		%2d		%2d		%5d\n", k31_item[i], k31_price[i], k31_amount[i], k31_sum);
		}
		System.out.printf("*******************************************************\n");
		System.out.printf("지불금액 :%43d\n", k31_totalSum);
		
		int k31_totalNetPrice = (int)(k31_totalSum / (1+k31_taxRate)); //과세금액 계산 (지불금액 / (1+세율))
		System.out.printf("과세금액 :%43d\n",k31_totalNetPrice);
		int k31_tax = k31_totalSum - k31_totalNetPrice;
		System.out.printf("세    금 :%43d\n", k31_tax);
	}

}
