package Lecture02;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k31_iVal; // ���� ���� 
		for (int k31_i = 0; k31_i < 300; k31_i++) { //for �ݺ� i�� 0���� 299���� (300��) 1�� �����ϸ� �ݺ�
			k31_iVal = 5 * k31_i; // iVal = 5 * i
			if (k31_iVal >= 00 && k31_iVal < 10) { // iVal�� 0���� ũ�ų� ������ or 10���� ������
				System.out.printf("�� %d\n", k31_iVal); //��� ��
			} else if (k31_iVal >= 10 && k31_iVal < 100) {  // iVal�� 10���� ũ�ų� ������ or 100���� ������
				System.out.printf("�� %d\n", k31_iVal); //��� ��
			} else if (k31_iVal >= 100 && k31_iVal < 1000) { // iVal�� 100���� ũ�ų� ������ or 1000���� ������
				System.out.printf("�� %d\n", k31_iVal); //��� ��
			} else {  //ival�� 1000���� ũ�ų� ������
				System.out.printf("õ %d\n", k31_iVal); //��� õ
			}
		}

	}

}
