package Lecture01;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k31_MyWon = 1000000; // �� �� 100���� ȯ�� (������)
		double k31_MoenyEx = 1238.21; // �޷� ȯ�� (�Ǽ���)
		double k31_commission = 0.003; // ȯ�� ������ 0.3% (�Ǽ���)
		
		int k31_usd = (int) (k31_MyWon/k31_MoenyEx); //ȯ������ �޷� = ���� / ȯ�� (������)
		int k31_remain = (int) (k31_MyWon - k31_usd*k31_MoenyEx); // �ܵ� = ���� - ȯ������ �޷�*ȯ�� (������)
		
		System.out.println("****************************************");
		System.out.println("��������� ���");
		System.out.printf("�� ��ȭȯ���ݾ� : %d�� => ��ȭ : %d�޷�, �ܵ� : %d��\n", k31_MyWon, k31_usd, k31_remain);
		System.out.println("****************************************");
		

	}

}
