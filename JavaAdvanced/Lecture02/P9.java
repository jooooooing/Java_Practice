package Lecture02;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] k31_units = {"��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��"}; // �迭 ���� �� �Է�
		for (int k31_i = 0; k31_i < 101; k31_i++) { // for �ݺ� i�� 0���� 100���� 1�� �����ϸ� �Ʒ� �ݺ�
			if (k31_i >= 0 && k31_i < 10) { // ���� i�� 0�̻��̰� 10���� ������
				System.out.printf("�����ڸ� : %s\n", k31_units[k31_i]); // �����ڸ� : i�� �ݺ��ϸ� ���
			} else if (k31_i >= 10 && k31_i < 100) { // i�� 10 �̻��̰� 100���� ������
				int k31_i10, k31_i0; // ���� ����
				k31_i10 = k31_i / 10; // �����ڸ��� i /10 => 1 ~ 10
				k31_i0 = k31_i % 10; // �����ڸ��� i�� 10���� ���� ������ =>1 ~10
				if (k31_i0 == 0) { // �����ڸ��� 0�̸�
					System.out.printf("�����ڸ� : %s��\n", k31_units[k31_i10]); // ��� : "�����ڸ� + ��", �迭
				} else { // �����ڸ��� 0�� �ƴҶ�
					System.out.printf("�����ڸ� : %s��%s\n", k31_units[k31_i10], k31_units[k31_i0]); // ��� : "�����ڸ� + ��", // �迭[i10], �迭[i0]
				}
			} else { // 101 ���� �ݺ� ���� ��
				System.out.printf("==> %d\n", k31_i); // ���
			}
		}
	}

}
