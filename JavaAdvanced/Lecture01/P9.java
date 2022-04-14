package Lecture01;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k31_MyWon = 1000000; // 내 돈 100만원 환전 (정수형)
		double k31_MoenyEx = 1238.21; // 달러 환율 (실수형)
		double k31_commission = 0.003; // 환전 수수료 0.3% (실수형)
		
		int k31_usd = (int) (k31_MyWon/k31_MoenyEx); //환전받을 달러 = 내돈 / 환율 (정수형)
		int k31_remain = (int) (k31_MyWon - k31_usd*k31_MoenyEx); // 잔돈 = 내돈 - 환전받은 달러*환율 (정수형)
		
		System.out.println("****************************************");
		System.out.println("수수료없이 계산");
		System.out.printf("총 한화환전금액 : %d원 => 미화 : %d달러, 잔돈 : %d원\n", k31_MyWon, k31_usd, k31_remain);
		System.out.println("****************************************");
		

	}

}
