package Lecture01;

public class P7 {

	public static int netprice(int price, double rate) {
		return (int) (price / (1 + rate));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k31_price = 1234; // ��ǰ���� ���� ���� �� �ʱ�ȭ
		double k31_tax_rate = 0.1; // ���� ���� ���� �� �ʱ�ȭ

		int k31_netPrice = netprice(k31_price, k31_tax_rate); // �������� ���� ���� �޼ҵ�� �� �Է�
		int k31_tax = k31_price - k31_netPrice; // ���� = �Һ��ڰ��� - ��������
		//���
		System.out.printf("******************************************************\n");
		System.out.printf("*         �Һ��ڰ�,��������,���� ���                      *\n");
		System.out.printf("�Һ��ڰ���: %d, ��������: %d, ���� ���: %d\n", k31_price, k31_netPrice, k31_tax);
		System.out.printf("******************************************************\n");

	}

}
