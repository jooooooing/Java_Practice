package Lecture02;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k31_A, k31_B; // ���� ����

		k31_A = 0; //���� A�ʱ�ȭ
		while (true) { 	//while �ݺ��� true�̸� break���������� ��� ��
			k31_B = 0; //���� B�ʱ�ȭ
			while (true) { //while �ݺ� true�̸� breka���������� ��� ��
				System.out.print("*"); // * ���
				if (k31_A == k31_B) // ���� A�� B�� ���ٸ�
					break; // break�ض�
				k31_B++; // ���� B�� A��B�� ���� ������ +1�� �ݺ���
			}
			System.out.println(); // �ٹٲ�
			k31_A++; // A�� +1
			if (k31_A == 30) // A�� 30�� �����ϸ�
				break; //����
		}
	}
}
