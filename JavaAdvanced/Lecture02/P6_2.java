package Lecture02;

public class P6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int k31_i = 1; k31_i < 13; k31_i++) { // for1 �ݺ��� i�� 1���� 12���� 1�� �����ϸ� �ݺ�
			System.out.printf(" %d�� =>", k31_i); //��� i��
			for (int k31_j = 1; k31_j < 32; k31_j++) { //for2 �ݺ��� j�� 1���� 31���� 1�� �����ϸ� �ݺ�
				System.out.printf("%d, ", k31_j); // ��� j��

				if ((k31_i == 4 || k31_i == 6 || k31_i == 9 | k31_i == 7 || k31_i == 11) && (k31_j == 30)) //i��  4 or 6 or 9 or 7 or 11�̸�
					break; //break for2 �ݺ� Ż��
				if (k31_i == 2 && k31_j == 28) //i�� 2 and j�� 28�̸�
					break; //break for2 �ݺ� Ż��
			}
			System.out.println(); // �� �� ����
		}
	}
}
