package Lecture01;

public class P6 {

	public static int taxcal(int val, int rate) { // ����� int�� �޼ҵ� taxcal, parameter�� int�� val�� rate,
		int ret; // ���� ����
		if (((double) val * (double) rate / 100.0) == val * rate / 100) // �Ǽ��� ���� �� * ���� == ���� �� * ���� �����ϴٸ�
			ret = val * rate / 100; // ret�� ���� �� * ����
		else // �׷��� �ʴٸ�
			ret = val * rate / 100 + 1; // ret�� ���� �� * ���� + 1
		return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k31_val = 271; // ���� ���� ��
		int k31_rate = 3; // ���� 3�ۼ�Ʈ
		int k31_tax = taxcal(k31_val, k31_rate); // ������ �޼ҵ� taxcal�� ���� ���� ��
		// ���
		System.out.printf("*****************************************\n");
		System.out.printf("�ܼ� ���� ���\n");
		System.out.printf("���� ���ݰ�� : %f\n", k31_val * k31_rate / 100.0);
		System.out.printf("�������� : %d ���� : %d �������԰��� : %d\n", k31_val, k31_tax, k31_val + k31_tax);
		System.out.printf("*****************************************\n");
	}
}
