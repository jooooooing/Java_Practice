package Lecture02;

public class p13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k31_m, k31_n; // ���� m,n ����

		k31_m = 20; // ���� �ʱ�ȭ
		k31_n = 1; // ���� �ʱ�ȭ

		while (true) { // while �ݺ��� break ���������� ���
			for (int k31_i = 0; k31_i < k31_m; k31_i++) { // for �ݺ� i�� 0���� m���� 1�� �����ϸ� �ݺ�
				System.out.print(" "); // ���� ���
			}
			for (int k31_i = 0; k31_i < k31_n; k31_i++) { // for �ݺ� i�� 0���� n���� 1�� �����ϸ� �ݺ�
				System.out.print("*"); // * ���
			}
			System.out.println(""); // �� �� ����
			k31_m = k31_m - 1; // m-1�� m�� ������
			k31_n = k31_n + 2; // n+2�� n�� ������

			if (k31_m < 0) // m�� 0���� �۾�����
				break; // �ݺ��� ������
		}
	}
}
