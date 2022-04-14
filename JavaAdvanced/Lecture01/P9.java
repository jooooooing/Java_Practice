package Lecture01;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k31_MyWon = 1000000; // 내 돈 100만원 환전 (정수형)
		double k31_MoenyEx = 1238.21; // 달러 환율 (실수형)
		double k31_commission = 0.003; // 환전 수수료 0.3% (실수형)
		
		int k31_usd = (int) (k31_MyWon/k31_MoenyEx); //환전받을 달러 = 내돈 / 환율 (정수형)
		int k31_remain = (int) (k31_MyWon - k31_usd*k31_MoenyEx); // 잔돈 = 내돈 - 환전받은 달러*환율 (정수형)
		
		//출력부
		System.out.println("****************************************");
		System.out.println("수수료없이 계산");
		System.out.printf("총 한화환전금액 : %d원 => 미화 : %d달러, 잔돈 : %d원\n", k31_MyWon, k31_usd, k31_remain);
		System.out.println("****************************************");
		
		double k31_ComPerOne = k31_MoenyEx * k31_commission; // 1달러당 수수료 계산 = 환율 * 수수료
		double k31_totalCom = k31_usd * k31_ComPerOne; // 총 수수료 = 환전받을 달러 * 1달러당 수수료 
		
		
		//출력부
		System.out.println("****************************************");
		System.out.println("수수료 계산");
		System.out.printf("총 수수료 : %f원 => 미화 : %d달러, 달러당 수수료: %f원\n", k31_totalCom, k31_usd, k31_ComPerOne);
		System.out.println("****************************************");
		
		int k31_i_totalCom;
		
		if (k31_totalCom != (double)((int)k31_totalCom)) {  //
			k31_i_totalCom = (int)k31_totalCom + 1; 
		} else {
			k31_i_totalCom = (int)k31_totalCom;
		}
		
		

	}

}
